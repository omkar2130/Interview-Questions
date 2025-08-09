package org.example.exapmles;
import java.util.*;

public class WiFiPass
{

    static void permutations (String str)
    {
        // Separate digits and letters
        List<Character> digits = new ArrayList<>();
        List<Character> letters = new ArrayList<>();

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits.add(ch);
            } else if (Character.isLetter(ch)) {
                letters.add(ch);
            }
        }

        // Generate all unique permutations
        List<String> digitPerms = getPermutations(digits);
        List<String> letterPerms = getPermutations(letters);

        Set<String> result = new TreeSet<>();

        for (String d : digitPerms) {
            for (String l : letterPerms) {
                result.add(d + l);
            }
        }

        for (String res : result) {
            System.out.print(res+" ");
        }
    }

    static List<String> getPermutations(List<Character> chars)
    {
        List<String> result = new ArrayList<>();
        boolean[] used = new boolean[chars.size()];
        Collections.sort(chars); // sort to ensure lexicographical order
        backtrack(chars, new StringBuilder(), used, result);
        return result;
    }

    static void backtrack(List<Character> chars, StringBuilder current, boolean[] used, List<String> result)
    {
        if (current.length() == chars.size()) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < chars.size(); i++) {
            if (used[i]) continue;
            if (i > 0 && chars.get(i) == chars.get(i - 1) && !used[i - 1]) continue;

            used[i] = true;
            current.append(chars.get(i));
            backtrack(chars, current, used, result);
            current.deleteCharAt(current.length() - 1);
            used[i] = false;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        permutations(str);
    }
}
