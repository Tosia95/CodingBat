public boolean bobThere(String str) {
  
  int res = 0;
  
  for (int i = 0; i < str.length()-2; i++) {
    if(str.charAt(i) == 'b' && str.charAt(i+2) == 'b') res++;
  }
  if (res > 0) return true;
  return false;
}
