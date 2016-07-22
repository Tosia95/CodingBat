public boolean xyzThere(String str) {
  
  int res = 0;
  
  if (str.length() >= 3) {
    if (str.substring(0, 3).equals("xyz")) return true;
  
    for (int i = 0; i < str.length()-3; i++) {
      if (str.charAt(i) != ('.') && 
      str.substring(i+1, i+4).equals("xyz")){
        res++;
      } 
    }
  }
  if (res > 0) return true;
  return false;
}
