package com.bridj;

import java.io.FileNotFoundException;
import java.util.Collection;

import com.bridj.ann.Library;
import com.bridj.ann.Mangling;
import com.bridj.ann.PointerSized;
import com.bridj.ann.This;
import com.bridj.ann.Virtual;

///http://www.codesourcery.com/public/cxx-abi/cxx-vtable-ex.html
public class TestCPP {
	static String libraryPath = JNI.isMacOSX() ? 
		"/Users/ochafik/nativelibs4java/Runtime/BridJ/src/test/resources/darwin_universal/libtest.dylib" :
		//"F:\\Experiments\\tmp\\key\\svn\\nativelibs4java\\Runtime\\BridJ\\src\\test\\resources\\win32\\test.dll" +
        "C:\\Users\\Olivier\\Prog\\nativelibs4java\\Runtime\\BridJ\\src\\main\\cpp\\buildsys\\vs2008\\x64\\Debug\\test.dll"
	;
	static NativeLibrary library = NativeLibrary.load(libraryPath);
	
	static void print(String name, long addr, int n, int minI) {
		System.out.println(name);
		for (int i = -1; i < n; i++) {
			long v = getPtr(addr + i * Pointer.SIZE);
			System.out.println("\tOffset " + i + ":\t" + hex(v) + " \t('" + library.getSymbolName(v) + "')");
			if (v == 0 && i >= minI)
				break;
		}
		System.out.println();
	}
	public static void main(String[] args) throws Exception {
		
		for (String name : library.getSymbols()) {
			long addr = library.getSymbolAddress(name);
			System.out.println(name + " = \t" + hex(addr));
			
			if (name.startsWith("_ZTV") || name.startsWith("_ZTI") || name.startsWith("??_")) {
				print("vtable", addr, 10, 1);
			}
		}
		
		boolean is64 = JNI.is64Bits();
		Ctest test = new Ctest();
		long thisPtr = test.$this.getPeer();
		System.out.println(hex(thisPtr));
		print("Ctest.this", test.$this.getSizeT(0), 10, 0);
		int res = test.testAdd(1, 2);
		System.out.println("res = " + res);
	}
	@Library("test")
	static class Ctest extends CPPObject {
		static {
			BridJ.register(Ctest.class);
		}
		//static final CPPObjectIO<Ctest> $io = new CPPObjectIO<Ctest>(library, Ctest.class);

		@Mangling("_Z10createTestv")
		static native @PointerSized long createTest();
		

		public Ctest() {
			super(Pointer.pointerToAddress(createTest()));
		}
		public Ctest(Pointer<?> peer) {
			super(peer);
		}
		@Virtual
		protected static native int testAdd(@This long thisPtr, int a, int b);
		public int testAdd(int a, int b) {
			print("this", $this.getPeer(), 10, 10);
			print("*this", $this.getPointer(0).getPeer(), 10, 10);
			return testAdd($this.getPeer(), a, b);
		}
	}
	
	static String hex(long v) {
		String s = Long.toString(v, 16);
		while ((s.length() < 16))
			s = "0" + s;
		return s;
	}
	static long getPtr(long peer) {
		if (JNI.is64Bits())
			return JNI.get_long(peer);
		else
			return JNI.get_int(peer);
	}
}