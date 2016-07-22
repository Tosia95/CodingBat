public String doubleChar(String str) {
  
  String result = "";
  
  for (int i = 0; i < str.length(); i++) {
    String res = str.substring(i, i+1) + str.substring(i, i+1);
    result += res;
  }
  return result;
}
