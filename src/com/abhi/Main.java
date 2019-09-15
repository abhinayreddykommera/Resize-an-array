package com.abhi;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static int [] basedata = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 integers");
        getinput();
        printarray(basedata);
        resizearray();
        basedata[10]=20;
        basedata[11]=30;
        printarray(basedata);


    }
    private static void getinput(){
        for(int i=0;i<basedata.length;i++){
            basedata[i]=scanner.nextInt();
        }
    }

    private static void printarray(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private static void resizearray(){

        int[] original = basedata;
        basedata = new int[12];
        for(int i=0;i<original.length;i++){
            basedata[i]=original[i];
        }
    }
}
