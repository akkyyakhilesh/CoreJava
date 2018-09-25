package com.nt.basic;
import java.util.*;

public class StringPattern {

    public static void main(String[] args) {
        System.out.println("enter your num u want to print");
        Scanner input=new Scanner(System.in);
        int j=1;
        int num=input.nextInt();
        for(int i=1;i<=num;){
            for(int k=1;k<=j;k++){
                System.out.print(i+++"\t");
            }
            System.out.println();
            j++;
            if((num-(i-1))<j){
                break;
            }
        }
    if(input!=null)
    	input.close();
    }
}