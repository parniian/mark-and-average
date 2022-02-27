package com.company;

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        Scanner scanner=new Scanner(System.in);
        int i=1;
        double sum=0.0d;
        int number=0;
        while (i<=5){
            System.out.println("enter your mark and its factor:");
            String str=scanner.nextLine();
            double mark=Double.parseDouble(str);
            String string=scanner.nextLine();
            int factor=Integer.parseInt(string);
            double multiply= mark*factor;
            sum=multiply+sum;
            number=factor+number;
            i++;
        }
        double average=sum/number;
        System.out.println(average);

        if (average>=10.0d)
            System.out.println("you have passed.");
        else
            System.out.println("you have failed.");
    }
}
