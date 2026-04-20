package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the name of a story: ");
            String choice =  scanner.nextLine();
            FileReader fileReader;
            if (choice.toLowerCase().equals("goldilocks.txt")) {
                fileReader = new FileReader("../DataFiles/goldilocks.txt");
            } else if(choice.toLowerCase().equals("hansel_and_gretel.txt")){
                fileReader = new FileReader("../DataFiles/hansel_and_gretel.txt");
            }else if(choice.toLowerCase().equals("mary_had_a_little_lamb.txt")){
                fileReader = new FileReader("../DataFiles/mary_had_a_little_lamb.txt");
            }else{
                fileReader = new FileReader("../DataFiles/mary_had_a_little_lamb.txt");
            }

            // create a FileReader object connected to the File
            // create a BufferedReader to manage input stream
            BufferedReader bufReader = new BufferedReader(fileReader);
            String input;
            // read until there is no more data
            while((input = bufReader.readLine()) != null) {
                System.out.println(input);
            }
            // close the stream and release the resources
            bufReader.close();
        } catch(IOException e) {
            // display stack trace if there was an error
            e.printStackTrace();
        }
    }
}