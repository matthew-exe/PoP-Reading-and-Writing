import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
/**
 * FileWriting class - part of POP_ReadingAndWriting_STAFF
 * File reading and writing, and User input tasks
 * @author Dr Suzy Atfield-Cutts adapted from Melanie Coles
 * @since 2020
 */
public class FileWriting {

    /**
     * writeYourName()
     * writes inputted name to a file
     * @param name  inputted name
     * @return the saved name of the file
     * @throws Exception    error handling
     */
	public String writeYourName(String name) throws Exception {
        String fileName = "myNamefile.txt";
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName))); // new file writer
        Scanner nameScan = new Scanner(name); // new name scanner
        while (nameScan.hasNext()) { // while name scanner has more data to read
            out.println(nameScan.next()); // outputting name to file
        }
        out.close(); // closing file
        return fileName;
	}

    /**
     * writeRandomNumbers()
     * generate a quantity of random 4-digit numbers based on an inputted quantity
     * @param quantity  quantity of random numbers to generate
     * @return the saved name of the file
     * @throws Exception    error handling
     */
	public String writeRandomNumbers(int quantity) throws Exception {
		Random randomNumberGenerator = new Random(); // new random number generator
        String fileName = "randomNumbersFileToWrite.txt";
        if (20 < quantity) {
            quantity = 20;
        }
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName))); // new file writer
        for (int i=0; i < quantity; i++) {
            out.println(randomNumberGenerator.nextInt(9999 - 1000) + 1000); // outputting random 4-digit number to file
        }
        out.close(); // closing file
        return fileName;
	}

}
