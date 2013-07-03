/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nativelibs4java.opencl.library;

import org.bridj.Pointer;
import org.bridj.SizeT;
import org.bridj.ann.Optional;
import org.bridj.ann.Ptr;

/**
 *
 * @author ochafik
 */
public interface IOpenCLLibrary {

    /// Original signature : <code>cl_int clBuildProgram(cl_program, cl_uint, const cl_device_id*, const char*, clBuildProgram_arg1_callback, void*)</code>
    int clBuildProgram(@Ptr long cl_program1, int cl_uint1, @Ptr long cl_device_idPtr1, @Ptr long charPtr1, @Ptr long arg1, @Ptr long voidPtr1);

    /// Original signature : <code>cl_int clCompileProgram(cl_program, cl_uint, const cl_device_id*, const char*, cl_uint, const cl_program*, const char**, clCompileProgram_arg1_callback, void*)</code>
    @Optional
    int clCompileProgram(OpenCLLibrary.cl_program cl_program1, int cl_uint1, Pointer<OpenCLLibrary.cl_device_id> cl_device_idPtr1, Pointer<Byte> charPtr1, int cl_uint2, Pointer<OpenCLLibrary.cl_program> cl_programPtr1, Pointer<Pointer<Byte>> charPtrPtr1, Pointer<OpenCLLibrary.clCompileProgram_arg1_callback> arg1, Pointer<?> voidPtr1);

    /**
     * Memory Object APIs<br>
     * Original signature : <code>cl_mem clCreateBuffer(cl_context, cl_mem_flags, size_t, void*, cl_int*)</code>
     */
    @Ptr
    long clCreateBuffer(@Ptr long cl_context1, long cl_mem_flags1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long cl_intPtr1);

    /**
     * Command Queue APIs<br>
     * Original signature : <code>cl_command_queue clCreateCommandQueue(cl_context, cl_device_id, cl_command_queue_properties, cl_int*)</code>
     */
    @Ptr
    long clCreateCommandQueue(@Ptr long cl_context1, @Ptr long cl_device_id1, long cl_command_queue_properties1, @Ptr long cl_intPtr1);

