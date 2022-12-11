package ro.mihaaiiii.exercitii;

import ro.mihaaiiii.utils.ScannerUtils;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args)  {
        System.out.println("introduceti diametrul cercului ");
        float diameter = ScannerUtils.readFloatFromUser();
        final double PI = Math.PI;
        double perimetru = PI * diameter;
        System.out.println(perimetru);


    }




}
