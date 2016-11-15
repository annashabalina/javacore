package com.annashabalina.app.homework.lesson12;

import java.util.Scanner;

/**
 * Created by Пользователь on 10.11.2016.
 */
public class CaesarCipher {
    private static final String ABC = "abcdefghijklmnopqrstuvwxyz";
    private static final String XYZ = "zyxwvutsrqponmlkjihgfedcba";

    public static void main(String[] args) {
        System.out.println("Enter a phrase to encode: ");
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println("how many to shift");
        int shift = s.nextInt();
        //CaesarCipher.encode(input, shift);
        CaesarCipher.decode(input, shift);
    }

    public static void encode(String s, int shift) {
        CaesarCipher.cipher(ABC, s, shift);
    }

    public static void decode(String s, int shift) {
        CaesarCipher.cipher(XYZ, s, shift);
    }

    private static void cipher(String alphabet, String input, int shift) {
        input = input.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                int indexInAbc = alphabet.indexOf(input.charAt(i));
                if ((indexInAbc + shift) > alphabet.length()) {
                    result.append(alphabet.charAt((indexInAbc + shift) % alphabet.length()));
                } else {
                    result.append(alphabet.charAt(indexInAbc + shift));
                }
            } else if(Character.isSpaceChar(input.charAt(i))){
                String special = "*/@#";
                int indexOfSpecial =(int) Math.round(Math.random()*5);
                result.append(special.charAt(indexOfSpecial));
            }else{
                result.append(" ");
            }
        }
        System.out.println(result.toString());
    }
}
