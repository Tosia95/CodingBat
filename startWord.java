public String startWord(String str, String word) {
  
  String res = "";
  
  if (word.length() >=2) {
    if (word.length() > str.length()) {
      res = "";
    }
    else if (word.substring(1, word.length()).equals(str.substring(1, word.length()))) { 
      res = str.substring(0, word.length());
    }
  }
  else if (word.length() < 2) {
    if (word.length() == str.length()) {
      res = str;
    }
    else if (word.length() <= str.length() && (word.equals(str.substring(0, 1))
    || word.equals(str.substring(1, 2)))) {
      res = str.substring(0, 1);
    }
  }
  return res;
}
