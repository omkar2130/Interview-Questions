package org.example.exapmles;
import java.util.*;

public class NearPalindrome {

    // Check if a number is a valid palindrome (excluding single-digit)
    static boolean isPalindrome(long num) {
        if (num < 10) return false;
        long original = num, reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }

    static long winnerTicketNumber(long n) {
        List<Long> result = new ArrayList<>();
        long offset = 1;

        while (result.size() < 5) {
            long lower = n - offset;
            long upper = n + offset;

            // Check upper first (to give priority to larger number in tie)
            if (isPalindrome(upper)) result.add(upper);
            if (lower != upper && lower >= 10 && isPalindrome(lower)) result.add(lower);

            offset++;
        }

        // Sort palindromes based on distance and value (prefer larger if same distance)
        result.sort((a, b) -> {
            long distA = Math.abs(a - n);
            long distB = Math.abs(b - n);
            if (distA != distB) return Long.compare(distA, distB);
            return Long.compare(b, a); // prefer larger
        });

        return result.get(4); // 5th nearest palindrome
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        System.out.println(winnerTicketNumber(n));
    }
}
