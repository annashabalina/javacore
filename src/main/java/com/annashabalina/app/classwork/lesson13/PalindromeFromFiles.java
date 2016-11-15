package com.annashabalina.app.classwork.lesson13;

import com.annashabalina.app.classwork.lesson10.Palindromes;

import java.io.*;

/**
 * Created by Пользователь on 12.11.2016.
 */
public class PalindromeFromFiles {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\files\\checkedForPalindrome.txt")));
            BufferedReader reader = new BufferedReader(new FileReader("D:\\files\\checkIfPalindrome.txt"));
            String input;
            int palindromesCounter=0;
            int notPalindromesCounter =0;

            while ((input = reader.readLine()) != null) {
                boolean verified = Palindromes.checkIfPalindromeV2(input);

                if(verified){
                    palindromesCounter++;
                    writer.append(input + " is palindrome");
                    writer.newLine();
                }else{
                    notPalindromesCounter++;
                    writer.append(input + " is not a palindrome");
                    writer.newLine();
                }
            } writer.append("There are "+ palindromesCounter + " palindromes");
            writer.newLine();
            writer.append("There are " + notPalindromesCounter + " not palindromes");
            writer.close();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
