public String extraFront(String str) {
  
  String res = "";
  
  
  if (str.length() > 2) {
    String f = str.substring(0,2);
    res = f+f+f;
  }
  else if (str.length() <= 2) {
    res = str+str+str;
  }
  return res;
}
