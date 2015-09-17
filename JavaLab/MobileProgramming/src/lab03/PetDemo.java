package lab03;

import java.util.Scanner;

public class PetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet usersPet = new Pet("Jane Doe");
		System.out.println("My records on your pet are incomplete.");
		System.out.println("Here is what they currently say:");

		// 객체 호출시 객체의 toString함수가 자동적으로 호출됨
		System.out.println(usersPet);

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the pet's name:");
		String name = keyboard.nextLine();
		System.out.println("Please enter the pet's age:");
		int age = keyboard.nextInt();
		System.out.println("Please enter the pet's weight:");
		double weight = keyboard.nextDouble();
		usersPet.set(name, age, weight);
		System.out.println("My records now say:");
		
		// toString 호출
		System.out.println(usersPet);
		
		
	}

}