/*
    Name: Michael Zamora
    SID: 20593343
    Date: 1/29/2025
*/

import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        System.out.println("---------------Questions---------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your First & Last name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your Age: ");
        Scanner new_Scanner = new Scanner(System.in);
        int age = new_Scanner.nextInt();

        System.out.print("Enter your Weight: ");
        Scanner brand_new_Scanner = new Scanner(System.in);
        double weight = brand_new_Scanner.nextDouble();

        System.out.print("Enter a (True)/(False) for whether you smoke or not: ");
        Scanner new_brand_Scanner = new Scanner(System.in);
        boolean smoker = new_brand_Scanner.nextBoolean();

        System.out.println("----------Medical Form----------");
        System.out.println(">--Name: " + name);
        System.out.println(">--Age: " + age);
        System.out.println(">--Weight: " + weight);
        System.out.println(">--Smoker: " + smoker);
    }
}
