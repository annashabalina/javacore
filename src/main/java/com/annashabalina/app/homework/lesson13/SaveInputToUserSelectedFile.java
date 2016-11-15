package com.annashabalina.app.homework.lesson13;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Пользователь on 14.11.2016.
 */
public class SaveInputToUserSelectedFile {
    private static String path="";
    public static void main(String[] args) {
        System.out.println("Chose a name for your file: ");
        Scanner s = new Scanner(System.in);
        String fileName = s.nextLine();
        SaveInputToUserSelectedFile.createPath(fileName);
        System.out.println("Enter words or phrases to save to the file. Type \"Exit\" when you want to quit.");
        String userInput=s.nextLine();
        SaveInputToUserSelectedFile.writeTofile(userInput);
        /*if(userInput.equalsIgnoreCase("exit")){
            System.out.println("Your input has been saved to file");
        }*/
    }

    public static void writeTofile(String userInput){
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path)));
                writer.append(userInput);
                writer.newLine();
                writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String createPath(String fileName){
        String workingDir = System.getProperty("user.dir");
        path=workingDir+File.separator+"filesForLesson13"+File.separator+fileName+".txt";
        return path;
    }
}
