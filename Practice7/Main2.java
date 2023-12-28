package 6-8;
package Practice7;

public class Main2 {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulatorImpl();

        String inputString = "Hello, World!";

        int characterCount = manipulator.countCharacters(inputString);
        System.out.println("Character count: " + characterCount);

        String oddPositionChars = manipulator.oddPositionCharacters(inputString);
        System.out.println("Odd position characters: " + oddPositionChars);

        String reversedString = manipulator.reverseString(inputString);
        System.out.println("Reversed string: " + reversedString);
    }
}

