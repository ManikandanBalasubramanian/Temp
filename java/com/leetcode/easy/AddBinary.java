package com.leetcode.easy;

public class AddBinary {

  public String addBinary(String a, String b) {

    int aSize = a.length();
    int bSize = b.length();
    String output = "";
    char residue = '0';

    while (aSize > 0 || bSize > 0) {

      char aCh = aSize > 0 ? a.charAt(--aSize) : '0';
      char bCh = bSize > 0 ? b.charAt(--bSize) : '0';
      char outCh = '0';
      char nResidue = '0';

      String s = add(aCh, bCh);
      nResidue = s.charAt(0);

      s = add(s.charAt(1), residue);
      outCh = s.charAt(1);

      s = add(nResidue, s.charAt(0));
      residue = s.charAt(1);

      output = outCh + output;
    }

    if (residue == '1') output = residue + output;

    return output;
  }

  public String add(char a, char b) {
    if (a == '1' && b == '1') {
      return "10";
    } else if (a == '0' && b == '1') {
      return "01";
    } else if (a == '1' && b == '0') {
      return "01";
    } else {
      return "00";
    }
  }
}
