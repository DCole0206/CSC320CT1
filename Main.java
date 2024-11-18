package main;

import java.util.Scanner;

public class Main {

		    public static void main(String[] args) {
		        Scanner in = new Scanner(System.in);

		        System.out.print("first name: ");
		        String firstName = in.next();

		        System.out.print("last name: ");
		        String lastName = in.next();

		        System.out.print("street address: ");
		        String address = in.next();

		        in.nextLine();

		        System.out.print("city: ");
		        String city = in.nextLine();

		        System.out.print("zip code: ");
		        int zipCode = in.nextInt();

		        System.out.println("FIRST NAME: " + firstName);
		        System.out.println("LAST NAME: " + lastName);
		        System.out.println("Street Address: " + address);
		        System.out.println("CITY: " + city);
		        System.out.println("Zip Code: " + zipCode);

		        in.close();
		    }
}