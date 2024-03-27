package pl.pp;

public class MyFifthApp {
    public static void main(String[] args) {
        // Calling the new method to print characters
        printCharacter();
    }

    // Method to print a character specified number of times in a row and specified number of lines
    private static void printCharacter() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print('X');
            }
            System.out.println(); // Move to the next line after printing the specified number of characters in a row
        }
    }
}
