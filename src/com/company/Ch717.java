package com.company;

import java.util.Random;

public class Ch717 {
    static Random random = new Random();
    static int rollD61(){
        return random.nextInt(6) + 1;
    }
    static int rollD62(){
        return random.nextInt(6) + 1;
    }
    static int sum(){
        return rollD61() + rollD62();
    }
    public static void main(String[] args) {
        int[] ds = new int[11];
        for (int i = 1; i <= 36000000; i++){
            ds[sum() - 2]++;
        }
        System.out.println(" Sum:  Number of times: ");
        for(int i = 0; i < ds.length; i++){
            System.out.printf("%4d%10d  \n", i + 2, ds[i]);
        }
    }
}