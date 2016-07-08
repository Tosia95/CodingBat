public String firstTwo(String str) {
  String result = "";
  if (str.length() <= 2) {
    result = str;
  }
  else {
    result = str.substring(0,2);
  }
  return result;
}
