package com.spartaglobal.IO_ExceptionsExample;

import java.io.*;

public class MovieManager {

    public void searchForFilm(String titleName){

        try {
            BufferedReader csvReader = new BufferedReader(new FileReader("Resources/movie_metadata.csv"));
            String csvLine;

            while((csvLine=csvReader.readLine()) != null)
            {
                String[] csvLineData = csvLine.split(",");
                if(csvLineData[0].toLowerCase().contains(titleName ) == true)
                {
                    System.out.println(csvLineData[0]);
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void searchByFilmRating(String rating)
    {

        double ratingDouble = Double.parseDouble(rating);
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader("Resources/movie_metadata.csv"));
            BufferedWriter popular = new BufferedWriter(new FileWriter("Resources/popular_movies.csv"));

            String csvLine;
            csvLine = csvReader.readLine();
            popular.write(csvLine + "\n");
            while((csvLine=csvReader.readLine()) != null)
            {
                String[] csvLineData = csvLine.split(",");

                double k = Double.parseDouble(csvLineData[1]);
                if(k >= ratingDouble)
                {
                    System.out.print(csvLineData[0] + ", ");
                    System.out.println(csvLineData[1]);
                    popular.write(csvLine + "\n");
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public void moviesBeforeTwo(double year)
    {
        {
            try {
                BufferedReader csvReader = new BufferedReader(new FileReader("Resources/movie_metadata.csv"));
                BufferedWriter popular = new BufferedWriter(new FileWriter("Resources/moviesbeforegivenyear.csv"));

                String csvLine;
                csvLine = csvReader.readLine();
                popular.write(csvLine + "\n");
                while((csvLine=csvReader.readLine()) != null)
                {
                    String[] csvLineData = csvLine.split(",");
                    if(!csvLineData[2].equals("")) {
                        double k = Double.parseDouble(csvLineData[2]);
                        if (k <= year) {
                            System.out.print(csvLineData[0] + ", ");
                            System.out.println(csvLineData[1]);
                            popular.write(csvLine + "\n");
                        }
                    }
                }


            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }

}
