package com.company;

import java.util.Scanner;

public class Ch712{
    private static int[] arrValues = new int[5];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int rem = 0;

        while(rem != 5){
            System.out.printf("Enter value between 10 and 100: ");
            int nr = sc.nextInt();
            if(nr < 10 || nr > 100)
                continue;
            if(isUnique(nr))
                System.out.printf("Unique value: %d", nr);
            try{
                arrValues[rem++] = nr;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            unique();
        }
    }
    public static boolean isUnique(int num){
        for(int x = 0; x <arrValues.length; x++){
            if(arrValues[x] == num)
                return false;
        }
        return true;
    }
    public static void unique()
    {
        System.out.println("\nUnique values:");
        System.out.print(arrValues[0] + " ");
        int unique = 0;
        for(int x = 1; x <arrValues.length; x++){
            if(arrValues[x] > 0){
                for(int j = x -1; j>=0; j--){
                    if(arrValues[x] == arrValues[j]){
                        unique = 0;
                        break;
                    }
                    else
                    {
                        unique = arrValues[x];
                    }
                }
                if(unique > 0)
                    System.out.print(unique + " ");
            }
            else
            {
                continue;
            }
        }
        System.out.println();
    }
}