public int countHi(String str) {
  
  int res = 0;
  for (int i = 0; i < str.length()-1; i++) {
    if (str.substring(i, i + 2).equals("hi")) {
      res++;
    }
  }
  return res;
}
