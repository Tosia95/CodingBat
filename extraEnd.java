public String extraEnd(String str) {
  
  String res = str.substring(str.length()-2, str.length());
  String result = res+res+res;
  return result;
}
