package com.javier.rodriguez;

import com.javier.rodriguez.facade.VideoConversionFacade;
import com.javier.rodriguez.media_library.*;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video= converter.convertVideo("video.ogg", "mp4");


    }
}
