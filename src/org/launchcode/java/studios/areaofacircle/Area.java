package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        double pi = 3.14;

        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);

        input.close();
        System.out.println("The area of a circle with a radius of: "+ radius +" is: " + area);

    }
}
