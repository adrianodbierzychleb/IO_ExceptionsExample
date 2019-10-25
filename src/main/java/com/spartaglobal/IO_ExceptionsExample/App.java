package com.spartaglobal.IO_ExceptionsExample;

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

//        BufferedFileManager bufferedFileManager = new BufferedFileManager();
//        try {
//            bufferedFileManager.readerWriter();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        FileInputStreamManager fIleInputStreamManager = new FileInputStreamManager();
//        fIleInputStreamManager.fileStreamReader();

        MovieManager movieManager = new MovieManager();
        movieManager.moviesBeforeTwo(2000);

    }
}
