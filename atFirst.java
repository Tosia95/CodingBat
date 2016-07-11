public String atFirst(String str) {
  
  String res = "";
  
  if (str.length() >= 3) {
  res = str.substring(0, 2);
  }
  else if (str.length() == 2) {
    res = str;
  }
  else if (str.length() == 1) {
    res = str + "@";
  }
  else if (str.length() == 0) {
    res ="@@";
  }
  return res;
}

