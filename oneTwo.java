public String oneTwo(String str) {

  String res1 = "";
  if (str.length() < 3) res1 = "";
  else if (str.length()%3 == 0) {
    res1 = spare(str);
  }
  else if (str.length()%3 == 1) {
    res1 = spare(str.substring(0, str.length()-1));
  }
  else if (str.length()%3 == 2) {
    res1 = spare(str.substring(0, str.length()-2));
  }
  return res1;
}

public String spare (String str2) {
  
  char[] st = new char[str2.length()];
  for (int i = 0; i < str2.length(); i += 3) {
      char char1 = str2.charAt(i);
      char char2 = str2.charAt(i+1);
      char char3 = str2.charAt(i+2);
      st[i] = char2;
      st[i+1] = char3;
      st[i+2] = char1; 
    }
  String res = new String(st);
  return res;
}
