public String minCat(String a, String b) {
  
  String res = "";
  
  if (a.length() > b.length()) {
    res = a.substring((a.length() - b.length()), a.length()) + b;
  }
  else {
    res = a + b.substring((b.length()-a.length()), b.length());
  }
  return res;
}