    /**
     * Context APIs<br>
     * Original signature : <code>cl_context clCreateContext(const cl_context_properties*, cl_uint, const cl_device_id*, clCreateContext_arg1_callback, void*, cl_int*)</code>
     */
    @Ptr
    long clCreateContext(@Ptr long cl_context_propertiesPtr1, int cl_uint1, @Ptr long cl_device_idPtr1, @Ptr long arg1, @Ptr long voidPtr1, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_context clCreateContextFromType(const cl_context_properties*, cl_device_type, clCreateContextFromType_arg1_callback, void*, cl_int*)</code>
    OpenCLLibrary.cl_context clCreateContextFromType(Pointer<Pointer<Integer>> cl_context_propertiesPtr1, long cl_device_type1, Pointer<OpenCLLibrary.clCreateContextFromType_arg1_callback> arg1, Pointer<?> voidPtr1, Pointer<Integer> cl_intPtr1);

    /// Original signature : <code>cl_event clCreateEventFromGLsyncKHR(cl_context, cl_GLsync, cl_int*)</code>
    @Optional
    OpenCLLibrary.cl_event clCreateEventFromGLsyncKHR(OpenCLLibrary.cl_context cl_context1, OpenCLLibrary.cl_GLsync cl_GLsync1, Pointer<Integer> cl_intPtr1);

    /// Original signature : <code>cl_mem clCreateFromGLBuffer(cl_context, cl_mem_flags, cl_GLuint, int*)</code>
    @Optional
    @Ptr
    long clCreateFromGLBuffer(@Ptr long cl_context1, long cl_mem_flags1, int cl_GLuint1, @Ptr long intPtr1);

    /// Original signature : <code>cl_mem clCreateFromGLRenderbuffer(cl_context, cl_mem_flags, cl_GLuint, cl_int*)</code>
    @Optional
    @Ptr
    long clCreateFromGLRenderbuffer(@Ptr long cl_context1, long cl_mem_flags1, int cl_GLuint1, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_mem clCreateFromGLTexture(cl_context, cl_mem_flags, cl_GLenum, cl_GLint, cl_GLuint, cl_int*)</code>
    @Optional
    @Ptr
    long clCreateFromGLTexture(@Ptr long cl_context1, long cl_mem_flags1, int cl_GLenum1, int cl_GLint1, int cl_GLuint1, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_mem clCreateFromGLTexture2D(cl_context, cl_mem_flags, cl_GLenum, cl_GLint, cl_GLuint, cl_int*)</code>
    @Optional
    @Ptr
    long clCreateFromGLTexture2D(@Ptr long cl_context1, long cl_mem_flags1, int cl_GLenum1, int cl_GLint1, int cl_GLuint1, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_mem clCreateFromGLTexture3D(cl_context, cl_mem_flags, cl_GLenum, cl_GLint, cl_GLuint, cl_int*)</code>
    @Optional
    @Ptr
    long clCreateFromGLTexture3D(@Ptr long cl_context1, long cl_mem_flags1, int cl_GLenum1, int cl_GLint1, int cl_GLuint1, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_mem clCreateImage(cl_context, cl_mem_flags, const cl_image_format*, const cl_image_desc*, void*, cl_int*)</code>
    @Optional
    @Ptr
    long clCreateImage(@Ptr long cl_context1, long cl_mem_flags1, @Ptr long cl_image_formatPtr1, @Ptr long cl_image_descPtr1, @Ptr long voidPtr1, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_mem clCreateImage2D(cl_context, cl_mem_flags, const cl_image_format*, size_t, size_t, size_t, void*, cl_int*)</code>
    @Ptr
    long clCreateImage2D(@Ptr long cl_context1, long cl_mem_flags1, @Ptr long cl_image_formatPtr1, @Ptr long size_t1, @Ptr long size_t2, @Ptr long size_t3, @Ptr long voidPtr1, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_mem clCreateImage3D(cl_context, cl_mem_flags, const cl_image_format*, size_t, size_t, size_t, size_t, size_t, void*, cl_int*)</code>
    @Ptr
    long clCreateImage3D(@Ptr long cl_context1, long cl_mem_flags1, @Ptr long cl_image_formatPtr1, @Ptr long size_t1, @Ptr long size_t2, @Ptr long size_t3, @Ptr long size_t4, @Ptr long size_t5, @Ptr long voidPtr1, @Ptr long cl_intPtr1);

    /**
     * Kernel Object APIs<br>
     * Original signature : <code>cl_kernel clCreateKernel(cl_program, const char*, cl_int*)</code>
     */
    @Ptr
    long clCreateKernel(@Ptr long cl_program1, @Ptr long charPtr1, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_int clCreateKernelsInProgram(cl_program, cl_uint, cl_kernel*, cl_uint*)</code>
    int clCreateKernelsInProgram(@Ptr long cl_program1, int cl_uint1, @Ptr long cl_kernelPtr1, @Ptr long cl_uintPtr1);

    /// Original signature : <code>cl_program clCreateProgramWithBinary(cl_context, cl_uint, const cl_device_id*, const size_t*, const unsigned char**, cl_int*, cl_int*)</code>
    @Ptr
    long clCreateProgramWithBinary(@Ptr long cl_context1, int cl_uint1, @Ptr long cl_device_idPtr1, @Ptr long size_tPtr1, @Ptr long charPtrPtr1, @Ptr long cl_intPtr1, @Ptr long cl_intPtr2);

    /// Original signature : <code>cl_program clCreateProgramWithBuiltInKernels(cl_context, cl_uint, const cl_device_id*, const char*, cl_int*)</code>
    @Optional
    OpenCLLibrary.cl_program clCreateProgramWithBuiltInKernels(OpenCLLibrary.cl_context cl_context1, int cl_uint1, Pointer<OpenCLLibrary.cl_device_id> cl_device_idPtr1, Pointer<Byte> charPtr1, Pointer<Integer> cl_intPtr1);

    /**
     * Program Object APIs<br>
     * Original signature : <code>cl_program clCreateProgramWithSource(cl_context, cl_uint, const char**, const size_t*, cl_int*)</code>
     */
    @Ptr
    long clCreateProgramWithSource(@Ptr long cl_context1, int cl_uint1, @Ptr long charPtrPtr1, @Ptr long size_tPtr1, @Ptr long cl_intPtr1);

    /**
     * Sampler APIs<br>
     * Original signature : <code>cl_sampler clCreateSampler(cl_context, cl_bool, cl_addressing_mode, cl_filter_mode, cl_int*)</code>
     */
    @Ptr
    long clCreateSampler(@Ptr long cl_context1, int cl_bool1, int cl_addressing_mode1, int cl_filter_mode1, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_mem clCreateSubBuffer(cl_mem, cl_mem_flags, cl_buffer_create_type, const void*, cl_int*)</code>
    @Optional
    @Ptr
    long clCreateSubBuffer(@Ptr long cl_mem1, long cl_mem_flags1, int cl_buffer_create_type1, @Ptr long voidPtr1, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_int clCreateSubDevices(cl_device_id, const cl_device_partition_property*, cl_uint, cl_device_id*, cl_uint*)</code>
    @Optional
    int clCreateSubDevices(OpenCLLibrary.cl_device_id cl_device_id1, Pointer<Pointer<Integer>> cl_device_partition_propertyPtr1, int cl_uint1, Pointer<OpenCLLibrary.cl_device_id> cl_device_idPtr1, Pointer<Integer> cl_uintPtr1);

    /// Original signature : <code>cl_int clCreateSubDevicesEXT(cl_device_id, const cl_device_partition_property_ext*, cl_uint, cl_device_id*, cl_uint*)</code>
    @Optional
    int clCreateSubDevicesEXT(OpenCLLibrary.cl_device_id cl_device_id1, Pointer<Long> cl_device_partition_property_extPtr1, int cl_uint1, Pointer<OpenCLLibrary.cl_device_id> cl_device_idPtr1, Pointer<Integer> cl_uintPtr1);

    /// Original signature : <code>cl_event clCreateUserEvent(cl_context, cl_int*)</code>
    @Optional
    @Ptr
    long clCreateUserEvent(@Ptr long cl_context1, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_int clEnqueueAcquireGLObjects(cl_command_queue, cl_uint, const cl_mem*, cl_uint, const cl_event*, cl_event*)</code>
    @Optional
    int clEnqueueAcquireGLObjects(@Ptr long cl_command_queue1, int cl_uint1, @Ptr long cl_memPtr1, int cl_uint2, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueBarrier(cl_command_queue)</code>
    int clEnqueueBarrier(@Ptr long cl_command_queue1);

    /// Original signature : <code>cl_int clEnqueueBarrierWithWaitList(cl_command_queue, cl_uint, const cl_event*, cl_event*)</code>
    @Optional
    int clEnqueueBarrierWithWaitList(OpenCLLibrary.cl_command_queue cl_command_queue1, int cl_uint1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueCopyBuffer(cl_command_queue, cl_mem, cl_mem, size_t, size_t, size_t, cl_uint, const cl_event*, cl_event*)</code>
    int clEnqueueCopyBuffer(@Ptr long cl_command_queue1, @Ptr long cl_mem1, @Ptr long cl_mem2, @Ptr long size_t1, @Ptr long size_t2, @Ptr long size_t3, int cl_uint1, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueCopyBufferRect(cl_command_queue, cl_mem, cl_mem, const size_t*, const size_t*, const size_t*, size_t, size_t, size_t, size_t, cl_uint, const cl_event*, cl_event*)</code>
    @Optional
    int clEnqueueCopyBufferRect(OpenCLLibrary.cl_command_queue cl_command_queue1, OpenCLLibrary.cl_mem cl_mem1, OpenCLLibrary.cl_mem cl_mem2, Pointer<SizeT> size_tPtr1, Pointer<SizeT> size_tPtr2, Pointer<SizeT> size_tPtr3, @Ptr long size_t1, @Ptr long size_t2, @Ptr long size_t3, @Ptr long size_t4, int cl_uint1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueCopyBufferToImage(cl_command_queue, cl_mem, cl_mem, size_t, const size_t*, const size_t*, cl_uint, const cl_event*, cl_event*)</code>
    int clEnqueueCopyBufferToImage(OpenCLLibrary.cl_command_queue cl_command_queue1, OpenCLLibrary.cl_mem cl_mem1, OpenCLLibrary.cl_mem cl_mem2, @Ptr long size_t1, Pointer<SizeT> size_tPtr1, Pointer<SizeT> size_tPtr2, int cl_uint1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueCopyImage(cl_command_queue, cl_mem, cl_mem, const size_t*, const size_t*, const size_t*, cl_uint, const cl_event*, cl_event*)</code>
    int clEnqueueCopyImage(OpenCLLibrary.cl_command_queue cl_command_queue1, OpenCLLibrary.cl_mem cl_mem1, OpenCLLibrary.cl_mem cl_mem2, Pointer<SizeT> size_tPtr1, Pointer<SizeT> size_tPtr2, Pointer<SizeT> size_tPtr3, int cl_uint1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueCopyImageToBuffer(cl_command_queue, cl_mem, cl_mem, const size_t*, const size_t*, size_t, cl_uint, const cl_event*, cl_event*)</code>
    int clEnqueueCopyImageToBuffer(OpenCLLibrary.cl_command_queue cl_command_queue1, OpenCLLibrary.cl_mem cl_mem1, OpenCLLibrary.cl_mem cl_mem2, Pointer<SizeT> size_tPtr1, Pointer<SizeT> size_tPtr2, @Ptr long size_t1, int cl_uint1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueFillBuffer(cl_command_queue, cl_mem, const void*, size_t, size_t, size_t, cl_uint, const cl_event*, cl_event*)</code>
    @Optional
    int clEnqueueFillBuffer(OpenCLLibrary.cl_command_queue cl_command_queue1, OpenCLLibrary.cl_mem cl_mem1, Pointer<?> voidPtr1, @Ptr long size_t1, @Ptr long size_t2, @Ptr long size_t3, int cl_uint1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueFillImage(cl_command_queue, cl_mem, const void*, const size_t*, const size_t*, cl_uint, const cl_event*, cl_event*)</code>
    @Optional
    int clEnqueueFillImage(OpenCLLibrary.cl_command_queue cl_command_queue1, OpenCLLibrary.cl_mem cl_mem1, Pointer<?> voidPtr1, Pointer<SizeT> size_tPtr1, Pointer<SizeT> size_tPtr2, int cl_uint1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /// Original signature : <code>void* clEnqueueMapBuffer(cl_command_queue, cl_mem, cl_bool, cl_map_flags, size_t, size_t, cl_uint, const cl_event*, cl_event*, cl_int*)</code>
    @Ptr
    long clEnqueueMapBuffer(@Ptr long cl_command_queue1, @Ptr long cl_mem1, int cl_bool1, long cl_map_flags1, @Ptr long size_t1, @Ptr long size_t2, int cl_uint1, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2, @Ptr long cl_intPtr1);

    /// Original signature : <code>void* clEnqueueMapImage(cl_command_queue, cl_mem, cl_bool, cl_map_flags, const size_t*, const size_t*, size_t*, size_t*, cl_uint, const cl_event*, cl_event*, cl_int*)</code>
    @Ptr
    long clEnqueueMapImage(@Ptr long cl_command_queue1, @Ptr long cl_mem1, int cl_bool1, long cl_map_flags1, @Ptr long size_tPtr1, @Ptr long size_tPtr2, @Ptr long size_tPtr3, @Ptr long size_tPtr4, int cl_uint1, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2, @Ptr long cl_intPtr1);

    /// Original signature : <code>cl_int clEnqueueMarker(cl_command_queue, cl_event*)</code>
    int clEnqueueMarker(@Ptr long cl_command_queue1, @Ptr long cl_eventPtr1);

    /// Original signature : <code>cl_int clEnqueueMarkerWithWaitList(cl_command_queue, cl_uint, const cl_event*, cl_event*)</code>
    @Optional
    int clEnqueueMarkerWithWaitList(OpenCLLibrary.cl_command_queue cl_command_queue1, int cl_uint1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueMigrateMemObjects(cl_command_queue, cl_uint, const cl_mem*, cl_mem_migration_flags, cl_uint, const cl_event*, cl_event*)</code>
    @Optional
    int clEnqueueMigrateMemObjects(OpenCLLibrary.cl_command_queue cl_command_queue1, int cl_uint1, Pointer<OpenCLLibrary.cl_mem> cl_memPtr1, long cl_mem_migration_flags1, int cl_uint2, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueNDRangeKernel(cl_command_queue, cl_kernel, cl_uint, const size_t*, const size_t*, const size_t*, cl_uint, const cl_event*, cl_event*)</code>
    int clEnqueueNDRangeKernel(@Ptr long cl_command_queue1, @Ptr long cl_kernel1, int cl_uint1, @Ptr long size_tPtr1, @Ptr long size_tPtr2, @Ptr long size_tPtr3, int cl_uint2, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueNativeKernel(cl_command_queue, clEnqueueNativeKernel_arg1_callback, void*, size_t, cl_uint, const cl_mem*, const void**, cl_uint, const cl_event*, cl_event*)</code>
    int clEnqueueNativeKernel(OpenCLLibrary.cl_command_queue cl_command_queue1, Pointer<OpenCLLibrary.clEnqueueNativeKernel_arg1_callback> arg1, Pointer<?> voidPtr1, @Ptr long size_t1, int cl_uint1, Pointer<OpenCLLibrary.cl_mem> cl_memPtr1, Pointer<Pointer<?>> voidPtrPtr1, int cl_uint2, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /**
     * Enqueued Commands APIs<br>
     * Original signature : <code>cl_int clEnqueueReadBuffer(cl_command_queue, cl_mem, cl_bool, size_t, size_t, void*, cl_uint, const cl_event*, cl_event*)</code>
     */
    int clEnqueueReadBuffer(@Ptr long cl_command_queue1, @Ptr long cl_mem1, int cl_bool1, @Ptr long size_t1, @Ptr long size_t2, @Ptr long voidPtr1, int cl_uint1, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueReadBufferRect(cl_command_queue, cl_mem, cl_bool, const size_t*, const size_t*, const size_t*, size_t, size_t, size_t, size_t, void*, cl_uint, const cl_event*, cl_event*)</code>
    @Optional
    int clEnqueueReadBufferRect(OpenCLLibrary.cl_command_queue cl_command_queue1, OpenCLLibrary.cl_mem cl_mem1, int cl_bool1, Pointer<SizeT> size_tPtr1, Pointer<SizeT> size_tPtr2, Pointer<SizeT> size_tPtr3, @Ptr long size_t1, @Ptr long size_t2, @Ptr long size_t3, @Ptr long size_t4, Pointer<?> voidPtr1, int cl_uint1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueReadImage(cl_command_queue, cl_mem, cl_bool, const size_t*, const size_t*, size_t, size_t, void*, cl_uint, const cl_event*, cl_event*)</code>
    int clEnqueueReadImage(@Ptr long cl_command_queue1, @Ptr long cl_mem1, int cl_bool1, @Ptr long size_tPtr1, @Ptr long size_tPtr2, @Ptr long size_t1, @Ptr long size_t2, @Ptr long voidPtr1, int cl_uint1, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueReleaseGLObjects(cl_command_queue, cl_uint, const cl_mem*, cl_uint, const cl_event*, cl_event*)</code>
    @Optional
    int clEnqueueReleaseGLObjects(@Ptr long cl_command_queue1, int cl_uint1, @Ptr long cl_memPtr1, int cl_uint2, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueTask(cl_command_queue, cl_kernel, cl_uint, const cl_event*, cl_event*)</code>
    int clEnqueueTask(@Ptr long cl_command_queue1, @Ptr long cl_kernel1, int cl_uint1, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueUnmapMemObject(cl_command_queue, cl_mem, void*, cl_uint, const cl_event*, cl_event*)</code>
    int clEnqueueUnmapMemObject(@Ptr long cl_command_queue1, @Ptr long cl_mem1, @Ptr long voidPtr1, int cl_uint1, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueWaitForEvents(cl_command_queue, cl_uint, const cl_event*)</code>
    int clEnqueueWaitForEvents(@Ptr long cl_command_queue1, int cl_uint1, @Ptr long cl_eventPtr1);

    /// Original signature : <code>cl_int clEnqueueWriteBuffer(cl_command_queue, cl_mem, cl_bool, size_t, size_t, const void*, cl_uint, const cl_event*, cl_event*)</code>
    int clEnqueueWriteBuffer(@Ptr long cl_command_queue1, @Ptr long cl_mem1, int cl_bool1, @Ptr long size_t1, @Ptr long size_t2, @Ptr long voidPtr1, int cl_uint1, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueWriteBufferRect(cl_command_queue, cl_mem, cl_bool, const size_t*, const size_t*, const size_t*, size_t, size_t, size_t, size_t, const void*, cl_uint, const cl_event*, cl_event*)</code>
    @Optional
    int clEnqueueWriteBufferRect(OpenCLLibrary.cl_command_queue cl_command_queue1, OpenCLLibrary.cl_mem cl_mem1, int cl_bool1, Pointer<SizeT> size_tPtr1, Pointer<SizeT> size_tPtr2, Pointer<SizeT> size_tPtr3, @Ptr long size_t1, @Ptr long size_t2, @Ptr long size_t3, @Ptr long size_t4, Pointer<?> voidPtr1, int cl_uint1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr1, Pointer<OpenCLLibrary.cl_event> cl_eventPtr2);

    /// Original signature : <code>cl_int clEnqueueWriteImage(cl_command_queue, cl_mem, cl_bool, const size_t*, const size_t*, size_t, size_t, const void*, cl_uint, const cl_event*, cl_event*)</code>
    int clEnqueueWriteImage(@Ptr long cl_command_queue1, @Ptr long cl_mem1, int cl_bool1, @Ptr long size_tPtr1, @Ptr long size_tPtr2, @Ptr long size_t1, @Ptr long size_t2, @Ptr long voidPtr1, int cl_uint1, @Ptr long cl_eventPtr1, @Ptr long cl_eventPtr2);

    /// Original signature : <code>cl_int clFinish(cl_command_queue)</code>
    int clFinish(@Ptr long cl_command_queue1);

    /**
     * Flush and Finish APIs<br>
     * Original signature : <code>cl_int clFlush(cl_command_queue)</code>
     */
    int clFlush(@Ptr long cl_command_queue1);

    /// Original signature : <code>cl_int clGetCommandQueueInfo(cl_command_queue, cl_command_queue_info, size_t, void*, size_t*)</code>
    int clGetCommandQueueInfo(@Ptr long cl_command_queue1, int cl_command_queue_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetContextInfo(cl_context, cl_context_info, size_t, void*, size_t*)</code>
    int clGetContextInfo(@Ptr long cl_context1, int cl_context_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /**
     * Device APIs<br>
     * Original signature : <code>cl_int clGetDeviceIDs(cl_platform_id, cl_device_type, cl_uint, cl_device_id*, cl_uint*)</code>
     */
    int clGetDeviceIDs(@Ptr long cl_platform_id1, long cl_device_type1, int cl_uint1, @Ptr long cl_device_idPtr1, @Ptr long cl_uintPtr1);

    /// Original signature : <code>cl_int clGetDeviceInfo(cl_device_id, cl_device_info, size_t, void*, size_t*)</code>
    int clGetDeviceInfo(@Ptr long cl_device_id1, int cl_device_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetEventInfo(cl_event, cl_event_info, size_t, void*, size_t*)</code>
    int clGetEventInfo(@Ptr long cl_event1, int cl_event_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /**
     * Profiling APIs<br>
     * Original signature : <code>cl_int clGetEventProfilingInfo(cl_event, cl_profiling_info, size_t, void*, size_t*)</code>
     */
    int clGetEventProfilingInfo(@Ptr long cl_event1, int cl_profiling_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>void* clGetExtensionFunctionAddress(const char*)</code>
    Pointer<?> clGetExtensionFunctionAddress(Pointer<Byte> charPtr1);

    /**
     * Extension function access<br>
     * * Returns the extension function address for the given function name,<br>
     * or NULL if a valid function can not be found.  The client must<br>
     * check to make sure the address is not NULL, before using or <br>
     * calling the returned function address.<br>
     * Original signature : <code>void* clGetExtensionFunctionAddressForPlatform(cl_platform_id, const char*)</code>
     */
    @Optional
    Pointer<?> clGetExtensionFunctionAddressForPlatform(OpenCLLibrary.cl_platform_id cl_platform_id1, Pointer<Byte> charPtr1);

    /**
     * Apple extension for retrieving OpenGL context information for a CL context <br>
     * created via the above method.<br>
     * * Provides a query mechanism to retrieve OpenGL context specific information <br>
     * from an OpenCL context to help identify device specific mappings and usage.<br>
     * <br>
     * For example, one possible usage would be to allow the client to map a CGL <br>
     * virtual screen index to an appropriate CL device id to insure that the <br>
     * rendering device and the compute device are the same, thus guaranteeing <br>
     * any shared OpenGL memory that is attached o a CL memory object remains <br>
     * resident on the active device.<br>
     * context<br>
     * Original signature : <code>cl_int clGetGLContextInfoAPPLE(cl_context, void*, cl_gl_platform_info, size_t, void*, size_t*)</code>
     */
    @Optional
    int clGetGLContextInfoAPPLE(@Ptr long cl_context1, @Ptr long voidPtr1, int cl_gl_platform_info1, @Ptr long size_t1, @Ptr long voidPtr2, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetGLContextInfoKHR(const cl_context_properties*, cl_gl_context_info, size_t, void*, size_t*)</code>
    @Optional
    int clGetGLContextInfoKHR(@Ptr long cl_context_propertiesPtr1, int cl_gl_context_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetGLObjectInfo(cl_mem, cl_gl_object_type*, cl_GLuint*)</code>
    @Optional
    int clGetGLObjectInfo(@Ptr long cl_mem1, @Ptr long cl_gl_object_typePtr1, @Ptr long cl_GLuintPtr1);

    /// Original signature : <code>cl_int clGetGLTextureInfo(cl_mem, cl_gl_texture_info, size_t, void*, size_t*)</code>
    @Optional
    int clGetGLTextureInfo(@Ptr long cl_mem1, int cl_gl_texture_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetImageInfo(cl_mem, cl_image_info, size_t, void*, size_t*)</code>
    int clGetImageInfo(@Ptr long cl_mem1, int cl_image_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetKernelArgInfo(cl_kernel, cl_uint, cl_kernel_arg_info, size_t, void*, size_t*)</code>
    @Optional
    int clGetKernelArgInfo(@Ptr long cl_kernel1, int cl_uint1, int cl_kernel_arg_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetKernelInfo(cl_kernel, cl_kernel_info, size_t, void*, size_t*)</code>
    int clGetKernelInfo(@Ptr long cl_kernel1, int cl_kernel_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetKernelWorkGroupInfo(cl_kernel, cl_device_id, cl_kernel_work_group_info, size_t, void*, size_t*)</code>
    int clGetKernelWorkGroupInfo(@Ptr long cl_kernel1, @Ptr long cl_device_id1, int cl_kernel_work_group_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetMemObjectInfo(cl_mem, cl_mem_info, size_t, void*, size_t*)</code>
    int clGetMemObjectInfo(@Ptr long cl_mem1, int cl_mem_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /**
     * Platform API<br>
     * Original signature : <code>cl_int clGetPlatformIDs(cl_uint, cl_platform_id*, cl_uint*)</code>
     */
    int clGetPlatformIDs(int cl_uint1, @Ptr long cl_platform_idPtr1, @Ptr long cl_uintPtr1);

    /// Original signature : <code>cl_int clGetPlatformInfo(cl_platform_id, cl_platform_info, size_t, void*, size_t*)</code>
    int clGetPlatformInfo(@Ptr long cl_platform_id1, int cl_platform_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetProgramBuildInfo(cl_program, cl_device_id, cl_program_build_info, size_t, void*, size_t*)</code>
    int clGetProgramBuildInfo(@Ptr long cl_program1, @Ptr long cl_device_id1, int cl_program_build_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetProgramInfo(cl_program, cl_program_info, size_t, void*, size_t*)</code>
    int clGetProgramInfo(@Ptr long cl_program1, int cl_program_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetSamplerInfo(cl_sampler, cl_sampler_info, size_t, void*, size_t*)</code>
    int clGetSamplerInfo(@Ptr long cl_sampler1, int cl_sampler_info1, @Ptr long size_t1, @Ptr long voidPtr1, @Ptr long size_tPtr1);

    /// Original signature : <code>cl_int clGetSupportedImageFormats(cl_context, cl_mem_flags, cl_mem_object_type, cl_uint, cl_image_format*, cl_uint*)</code>
    int clGetSupportedImageFormats(@Ptr long cl_context1, long cl_mem_flags1, int cl_mem_object_type1, int cl_uint1, @Ptr long cl_image_formatPtr1, @Ptr long cl_uintPtr1);

    /// Original signature : <code>cl_int clIcdGetPlatformIDsKHR(cl_uint, cl_platform_id*, cl_uint*)</code>
    @Optional
    int clIcdGetPlatformIDsKHR(int cl_uint1, @Ptr long cl_platform_idPtr1, @Ptr long cl_uintPtr1);

    /// Original signature : <code>cl_program clLinkProgram(cl_context, cl_uint, const cl_device_id*, const char*, cl_uint, const cl_program*, clLinkProgram_arg1_callback, void*, cl_int*)</code>
    @Optional
    OpenCLLibrary.cl_program clLinkProgram(OpenCLLibrary.cl_context cl_context1, int cl_uint1, Pointer<OpenCLLibrary.cl_device_id> cl_device_idPtr1, Pointer<Byte> charPtr1, int cl_uint2, Pointer<OpenCLLibrary.cl_program> cl_programPtr1, Pointer<OpenCLLibrary.clLinkProgram_arg1_callback> arg1, Pointer<?> voidPtr1, Pointer<Integer> cl_intPtr1);

    /**
     * clLogMessagesToStderr sends all log messages to the file descriptor stderr<br>
     * errstr<br>
     * Original signature : <code>void clLogMessagesToStderrAPPLE(const char*, const void*, size_t, void*)</code>
     */
    @Optional
    void clLogMessagesToStderrAPPLE(Pointer<Byte> charPtr1, Pointer<?> voidPtr1, @Ptr long size_t1, Pointer<?> voidPtr2);

    /**
     * clLogMessagesToStdout sends all log messages to the file descriptor stdout<br>
     * errstr<br>
     * Original signature : <code>void clLogMessagesToStdoutAPPLE(const char*, const void*, size_t, void*)</code>
     */
    @Optional
    void clLogMessagesToStdoutAPPLE(Pointer<Byte> charPtr1, Pointer<?> voidPtr1, @Ptr long size_t1, Pointer<?> voidPtr2);

    /**
     * errstr<br>
     * Original signature : <code>void clLogMessagesToSystemLogAPPLE(const char*, const void*, size_t, void*)</code>
     */
    @Optional
    void clLogMessagesToSystemLogAPPLE(Pointer<Byte> charPtr1, Pointer<?> voidPtr1, @Ptr long size_t1, Pointer<?> voidPtr2);

    /// Original signature : <code>cl_int clReleaseCommandQueue(cl_command_queue)</code>
    int clReleaseCommandQueue(@Ptr long cl_command_queue1);

    /// Original signature : <code>cl_int clReleaseContext(cl_context)</code>
    int clReleaseContext(@Ptr long cl_context1);

    /// Original signature : <code>cl_int clReleaseDevice(cl_device_id)</code>
    @Optional
    int clReleaseDevice(@Ptr long cl_device_id1);

    /// Original signature : <code>cl_int clReleaseDeviceEXT(cl_device_id)</code>
    @Optional
    int clReleaseDeviceEXT(@Ptr long cl_device_id1);

    /// Original signature : <code>cl_int clReleaseEvent(cl_event)</code>
    int clReleaseEvent(@Ptr long cl_event1);

    /// Original signature : <code>cl_int clReleaseKernel(cl_kernel)</code>
    int clReleaseKernel(@Ptr long cl_kernel1);

    /// Original signature : <code>cl_int clReleaseMemObject(cl_mem)</code>
    int clReleaseMemObject(@Ptr long cl_mem1);

    /// Original signature : <code>cl_int clReleaseProgram(cl_program)</code>
    int clReleaseProgram(@Ptr long cl_program1);

    /// Original signature : <code>cl_int clReleaseSampler(cl_sampler)</code>
    int clReleaseSampler(@Ptr long cl_sampler1);

    /// Original signature : <code>cl_int clRetainCommandQueue(cl_command_queue)</code>
    int clRetainCommandQueue(@Ptr long cl_command_queue1);

    /// Original signature : <code>cl_int clRetainContext(cl_context)</code>
    int clRetainContext(@Ptr long cl_context1);

    /// Original signature : <code>cl_int clRetainDevice(cl_device_id)</code>
    @Optional
    int clRetainDevice(@Ptr long cl_device_id1);

    /// Original signature : <code>cl_int clRetainDeviceEXT(cl_device_id)</code>
    @Optional
    int clRetainDeviceEXT(@Ptr long cl_device_id1);

    /// Original signature : <code>cl_int clRetainEvent(cl_event)</code>
    int clRetainEvent(@Ptr long cl_event1);

    /// Original signature : <code>cl_int clRetainKernel(cl_kernel)</code>
    int clRetainKernel(@Ptr long cl_kernel1);

    /// Original signature : <code>cl_int clRetainMemObject(cl_mem)</code>
    int clRetainMemObject(@Ptr long cl_mem1);

    /// Original signature : <code>cl_int clRetainProgram(cl_program)</code>
    int clRetainProgram(@Ptr long cl_program1);

    /// Original signature : <code>cl_int clRetainSampler(cl_sampler)</code>
    int clRetainSampler(@Ptr long cl_sampler1);

    /**
     * WARNING:<br>
     *     This API introduces mutable state into the OpenCL implementation. It has been REMOVED<br>
     *  to better facilitate thread safety.  The 1.0 API is not thread safe. It is not tested by the<br>
     *  OpenCL 1.1 conformance test, and consequently may not work or may not work dependably.<br>
     *  It is likely to be non-performant. Use of this API is not advised. Use at your own risk.<br>
     * *  Software developers previously relying on this API are instructed to set the command queue <br>
     *  properties when creating the queue, instead.<br>
     * Original signature : <code>cl_int clSetCommandQueueProperty(cl_command_queue, cl_command_queue_properties, cl_bool, cl_command_queue_properties*)</code>
     */
    int clSetCommandQueueProperty(@Ptr long cl_command_queue1, long cl_command_queue_properties1, int cl_bool1, @Ptr long cl_command_queue_propertiesPtr1);

    /// Original signature : <code>cl_int clSetEventCallback(cl_event, cl_int, clSetEventCallback_arg1_callback, void*)</code>
    @Optional
    int clSetEventCallback(@Ptr long cl_event1, int cl_int1, @Ptr long arg1, @Ptr long voidPtr1);

    /// Original signature : <code>cl_int clSetKernelArg(cl_kernel, cl_uint, size_t, const void*)</code>
    int clSetKernelArg(@Ptr long cl_kernel1, int cl_uint1, @Ptr long size_t1, @Ptr long voidPtr1);

    /**
     * memobj<br>
     * Original signature : <code>cl_int clSetMemObjectDestructorAPPLE(cl_mem, clSetMemObjectDestructorAPPLE_arg1_callback, void*)</code>
     */
    @Optional
    int clSetMemObjectDestructorAPPLE(OpenCLLibrary.cl_mem cl_mem1, Pointer<OpenCLLibrary.clSetMemObjectDestructorAPPLE_arg1_callback> arg1, Pointer<?> voidPtr1);

    /// Original signature : <code>cl_int clSetMemObjectDestructorCallback(cl_mem, clSetMemObjectDestructorCallback_arg1_callback, void*)</code>
    @Optional
    int clSetMemObjectDestructorCallback(@Ptr long cl_mem1, @Ptr long arg1, @Ptr long voidPtr1);

    /// Original signature : <code>cl_int clSetPrintfCallback(cl_context, clSetPrintfCallback_arg1_callback, void*)</code>
    @Optional
    int clSetPrintfCallback(OpenCLLibrary.cl_context cl_context1, Pointer<OpenCLLibrary.clSetPrintfCallback_arg1_callback> arg1, Pointer<?> voidPtr1);

    /// Original signature : <code>cl_int clSetUserEventStatus(cl_event, cl_int)</code>
    @Optional
    int clSetUserEventStatus(@Ptr long cl_event1, int cl_int1);

    /// Original signature : <code>cl_int clUnloadCompiler()</code>
    int clUnloadCompiler();

    /// Original signature : <code>cl_int clUnloadPlatformCompiler(cl_platform_id)</code>
    @Optional
    int clUnloadPlatformCompiler(@Ptr long cl_platform_id1);

    /**
     * Event Object APIs<br>
     * Original signature : <code>cl_int clWaitForEvents(cl_uint, const cl_event*)</code>
     */
    int clWaitForEvents(int cl_uint1, @Ptr long cl_eventPtr1);
    
}