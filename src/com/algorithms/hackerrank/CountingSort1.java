package com.algorithms.hackerrank;

import java.util.Scanner;

public class CountingSort1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[100];

        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            arr[in.nextInt()] += 1; 
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        in.close();
    }
}
