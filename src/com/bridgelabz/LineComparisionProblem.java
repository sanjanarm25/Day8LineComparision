package com.bridgelabz;

import java.util.Scanner;

public class LineComparisionProblem {
    static double length1;



    public void calculateLength(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Length1 of line is: "+length1);

    }

    public static void EqualityCheck(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a1: ");
        double a1 = scanner.nextDouble();
        System.out.print("Enter a2: ");
        double a2 = scanner.nextDouble();
        System.out.print("Enter b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Enter b2: ");
        double b2 = scanner.nextDouble();

        double length2 = Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));
        if(length1==length2){
            System.out.println("Lines are  equals...");
        }else{
            System.out.println("Lines are not equal");
        }

    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line\n" +
                "Comparison Computation\n" +
                "Program on Master Branch");

        LineComparisionProblem length=new LineComparisionProblem();
        length.calculateLength();
        EqualityCheck();




    }
}
