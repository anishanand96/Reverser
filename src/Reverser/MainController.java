package Reverser;

import java.util.Scanner;

public class MainController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverserWithRecursion sr1 = new StringReverserWithRecursion();
		StringReverserWithoutRecursion sr = new StringReverserWithoutRecursion();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String value = sc.nextLine();
		System.out.println("your reversed string using with recursion is " + sr1.reverse(value));
		System.out.println("your reversed string using without recursion is " + sr.reverse(value));
		sc.close();

		// Test cases
		String case1 = "Hai";
		String case2 = "Hello";
		String expected1 = "iaH";
		String expected2 = "olleH";

		// Test case 1
		String result1 = sr1.reverse(case1);
		if (result1.equals(expected1))
			System.out.println("pass");
		else
			System.out.println("fail");

		// Test case 2
		String result2 = sr1.reverse(case2);
		if (result2.equals(expected2))
			System.out.println("pass");
		else
			System.out.println("fail");

		// Test case3
		String result3 = sr.reverse(case1);
		if (result3.equals(expected1))
			System.out.println("pass");
		else
			System.out.println("fail");

		// Test case 4
		String result4 = sr.reverse(case2);
		if (result4.equals(expected2))
			System.out.println("pass");
		else
			System.out.println("fail");

		// Timing code for with recursion
		long startw = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			String resultw = sr1.reverse("Hello everyone");
		}
		long endw = System.currentTimeMillis();
		long withRecursionTime = endw - startw;
		System.out.println("Time taken to reverse a string with recursion" + " " + withRecursionTime + " ms");

		// Timing code for without recursion
		long startwo = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			String resultwo = sr.reverse("Hello everyone");
		}
		long endwo = System.currentTimeMillis();
		long withoutRecursionTime = endwo - startwo;
		System.out.println("Time taken to reverse a string without recursion" + " " + withoutRecursionTime + " ms");
	}
}
