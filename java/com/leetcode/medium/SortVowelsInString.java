package com.leetcode.medium;

public class SortVowelsInString {

    public String sortVowels(String s) {
        ArrayList<Character> arrayList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                arrayList.add(c);
            }
        }

        if (arrayList.isEmpty())
            return s;

        Collections.sort(arrayList);

        StringBuilder str = new StringBuilder();

        for (int i = 0, j = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {

                str.append(arrayList.get(j++));
            } else {
                str.append(c);
            }
        }

        return str.toString();
    }
}