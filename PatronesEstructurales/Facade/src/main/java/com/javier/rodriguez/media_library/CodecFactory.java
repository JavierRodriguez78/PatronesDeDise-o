package com.javier.rodriguez.media_library;



public class CodecFactory {
    public static Codec extract(VideoFile file){
        String type = file.getCodecType();
        if (type.equals("mp4")){
            System.out.println("CodecFactory: extracting mpeg video....");
            return new MPEG4CompressionCodec();
        }
        System.out.println("CodecFactory: extracting ogg video...");
        return new OggCompressionCodec();
    }
}
