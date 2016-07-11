public String lastChars(String a, String b) {
  
  String res = "";
  
  if (a.length() >= 2) {
    if (b.length() >= 2) {
    res = a.substring(0, 1) + b.substring(b.length()-1, b.length());
  }
    else if (b.length() == 1){
      res = a.substring(0, 1) + b;
    }
    else if (b.length() == 0){
      res = a.substring(0, 1) + "@";
    }
  }
  else if (a.length() == 1){
    if (b.length() >= 2) {
    res = a + b.substring(b.length()-1, b.length());
  }
    else if (b.length() == 1){
      res = a + b;
    }
    else if (b.length() == 0){
      res = a + "@";
    }
  }
  else if (a.length() == 0) {
    if (b.length() >= 2) {
    res = "@" + b.substring(b.length()-1, b.length());
  }
    else if (b.length() == 1){
      res = "@" + b;
    }
    else if (b.length() == 0){
      res =  "@@";
    }
  }
  return res;
}
