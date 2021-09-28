package com.javier.rodriguez.videos;

public class LectorMkv implements LecturaArchivos{

    private DecodificarVideo decodificarVideo;

    public LectorMkv(String video){
        this.decodificarVideo = new DecodificarVideo(video);
    }
    @Override
    public DecodificarVideo getVideoDecodificado() {
        return this.decodificarVideo;
    }
}
