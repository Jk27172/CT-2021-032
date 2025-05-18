package Q_07;

import java.util.Scanner;

public class WordReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to be replaced: ");
        String oldWord = scanner.nextLine();

        System.out.print("Enter the replacement word: ");
        String newWord = scanner.nextLine();

        String modifiedSentence = replaceWord(sentence , oldWord , newWord);
        System.out.println("Modified sentence: " + modifiedSentence);
    }

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(oldWord)) {
                words[i] = newWord;
            }
        }
        return String.join(" ",words);
    }
}
