/*
    Name: Michael Zamora
    SID: 20593343
    Date: 1/29/2025
*/

import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------Questions---------------");
        System.out.print("Enter your First & Last name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your Weight: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter a (True)/(False) for whether you smoke or not: ");
        boolean smoker = scanner.nextBoolean();

        System.out.println("----------Medical Form----------");
        System.out.println(">--Name: " + name);
        System.out.println(">--Age: " + age);
        System.out.println(">--Weight: " + weight);
        System.out.println(">--Smoker: " + smoker);
    }
}
