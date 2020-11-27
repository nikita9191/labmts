package lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class lab4 {
    public static String formatStr(int wordCount,
                                   int lineLength,
                                   String str) {
        String[] words = str.split(" ");
        StringBuilder lines = new StringBuilder();
        List<String> currentLine = new ArrayList<>();
        for (final String word : words) {
            int currentLength = currentLine.stream().mapToInt(String::length).sum();
            if (currentLength + word.length() <= lineLength)
                currentLine.add(word);
            else {
                if (lines.length() > 0)
                    lines.append("\n");
                currentLine
                        .forEach(w ->
                                lines
                                        .append(" ")
                                        .append(w));

                currentLine = new ArrayList<>();
                currentLine.add(word);
            }
        }

        if (!currentLine.isEmpty()) {

            if (lines.length() > 0)
                lines.append("\n");
            currentLine
                    .forEach(w ->
                            lines
                                    .append(" ")
                                    .append(w));
        }


        return lines.toString();
    }

    public static List<String> split(String str) {
        List<String> result = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        int lastIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(')
                stack.push(str.charAt(i));
            else {
                stack.pop();
                if (stack.isEmpty()) {
                    result.add(str.substring(lastIndex, i + 1));
                    lastIndex = i + 1;
                }
            }
        }

        return result;
    }

    public static String toCamelCase(String str) {
        StringBuilder result = new StringBuilder();

        boolean isCapital = false;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == '_')
                isCapital = true;
            else {
                result.append(isCapital
                        ? Character.toUpperCase(str.charAt(i))
                        : str.charAt(i));
                isCapital = false;
            }

        return result.toString();
    }

    public static String toSnakeCase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i)))
                result
                        .append("_")
                        .append(Character.toLowerCase(str.charAt(i)));
            else
                result.append(str.charAt(i));
        }


        return result.toString();
    }
}
