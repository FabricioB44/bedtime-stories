package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Select which story you'd like to read: ");
            System.out.println("\n1. Goldilocks");
            System.out.println("2. Hansel and Gretel");
            System.out.println("3. Mary had a little lamb");

            String chosenFile = "";

            switch (myScanner.nextLine()) {
                case "1":
                    chosenFile = "goldilocks.txt";
                    break;
                case "2":
                    chosenFile = "hansel_and_gretel.txt";
                    break;
                case "3":
                    chosenFile = "mary_had_a_little_lamb.txt";
                    break;
                default:
                    break;
            }

            FileReader fileReader = new FileReader(chosenFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            int lineNumber = 1;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(lineNumber + ". " + line);
                lineNumber++;
            }

            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }
}
