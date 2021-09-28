package com.javier.rodriguez.videos;

public class ProcesarVideo {
    private String video;
    private DecodificarVideo DecodificarVideo;
    private LecturaArchivos lector = null;
    private String formato;

    public ProcesarVideo(String parametroVideo) {
        this.video = parametroVideo;
    }

    public DecodificarVideo procesar () {
        formato = this.video.substring(video.indexOf('.') + 1, video.length());
        System.out.println(formato);
        if (formato.equals("mkv")) {
            lector = new LectorMkv(video);
        }
        if (formato.equals("mp4")) {
            lector = new LectorMp4(video);
        }
        assert lector != null;
        DecodificarVideo = lector.getVideoDecodificado();

        return DecodificarVideo;
    }
}
