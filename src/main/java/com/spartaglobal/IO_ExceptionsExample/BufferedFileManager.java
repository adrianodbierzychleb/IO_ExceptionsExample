package com.spartaglobal.IO_ExceptionsExample;

import java.io.*;

public class BufferedFileManager {

    public void readerWriter() throws IOException {
        //current file managed via buffer
        File file = new File("Resources/TestFile.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        //new file to be managed by buffered writer
        File newFile = new File("Resources/newFile.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
        //line manager variable
        String line;
        while((line = reader.readLine()) != null){
            if(!line.equals("")){
                writer.append(line.trim() + "\n");
                System.out.println("friyay Ive added a new line sic");
            }
        }

        writer.flush();
        writer.close();
        reader.close();

    }


}
