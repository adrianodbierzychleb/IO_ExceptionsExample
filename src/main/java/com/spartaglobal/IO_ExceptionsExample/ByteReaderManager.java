package com.spartaglobal.IO_ExceptionsExample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteReaderManager {


    public void readStream(){

        try(InputStream input = new FileInputStream("Resources/TestFile.txt");) {
            int data = 0;
            //InputStream input = new FileInputStream("Resources/TestFile.txt");
            //System.out.println(input.read());
            while(data != -1){
                data = input.read();
                System.out.println(data);
            }



        }catch (IOException e){
            e.printStackTrace();
        }


    }

    public void charReader(){
        try(InputStream input = new FileInputStream("Resources/TestFile.txt");) {
            int data = 0;
            int countT = 0;
            //InputStream input = new FileInputStream("Resources/TestFile.txt");
            //System.out.println(input.read());
            while(data != -1){
                data = input.read();
                System.out.println((char)data);
                if((char) data == 't'){
                    countT++;
                }
            }
            System.out.println(countT);



        }catch (IOException e){
            e.printStackTrace();
        }
    }



}
