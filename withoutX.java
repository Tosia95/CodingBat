public String withoutX(String str) {
  
  String res = "";
  
  if (str.length() < 2) {
    res = "";
    }
  else if (str.substring(0, 1).equals("x")) {
    if (str.substring(str.length()-1, str.length()).equals("x")) {
      res = str.substring(1, str.length()-1);
      }
    else {
      res = str.substring(1, str.length());
      }
  }
  else if (str.substring(str.length()-1, str.length()).equals("x")) {
    if (str.substring(0, 1).equals("x")) {
      res = str.substring(1, str.length()-1);
    }
    else {
      res = str.substring(0, str.length()-1);
    }
  }
  else {
    res = str;
  }
  return res;
}
