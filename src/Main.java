import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//
//        int number;
//        while (true) {
//            try {
//                System.out.println("Zadaj cislo od 1 do 10");
//                number = scanner.nextInt();
//
//                if (number >= 1 && number <= 10) {
//                    break;
//                } else {
//                    System.out.println("Cislo nie je v rozmedzi od 1 az 10");
//                }
//            } catch (InputMismatchException e) {
//                    System.out.println("Musis zadat cislo");
//                    scanner.nextLine();
//                }
//            }
//        }
//
//    }

//        int[][] table = new int[5][5];
//
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                table[i][j] = (i + 1) * (j + 1);
//            }
//        }
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.println(" " + table[i][j] + " ");
//            }
//            System.out.println();
//        }

//     hangman

//        final Random random = new Random();
//        final String[] words = { "skillmea", "akademia", "volby", "pocitac" };
//
//        final String wordToGuess = selectRandomWord(random, words);
//        String hiddenWord = generateHiddenWord(wordToGuess);
//
//        int guessesLeft = 6;
//
//        final Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Welcome to Hangman!");
//        System.out.println("Guess the word: " + hiddenWord);
//
//        while (guessesLeft > 0 && hiddenWord.contains("_")) {
//            System.out.println("Enter a letter: ");
//            final char guess = scanLetter(scanner);
//
//            if (wordToGuess.contains(String.valueOf(guess))) {
//                hiddenWord = revealLetters(wordToGuess, hiddenWord, guess);
//                System.out.println("Correct guess! Updated word: " + hiddenWord);
//            } else {
//                guessesLeft--;
//                System.out.println("Incorrect guess! You have " + (guessesLeft) + " guesses left");
//            }
//        }
//
//        if (hiddenWord.contains("_")) {
//            System.out.println("Sorry, you have run out of guesses, the word was: " + wordToGuess);
//        } else {
//            System.out.println("Congratulations! You nailed it");
//        }
//    }
//
//    public static String revealLetters(String word, String hiddenWord, char letter) {
//        char[] hiddenWordChars = hiddenWord.toCharArray();
//
//        for (int i = 0; i < word.length(); i++) {
//            if (word.charAt(i) == letter) {
//                hiddenWordChars[i] = letter;
//            }
//        }
//
//        return String.valueOf(hiddenWordChars);
//    }
//
//    public static char scanLetter(Scanner scanner) {
//        char guess;
//
//        while (true) {
//            try {
//                String line = scanner.nextLine();
//                if (line.length() != 1) {
//                    throw new Exception("Line length is not 1. Please enter a single character");
//                }
//
//                guess = line.charAt(0);
//                if (!Character.isLetter(guess)) {
//                    throw new Exception("Character is not a letter. Please enter a single character");
//                }
//
//                break;
//            } catch (Exception e) {
//                System.out.println("Invalid input: " + e.getMessage());
//            }
//        }
//
//        return guess;
//    }
//
//    public static String generateHiddenWord(String word) {
//        return "_".repeat(word.length());
//    }
//
//    public static String selectRandomWord(Random random, String[] words) {
//        return words[random.nextInt(words.length)];
//    }

        List<String> names = new ArrayList<>();
        names.add("Jakub");
        names.add("Petra");
        names.add("Vojto");
        names.add("Jakub");

        System.out.println(names);

        for (String name : names) {
            System.out.println(name);
        }
        Set<String> nameSet = new HashSet<>();
        nameSet.addAll(names);
        System.out.println(nameSet);

        Map<String, Integer> personsAge = new HashMap<>();
        personsAge.put("Jakub", 18);
        personsAge.put("Petra", 25);

        System.out.println((personsAge.get("Jakub")));

        for (Map.Entry<String, Integer> entry: personsAge.entrySet()) {
            System.out.println(entry.getKey() + " ma " + entry.getValue() + " rokov");
        }
    }
}