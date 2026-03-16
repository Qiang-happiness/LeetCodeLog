package questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Anagrams {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length() < p.length()) return new ArrayList<>();

        char[] pp = p.toCharArray();
        List<Integer> result = new ArrayList<>();

        HashMap<Character, Integer>  pMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer>  sMap = new HashMap<Character, Integer>();
        for(char ch : pp)
        {
            if(pMap.containsKey(ch))
            {
                pMap.put(ch, pMap.get(ch) + 1);
            }
            else
            {
                pMap.put(ch, 1);
            }
        }

        int index = 0; //滑动窗口起始索引
        while(index <= s.length() - p.length())
        {
            int first = index;
            int last = index + p.length() - 1;

            if(sMap.isEmpty())
            {
                for(int i = first; i <= last; i++)
                {
                    if (sMap.isEmpty())
                    {
                        sMap.put(s.charAt(i), 1);
                        continue;
                    }

                    if(sMap.containsKey(s.charAt(i)))
                    {
                        sMap.put(s.charAt(i), sMap.get(s.charAt(i))+1);
                    }
                    else
                    {
                        sMap.put(s.charAt(i), 1);
                    }
                }
            }
            else
            {
                //上一元素-1
                if (sMap.get(s.charAt(first - 1)) == 1) sMap.remove(s.charAt(first - 1));
                else sMap.put(s.charAt(first - 1), sMap.get(s.charAt(first - 1)) - 1);
                //后一元素+1
                if (sMap.containsKey(s.charAt(last))) sMap.put(s.charAt(last), sMap.get(s.charAt(last)) + 1);
                else sMap.put(s.charAt(last), 1);
            }

            if (sMap.equals(pMap)) result.add(index);
            index++;
        }

        return result;
    }
}
