package com.javier.rodriguez.videos;

public class LectorMp4 implements LecturaArchivos{
    private DecodificarVideo decodificarVideo;

    public LectorMp4(String video){
        this.decodificarVideo = new DecodificarVideo(video);
    }
    @Override
    public DecodificarVideo getVideoDecodificado() {
        return this.decodificarVideo;
    }

}
