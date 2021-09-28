package com.javier.rodriguez.videos;

public class DecodificarVideo {
    private String video;
    public DecodificarVideo(String video){
        this.video = video;
    }
    @Override
    public String toString(){
        return "El video '"+this.video+"' fue decodificado";
    }

}
