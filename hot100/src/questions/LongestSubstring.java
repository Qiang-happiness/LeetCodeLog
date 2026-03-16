package questions;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hashSet = new HashSet<>();

        int currentLength = 0;
        int maxLength = 0;

        int left = 0;
        int right = 0;

        while(right < s.length())
        {
            if(hashSet.isEmpty() || !hashSet.contains(s.charAt(right)))
            {
                hashSet.add(s.charAt(right));
                currentLength++;
                right++;
            }
            else
            {
                hashSet.remove(s.charAt(left));
                currentLength--;
                left++;
            }

            if(currentLength > maxLength) maxLength = currentLength;
        }
        return maxLength;
    }
}
