package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int sayi,i,carpanToplam = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir say� giriniz: ");
        sayi = scanner.nextInt();

        for ( i = 0; i < sayi; i++) ;
                 if (sayi % i == 0){
                    carpanToplam+=i;
                 }
                 if(carpanToplam==0){
                     System.out.println("M�kemmel say� de�ildir");
                 }else {
                     System.out.println("M�kemmel say� de�ildir.");
                 }
    }
}
