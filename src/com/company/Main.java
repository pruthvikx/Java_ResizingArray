package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter 10 integers : ");
        getData();
        System.out.println("Entered array : ");
        printData(baseData);
        resizeArray();
        System.out.println("Enter 12 elements =");
        getData();
        printData(baseData);
    }
    private static void getData(){
        for (int i=0;i<baseData.length;i++)
            baseData[i] = scanner.nextInt();
    }
    private static void printData(int[] arr){
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i] + " ");
        System.out.println();
    }
    private static void resizeArray(){
        int[] original = baseData;
        baseData = new int[12];
        for (int i=0;i<original.length;i++)
            baseData[i] = original[i];
    }

}
