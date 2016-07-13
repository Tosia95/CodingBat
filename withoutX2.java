public String withoutX2(String str) {
  
  String res = "";
  
  if (str.length() < 2) {
    if (str.equals("x")) {
      res = "";
    }
    else {
      res = str;
    }
  }
  else if (str.substring(0, 1).equals("x")) {
    if (str.substring(1, 2).equals("x")) {
      res = str.substring(2, str.length());
    }
    else {
      res = str.substring(1, str.length());
    }
  }
  else if (str.substring(1, 2).equals("x")) {
    if  (str.substring(0, 1).equals("x")) {
      res = str.substring(2, str.length());
    }
    else {
      res = str.substring(0, 1) + str.substring(2, str.length());
    }
  }
  else {
    res = str;
  }
  return res;
}
