import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userWord;
        String userInput;

        System.out.println("Welcome to the English to Pig Latin word Translator!");

        do {
            System.out.println("Enter a word to be translated into Pig Latin: ");
            userWord = scan.nextLine().toLowerCase();
            char letter;
            int index = 0;

            // for loop that checks each character of the userWord.
            for (int i = 0; i < userWord.length(); i++) {
                letter = userWord.charAt(i);
                {
                    if (letter == 'a' || letter == 'e' || letter == 'i' ||
                            letter == 'o' || letter == 'u') {

                        // Checks if the index is equal to zero , if true the loop only performed once
                        // and the first letter of the userWord was a vowel.
                        // The inner loop condition is true and it prints out the userWord with "way" added.
                        if (index == 0) {
                            System.out.println("Your word translated to Pig Latin is: " + userWord + "way");

                            // Else statement runs if the index is not 0. Index greater than 0 means
                            // the loop ran more than once and the first letter was not a vowel.
                        } else {
                            System.out.println("Your word translated to Pit Latin is: "
                                    + userWord.substring(index, userWord.length())
                                    + userWord.substring(0, index) + "ay");
                        }
                        break;
                    } else {
                        // If the letter is not a vowel the index is incremented by 1 to check the
                        // letter at the next index.
                        index++;
                    }
                }
            }
            System.out.println("Would you like to translate another word? 'yes or no': ");
            userInput = scan.nextLine();
        } while (userInput.contains("y"));
    }
}