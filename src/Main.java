
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userWord;
        String removedFirstLetter;
        String userInput;

        System.out.println("Welcome to the English to Pig Latin word Translator!");

        // If Else statements are wrapped in a do while statement. So, the program will have
        // at least one iteration. If the users enters the required input the program will run
        // again. If the input is anything other than the required program will end.
        do {
            System.out.println("Enter a word to be translated into Pig Latin: ");
            userWord = scan.nextLine();

            // Converts user input to lowercase and gets the first letter of the word.
            // If the word begins with vowel the first letter is stored in letterVowel.
            // If the word begins with a consonant the first letter is stored in letterConsonant.
            char letterVowel = userWord.toLowerCase().charAt(0);
            char letterConsonant = userWord.toLowerCase().charAt(0);

            // If else statement below checks if the word begins with a vowel, consonant or neither.
            // If userWord begins with a vowel its prints the userWord with "way" concatenated.
            // If userWord begins with a consonant it take the first letter of the word,
            // adds it to the end of the word and add "ay" before printing it.
            if (letterVowel == 'a' || letterVowel == 'e' || letterVowel == 'i' ||
                    letterVowel == 'o' || letterVowel == 'u') {
                System.out.println("Your word translated to Pig Latin is: " + userWord + "way");
            }
            else if (letterConsonant != 'a' && letterConsonant != 'e' && letterConsonant != 'i' &&
                    letterConsonant != 'o' && letterConsonant != 'u' && !Character.isDigit(letterConsonant)) {
                removedFirstLetter = userWord.substring(1);
                System.out.println("Your word translated to Pig Latin is: " + removedFirstLetter +
                        letterConsonant + "ay");
            }
            else {
                System.out.println("Invalid entry.");
            }
            System.out.println("Would you like to translate another word? 'yes or no': ");
            userInput = scan.nextLine();
        } while (userInput.contains("y"));
    }
}

/*
Long version of else if statement that checks if the first letter is a consonant.
Done a lot quicker by checking to see if first letter is not a vowel.
else if (letterConsonant == 'b' || letterConsonant == 'c' || letterConsonant == 'd'
         || letterConsonant == 'f' || letterConsonant == 'g' || letterConsonant == 'h'
         || letterConsonant == 'j' || letterConsonant == 'k' || letterConsonant == 'l'
         || letterConsonant == 'm' || letterConsonant == 'n' || letterConsonant == 'p'
         || letterConsonant == 'q' || letterConsonant == 'r' || letterConsonant == 's'
         || letterConsonant == 't' || letterConsonant == 'v' || letterConsonant == 'w'
         || letterConsonant == 'x' || letterConsonant == 'y' || letterConsonant == 'z') {
         removedFirstLetter = userWord.substring(1);
         System.out.println("Your word translated to Pig Latin is: " + removedFirstLetter +
         letterConsonant + "ay");
         }*/

