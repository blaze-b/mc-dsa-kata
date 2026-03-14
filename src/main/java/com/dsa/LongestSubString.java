package com.dsa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubString {

  public int getLongestSubString(String s) {

    int left = 0;
    int maxLength = 0;
    int maxStart = 0;

    Set<Character> characterCheck = new HashSet<>();

    for (int right = 0; right < s.length(); right++) {

      char inputChar = s.charAt(right);

      while (characterCheck.contains(inputChar)) {
        characterCheck.remove(s.charAt(left));
        left++;
      }

      characterCheck.add(inputChar);

      if (right - left + 1 > maxLength) {
        maxLength = right - left + 1;
        maxStart = left;
      }

    }

    System.out.println(s.substring(maxStart, maxStart + maxLength));

    return maxLength;

  }


  public int getLongestSubStringUsingMap(final String s) {

    Map<Character, Integer> map = new HashMap<>();

    int left = 0;
    int maxLength = 0;
    int maxStart = 0;

    for (int right = 0; right < s.length(); right++) {

      char currentChar = s.charAt(right);
      if (map.containsKey(currentChar) && map.get(currentChar) >= left)  {
        left = map.get(currentChar) + 1;
      }

      map.put(currentChar, right);


      if (right - left + 1 > maxLength) {
        maxLength = right - left + 1;
        maxStart = left;
      }
    }

    System.out.println(s.substring(maxStart, maxStart + maxLength));

    return maxLength;

  }

}
