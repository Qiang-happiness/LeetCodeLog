package questions;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;

public class MinStringSon {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> subMap = new HashMap<>();
        HashMap<Character, Integer> mainMap = new HashMap<>();
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int left = 0, right = 0;
        int length = 0, start = -1;
        String result = "";

        for (char ch : tt) {
            subMap.put(ch, subMap.getOrDefault(ch, 0) + 1);
        }

        for (left = 0, right = 0; right < s.length(); right++) {
            if (subMap.containsKey(ss[right])) {
                mainMap.put(ss[right], mainMap.getOrDefault(ss[right], 0) + 1);
                boolean tag = true;
                for (Character key : subMap.keySet()) {
                    if (mainMap.get(key) == null || mainMap.get(key) < subMap.get(key)) tag = false;
                }
                while (tag) {
                    if (length == 0 || right - left + 1 < length) {
                        length = right - left + 1;
                        start = left;
                    }
                    if (subMap.containsKey(ss[left])) {
                        mainMap.put(ss[left], mainMap.get(ss[left]) - 1);
                    }
                    if (mainMap.get(ss[left]) != null && mainMap.get(ss[left]) < subMap.get(ss[left])) tag = false;
                    left++;
                }
            }
        }
        if (length > 0 && start != -1)
        {
            char chars[] = new char[length];
            for (int i = start; i < start + length; i++)
            {
                chars[i-start] = ss[i];
            }
            result = String.valueOf(chars);
        }
        return result;
    }
}
