public String repeatSeparator(String word, String sep, int count) {
  
  String res = "";
  
  for (int i = 0; i < count - 1; i++) {
    res = res + word + sep;
  }
  if (word.length() > 0 && count > 0) {
  res = res + word; 
  }
  return res;
}
