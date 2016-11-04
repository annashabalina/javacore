package com.annashabalina.app.classwork.lesson10;

/**
 * Created by Пользователь on 02.11.2016.
 */
public class Palindromes {
    public static boolean checkIfPalindromeV1(String s){
        s=s.toLowerCase();
        for(int i=0;i<s.length()/2;i++){
            if (!(s.charAt(i)==s.charAt(s.length()-1-i))){
                System.out.println("\""+s+"\"" + " is not a palindrome");
                return false;
            }
        }
        System.out.println("\""+s+"\"" + " is a palindrome");
        return true;
    }

    public static boolean checkIfPalindromeV2(String s){
        s=s.toLowerCase();
        String result="";
        for(int i=s.length()-1;i>=0;i--){
            result+=s.charAt(i);
        }
        if(s.equals(result)){
            System.out.println("\""+s+"\"" + " is a palindrome");
            return true;
        }else {
            System.out.println("\""+s+"\"" + " is not a palindrome");
            return false;
        }
    }

    public static boolean checkIfPalindromeV3(String s){
        s=s.toLowerCase();
        String s1 ="";
        String s2="";
        for(int i=0;i<s.length()/2;i++){
            s1+=s.charAt(i);
            s2+=s.charAt(s.length()-1-i);
        }
        if(s1.equals(s2)){
            System.out.println("\""+s+"\"" + " is a palindrome");
            return true;
        }else{
            System.out.println("\""+s+"\"" + " is not a palindrome");
            return false;
        }
    }

    public static boolean checkIfPalindromeV4(String s){
        s=s.toLowerCase();
        int counter=0;
        float halfLength=s.length()/2f;
        for(int i=0;i<s.length()/2;i++) {
            char a =s.charAt(s.length()/2-1-i);
            char b = s.charAt(Math.round(halfLength+i));
            if (a==b){
                counter++;
            }
        }
        if(counter==s.length()/2){
            System.out.println("\""+s+"\"" + " is a palindrome");
            return true;
        }else{
            System.out.println("\""+s+"\"" + " is not a palindrome");
            return false;
        }
    }

    public static boolean checkIfPalindromeV5(String s){
        s=s.toLowerCase();
        String firstPart="";
        String secondPart="";
        float halfLength = s.length()/2f;
        for(int i =0; i<s.length()/2;i++){
            firstPart+=s.charAt(s.length()/2-1-i);
            secondPart+=s.charAt(Math.round(halfLength)+i);
        }
        if(firstPart.equals(secondPart)){
            System.out.println("\""+s+"\"" + " is a palindrome");
            return true;
        }else{
            System.out.println("\""+s+"\"" + " is not a palindrome");
            return false;
        }
    }

    public static void main(String[] args) {
        Palindromes.checkIfPalindromeV1("moom");
        Palindromes.checkIfPalindromeV2("madam");
        Palindromes.checkIfPalindromeV3("refer");
        Palindromes.checkIfPalindromeV4("madam");
        Palindromes.checkIfPalindromeV5("Rats live on no evil star");
    }
}
