package com.javier.rodriguez.facade;

import com.javier.rodriguez.media_library.*;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format){
        System.out.println( "VideconversionFacade: conversion started" );
        VideoFile file = new VideoFile(fileName,format);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) destinationCodec= new MPEG4CompressionCodec();
        destinationCodec= new OggCompressionCodec();
        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
        File result = (new AudioMixer().fix(intermediateResult));
        System.out.println("VideoConversionFacade: conversion completed");
        return result;
    }
}
