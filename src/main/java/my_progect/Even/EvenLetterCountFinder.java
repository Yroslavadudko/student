package lessons.lesson_9.home_work.mykola_dudko;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EvenLetterCountFinder {

    public static void main(String[] args) {
        String[] myStrings = {"mamy", "abcde", "tuta", "tuti fruti", "12345", "papy"};

        List<String> result = findStringsWithEvenLetterCount(myStrings);

        System.out.println("Resulting Strings: ");
        for (String str : result) {
            System.out.println(str);
        }

        Set<Character> uniqueChars = findUniqueCharacters(result);
        System.out.println("Unique characters in resulting words: " + new ArrayList<>(uniqueChars));

        List<Character> uniqueCharsList = findUniqueCharactersAsList(result);
        System.out.println("Unique characters in resulting words as list: " + uniqueCharsList);

        System.out.println("Characters in the first resulting string (using for loop):");
        for (int i = 0; i < result.get(0).length(); i++) {
            char c = result.get(0).charAt(i);
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.println("Characters in the first resulting string (using while loop):");
        int i = 0;
        while (i < result.get(0).length()) {
            char c = result.get(0).charAt(i);
            System.out.print(c + " ");
            i++;
        }
    }

    public static List<String> findStringsWithEvenLetterCount(String[] strings) {
        List<String> result = new ArrayList<>();
        Set<Character> uniqueChars = new HashSet<>();

        for (String str : strings) {
            int count = 0;
            for (char c : str.toCharArray()) {
                if (Character.isLetter(c)) {
                    count++;
                    uniqueChars.add(Character.toLowerCase(c));
                }
            }
            if (count % 2 == 0) {
                result.add(str);
            }
            if (result.size() == 2) {
                break;
            }
        }
        return result;
    }

    public static Set<Character> findUniqueCharacters(List<String> strings) {
        Set<Character> uniqueChars = new HashSet<>();
        for (String str : strings) {
            for (char c : str.toCharArray()) {
                if (Character.isLetter(c)) {
                    uniqueChars.add(Character.toLowerCase(c));
                }
            }
        }
        return uniqueChars;
    }

    public static List<Character> findUniqueCharactersAsList(List<String> strings) {
        Set<Character> uniqueChars = findUniqueCharacters(strings);
        return new ArrayList<>(uniqueChars);
    }
}

