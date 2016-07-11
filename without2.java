public String without2(String str) {
  
  String res = "";
  
  if (str.length() < 2){
    res = str;
  }
  else if(str.substring(0, 2).equals(str.substring(str.length()-2, str.length()))) {
    res = str.substring(2, str.length());
  }
  else if (str.length() == 2) {
    res = "";
  }
  else {
    res = str;
  }
  return res;
}
