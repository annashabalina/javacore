package com.annashabalina.app.homework.lesson13;

import com.annashabalina.app.classwork.lesson9.ArrayBubbleSort;
import com.annashabalina.runners.lesson9.ArrayPrint;

import java.io.*;
import java.util.Arrays;

/**
 * Created by Пользователь on 14.11.2016.
 */
public class ReadArrayFromFileAndSort {
    /*public static void main(String[] args) {
        ReadArrayFromFileAndSort.sortAndPrint(1);
    }*/
    public static void sortAndPrint(int sortDirection){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("D:\\projects\\javacore\\filesForLesson13\\taskA-readArrayFromFile.txt"));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\projects\\javacore\\filesForLesson13\\taskA-sortedArrays.txt")));
            String line;

            while((line=reader.readLine())!=null){
                String[] splitted = line.split(",");
               int[] arr = new int[splitted.length];
                for(int i =0; i<splitted.length;i++){
                   arr[i]=Integer.parseInt(splitted[i]);
                }
                if(sortDirection==1){
                    ArrayBubbleSort.fromBiggerToSmaller(arr);
                }else if(sortDirection==2){
                    ArrayBubbleSort.fromSmallerToBigger(arr);
                }
                ArrayPrint.printArraySpaceSeparated(arr);
                writer.append(Arrays.toString(arr).replace("[","").replace("]",""));
                writer.newLine();
            }
            writer.close();
            reader.close();
        } catch(FileNotFoundException e)
        {e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
