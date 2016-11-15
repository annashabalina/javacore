package com.annashabalina.app.homework.lesson12;

import java.util.Scanner;

/**
 * Created by Пользователь on 09.11.2016.
 */
public class Enigma {
    private static final String ORIGINAL= "ABCDEFGHIJKLMNOPQRSTUVWXYZ 123456789!?,.;";
    private static final String ENCODED= "NRSTUZABVWXYFCDEGHIJKLMOPQ_]-+#$!*\\~51/03";
    public static void main(String[] args) {
        System.out.println("Enter a phrase to encode: ");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
      // Enigma.encode(str);
       Enigma.decode(str);
    }

    public static void encode(String str){
        Enigma.cipher(ORIGINAL, ENCODED, str);
    }

    public static void decode(String str){
        Enigma.cipher(ENCODED, ORIGINAL, str);
    }

    private static String cipher(String encode, String decode, String str){
        str=str.toUpperCase();
        StringBuilder result = new StringBuilder();
        for(int i =0; i<str.length();i++){
            for(int y=0;y<encode.length();y++){
                if(str.charAt(i)==encode.charAt(y)){
                    result.append(decode.charAt(y));
                }
            }
        }
        System.out.println("The message is "+ result.toString());
        return result.toString();
    }
}
