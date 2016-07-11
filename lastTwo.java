public String lastTwo(String str) {
  
  String res = "";
  
  if (str.length() >=3) {
    res = str.substring(0, str.length()-2) + str.substring(str.length()-1, str.length())
    +str.substring(str.length()-2, str.length()-1);
  }
  else if (str.length() == 2) {
    res = str.substring(1, str.length()) + str.substring(0, 1);
  }
  else {
    res = str;
  }
  return res;
}

