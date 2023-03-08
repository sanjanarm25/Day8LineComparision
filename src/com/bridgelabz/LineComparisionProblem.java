package com.bridgelabz;

import java.util.Scanner;

public class LineComparisionProblem {


    public void calculateLength(double x1,double x2,double y1,double y2){


        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Length1 of line is: "+length1);

    }

    public static void EqualityCheck(){

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line\n" +
                "Comparison Computation\n" +
                "Program on Master Branch");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        LineComparisionProblem length=new LineComparisionProblem();
        length.calculateLength(x1,y1,x2,y2);



    }
}
