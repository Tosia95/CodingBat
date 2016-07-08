public String nTwice(String str, int n) {
  String res = str.substring(0, n) + str.substring(str.length()-n, str.length());
  return res;
}
