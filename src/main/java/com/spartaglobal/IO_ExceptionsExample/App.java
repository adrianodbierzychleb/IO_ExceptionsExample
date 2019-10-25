package com.spartaglobal.IO_ExceptionsExample;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
//        System.out.println( "Hello World!" );
//        ByteReaderManager byteReaderManager = new ByteReaderManager();
//        byteReaderManager.charReader();

        BufferedFileManager bufferedFileManager = new BufferedFileManager();
        try {
            bufferedFileManager.readerWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
