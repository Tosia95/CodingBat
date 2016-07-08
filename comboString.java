public String comboString(String a, String b) {
  
  String result = "";
  
  if(a.length() > b.length()) {
    result = b+a+b;
  }
  else {
    result = a+b+a;
  }
  return result;
}
