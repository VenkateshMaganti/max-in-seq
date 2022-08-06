package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {

        // Put your code here
        Scanner s = new Scanner(System.in);

        int num, maxi;

        if((num = s.nextInt()) == 0) {
            return -1;
        }

        maxi = num;

        while(num != 0){
            if(num > maxi){
                maxi = num;
            }
            num = s.nextInt();
        }
        return maxi;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
