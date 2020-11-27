package lab6;

import java.util.Arrays;
import java.util.List;

public class lab6 {
    public static int bell(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("n must be greater than zero");

        int[] numbers = new int[] {1};

        for (int i = 2; i <= n; i++) {
            int[] newNumbers = new int[numbers.length + 1];
            newNumbers[0] = numbers[numbers.length - 1];
            for (int j = 1; j < newNumbers.length; j++)
                newNumbers[j] = newNumbers[j - 1] + numbers[j - 1];

            numbers = newNumbers;
        }

        return numbers[numbers.length - 1];
    }

    public static String translateSentence(String sentence) {
        final String[] words = sentence.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (final String word : words)
            result.append(translateWord(word)).append(" ");

        return result.toString();
    }

    public static String translateWord(String word) {
        if (word.length() == 0)
            return word;

        List<Character> vowels = Arrays.asList('A', 'E', 'I', 'O', 'U', 'Y');
        if (vowels.contains(Character.toUpperCase(word.charAt(0))))
            if (Character.isAlphabetic(word.charAt(word.length() - 1)))
                return word + "yay";
            else
                return word.substring(0, word.length() - 1) + "yay" + word.charAt(word.length() - 1);
        else {
            StringBuilder newWord = new StringBuilder();
            int i = 0;
            while (!vowels.contains(Character.toUpperCase(word.charAt(i))))
                i++;

            final int end = Character.isAlphabetic(word.charAt(word.length() - 1)) ? word.length() : word.length() - 1;
            newWord.append(word, i, end);
            newWord.append(word.substring(0, i).toLowerCase());
            newWord.append("ay");
            if (end != word.length())
                newWord.append(word.charAt(word.length() - 1));
            if (Character.isUpperCase(word.charAt(0)))
                newWord.setCharAt(0, Character.toUpperCase(newWord.charAt(0)));
            return newWord.toString();
        }
    }
}
