package com.annashabalina.app.homework.lesson13;

import com.annashabalina.app.classwork.lesson10.Palindromes;

import java.io.*;

/**
 * Created by Пользователь on 14.11.2016.
 */
public class CheckForPalindromeFromFile {
    public static void palindromeCheck(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("D:\\projects\\javacore\\filesForLesson13\\taskB-palindromesInput.txt"));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\projects\\javacore\\filesForLesson13\\taskB-palindromesOutput.txt")));
            String line;
            int palindromeCounter=0;

            while((line=reader.readLine())!=null){
                boolean flag = Palindromes.checkIfPalindromeV3(line);
                if(flag){
                    palindromeCounter++;
                    writer.append(line+" is a palindrome");
                    writer.newLine();
                }else{
                    writer.append(line+" is not a palindrome");
                    writer.newLine();
                }
            }
            System.out.println("There are "+palindromeCounter+" in the input file");
            writer.append("There are "+palindromeCounter+" in the input file");
            writer.close();
            reader.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
