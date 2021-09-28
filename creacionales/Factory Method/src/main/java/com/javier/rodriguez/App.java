package com.javier.rodriguez;

import com.javier.rodriguez.videos.ProcesarVideo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Iniciando el vídeo a procesar" );
        ProcesarVideo procesarVideo = new ProcesarVideo("prueba.mkv");
        System.out.println(procesarVideo.procesar());
    }
}
