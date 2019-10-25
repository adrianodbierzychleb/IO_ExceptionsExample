package com.spartaglobal.IO_ExceptionsExample;


import java.io.*;

public class FileInputStreamManager {

    public void fileStreamReader() {

        try {

           BufferedReader file = new BufferedReader(new FileReader("Resources/newFile.txt"));
           String line;
            while((line = file.readLine()) != null){
                String[] data = line.split(" ");
                System.out.println(data);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
