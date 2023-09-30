import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * FileReading class - part of POP_ReadingAndWriting_STAFF
 * File reading and writing, and User input tasks
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */

public class FileReading {

    /**
     * readName1()
     * reads the first name and second name from a file
     * @param fileName  name of file
     * @return the full name that was read from the file
     * @throws Exception - error handling
     */
	public String readName1(String fileName) throws Exception {
        File file = new File(fileName);
        Scanner fileScan = new Scanner(file);
        String firstName = fileScan.next();
        String secondName = fileScan.next();
        fileScan.close();
        return firstName + " " + secondName;
	}

    /**
     * readName2()
     * reads the first and second name from a file
     * @param fileName  name of file
     * @return the full name that was read from the file
     */
	public String readName2(String fileName) {
        File file = new File(fileName);
        String fullName;
        try {
            Scanner fileScan = new Scanner(file);
            fullName = fileScan.next() + " " + fileScan.next();
            fileScan.close();
        }
        catch (FileNotFoundException ex) {
            fullName = "Invalid filename";
        }
        return fullName;
	}

    /**
     * readNames()
     * reads 10 names from a file and puts them into an array
     * @param fileName  name of file
     * @return array of read names
     */
	public String[] readNames(String fileName) {
        File file = new File(fileName);
        String[] names = new String[10];
        int counter = 0;
        try {
            Scanner fileScan = new Scanner(file);
            while (fileScan.hasNext()) { // while file has data yet to be read
                names[counter] = fileScan.nextLine(); // read next line and add it to names array
                counter++;
            }
            fileScan.close();
        }
        catch (FileNotFoundException ex) {
            System.err.println("File does not exist.");
        }
        return names;
	}

    /**
     * readNumbers1()
     * reads up to 20 numbers into an array from a file
     * @param fileName  name of file
     * @return array of numbers read from the file
     */
	public int[] readNumbers1(String fileName) {
        File file = new File(fileName);
        int[] numbers = new int[20];
        int counter = 0;
        try {
            Scanner fileScan = new Scanner(file);
            while (fileScan.hasNextInt() && counter < 20) { // while numbers are still yet to be read in file and counter less than 20
                numbers[counter] = fileScan.nextInt(); // add next int to numbers array
                counter++;
            }
            fileScan.close();
        }
        catch (FileNotFoundException ex) {
            System.err.println("File does not exist.");
        }

        return numbers;
	}

    /**
     * readNumbers2()
     * reads up to 20 numbers into an array from a file as long as they are integers
     * @param fileName  name of file
     * @return array of numbers read from the file
     */
	public int[] readNumbers2(String fileName) {
        File file = new File(fileName);
        int[] numbers = new int[20];
        int counter = 0;
        try {
            Scanner fileScan = new Scanner(file);
            while (fileScan.hasNext() && counter < 20) { // while numbers are still yet to be read in file and counter less than 20
                if (fileScan.hasNextInt()) { // if next value in file is integer
                    numbers[counter] = fileScan.nextInt(); // add integer value into numbers array
                    counter++;
                }
                else {
                    fileScan.next(); // if next value is not integer skip the value
                }
            }
            fileScan.close(); // closing scanner
        }
        catch (FileNotFoundException ex) {
            System.err.println("File does not exist.");
        }

        return numbers;
	}

    /**
     * readAddressBook()
     * reads in a name and number from a file into an array
     * @param fileName  name of file
     * @return array of names combined with numbers
     */
	public String[] readAddressBook(String fileName) {
        File file = new File(fileName);
        String[] addressBook = new String[5];
        int counter = 0;
        try {
            Scanner fileScan = new Scanner(file);
            while (fileScan.hasNext()) { // while file has data yet to be read
                addressBook[counter] = fileScan.nextLine() + ": " + fileScan.nextLine(); // add name and number to the addressBook array
                counter++;
            }
            fileScan.close();
        }
        catch (FileNotFoundException ex) {
            System.err.println("File does not exist.");
        }
        return addressBook;
	}
}
