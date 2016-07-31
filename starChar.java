public String starOut(String str) {
  
  String res = "";
  
  for (int i = 0; i < str.length()-1; i++) {
    
    if (str.charAt(i) == '*') {
      res = str.substring(0, i-2) + str.substring(i+2);
    }
  }
  return res;
}
