import java.util.*;

public class StringProblems {
    public static boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        while (i<j) if (s.charAt(i++)!=s.charAt(j--)) return false;
        return true;
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length()!=b.length()) return false;
        int[] freq = new int[256];
        for (char c: a.toCharArray()) freq[c]++;
        for (char c: b.toCharArray()) if (--freq[c]<0) return false;
        return true;
    }

    public static Map<Character,Integer> charFrequency(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (char c: s.toCharArray()) map.put(c, map.getOrDefault(c,0)+1);
        return map;
    }

    public static String longestSubstringWithoutRepeat(String s) {
        int[] idx = new int[256];
        Arrays.fill(idx, -1);
        int start=0, best=0, bestStart=0;
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (idx[c]>=start) start = idx[c]+1;
            idx[c]=i;
            if (i-start+1>best){best=i-start+1; bestStart=start;}
        }
        return s.substring(bestStart, bestStart+best);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("madam"));
        System.out.println(isAnagram("listen","silent"));
        System.out.println(charFrequency("banana"));
        System.out.println(longestSubstringWithoutRepeat("abbaabcdbb"));
    }
}
