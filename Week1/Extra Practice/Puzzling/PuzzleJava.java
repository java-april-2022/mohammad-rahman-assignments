import java.beans.MethodDescriptor;
import java.util.Random;


public class PuzzleJava {
    
    /*
    METHOD:  getTenRolls

    Write a method that will 
        generate  
            an array with 10 random numbers between 1 and 20 inclusive. 
        return 
    

    Ref: https://www.baeldung.com/java-generating-random-numbers-in-range
    
    public int getRandomNumberUsingNextInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    NOTE: 
    - The min parameter (the origin) is inclusive, whereas the upper bound max is exclusive.  
    - To make upper bound max inclusive, will add 1 to max inside the method.

    */

    public int[] getTenRolls(int min, int max) {
        Random random = new Random();
        int[] randomNumbers = new int[10];
        for(int i = 0; i < 10; i++) {
            randomNumbers[i] = random.nextInt((max + 1) - min) + min;
        }
        return randomNumbers;
    }


    /*
    METHOD: getRandomLetter

    Write a method that will:

    1. Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values). 
    
    2. Generate a random index between 0-25, and use it to pull a random letter out of the array.
    
    3. Return the random letter.

    */

}
