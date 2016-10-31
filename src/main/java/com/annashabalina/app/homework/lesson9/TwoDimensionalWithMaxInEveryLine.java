package com.annashabalina.app.homework.lesson9;

/**
 * Created by Пользователь on 30.10.2016.
 */
public class TwoDimensionalWithMaxInEveryLine {
    public static void main(String[] args) {
        int[][]arr=new int[5][8];
        int max = 0;
        for(int i=0;i<arr.length;i++){
            for(int y=0;y<arr[i].length;y++){
                arr[i][y]=(int)(-99 + (Math.random()*199));
                System.out.printf("%4d",arr[i][y]);
                if(arr[i][y]>max){
                    max=arr[i][y];
                }
            }
            System.out.printf("%27s %4d %n","Max value of this row is", max);
            max=0;
        }
    }
}
