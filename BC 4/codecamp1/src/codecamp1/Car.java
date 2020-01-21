package codecamp1;

import java.io.IOException;

import java.util.Scanner;

 

public class Car {

     public static void main(String args[]) throws IOException{

           int a=0,b=0;

           Scanner sc=new Scanner(System.in);

           int[] evenNum=new int[10];

           int[] oddNum=new int[10];

           int[] carNum=new int[10];

           System.out.println("Please Enter car numbers");

           for(int i=0;i<10;i++) {

                carNum[i]=sc.nextInt();

           }

           for(int i=0;i<10;i++) {

                int temp=carNum[i];

                if(temp%2==0){

                     evenNum[a]=carNum[i];

                     System.out.println("Even car numbers: "+evenNum[a]);

                     a++;

                }

                else {

                     oddNum[b]=carNum[i];

                     System.out.println("Odd car number: "+oddNum[b]);

                     b++;

                }

           }

     }

 

}