/** 
 * Name: Matthew Sylvester
 * Date: January 18th, 2022
 * Description: 
*/

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

class HamDist {
    public static void main (String[] args) {
        
        List<String> serials = new ArrayList<>();

        // Read file, throw exception if not found
        try {
            File file = new File("C:/Users/Fourt/Desktop/School/CS321 - Advanced programming techniques/Assignment 1/CS321_Assignment_1_Input.txt");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                serials.add(data);
            }

            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("No file named CS321_Assignment_1_input.txt was found.");
            e.printStackTrace();
        }

        //  In all serials, sum number of char of same val for given position
        String first = serials.get(0);
        Integer length = first.length();
        int[][] arr = new int[length][10]; // Array format: rows are digit position in serial, columns are digit value from 0 to 9

        for (String element : serials) {
            for (int i = 0; i < length; i++) {
                char ch = element.charAt(i);
                int val = Character.getNumericValue(ch);
                arr[i][val]++;
            }
        }

        /* Print out array
        for (int[] row : arr) {
            for (int i : row) {
              System.out.print(i + " ");
            }
            System.out.print("\n");
          }
        */

        // Check to see if each char of serial is distinct for given position
        List<String> wash = new ArrayList<>();

        for (String element : serials) {
            for (int i = 0; i < length; i++) {
                char ch = element.charAt(i);
                int val = Character.getNumericValue(ch);
                if (arr[i][val] != 1) {
                    break;
                }
                if (i == 7) {
                    wash.add(element);
                }
            }
        }

        /* Print out elements to be hand washed
        for (String element : wash) {
            System.out.println(element);
        }
        */

        int handNum = wash.size();
        int machineNum = serials.size() - handNum;
        System.out.println("The number of dishes to be hand washed is: " + handNum);
        System.out.println("The number of dishes to be machine washed is: " + machineNum);
    }
}