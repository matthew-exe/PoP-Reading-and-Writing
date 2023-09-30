import java.util.Scanner;
/**
 * UserInput class - part of POP_ReadingAndWriting_STAFF
 * File reading and writing, and User input tasks
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */
public class UserInput {
    /**
     * sayHello()
     * asks the user to enter their name and says hello to the user
     * @return "Hello (users inputted name)"
     */
	public String sayHello() {
		Scanner keyboard = new Scanner(System.in); // new keyboard scanner
        String name;
        System.out.println("Enter your name: ");
        name = keyboard.next(); // getting the users input
        keyboard.close();
        return "Hello " + name;
	}

    /**
     * readTenNumbers()
     * Asks the user to input 10 numbers.
     * @return an array of the 10 inputted numbers
     */
	public int[] readTenNumbers() {
        Scanner keyboard = new Scanner(System.in); // new keyboard scanner
		int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            while (!keyboard.hasNextInt()) { // while user has not entered a number
                keyboard.next(); // skip the users input
                System.err.println("Invalid input, enter a number: ");
            }
            numbers[i] = keyboard.nextInt(); // adding user input to array as it is a number
        }
        keyboard.close();
        return numbers;
	}

    /**
     * readTenNames()
     * Asks the user to input 10 names
     * @return an array of the 10 inputted names
     */
	public String[] readTenNames() {
		Scanner keyboard = new Scanner(System.in); // new keyboard scanner
        String[] names = new String[10];
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter a name: ");
            names[i] = keyboard.next(); // adding user input to array
        }
        keyboard.close(); // closing scanner
        return names;
	}
}
