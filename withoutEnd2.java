public String withouEnd2(String str) {
  
  String result = "";
  if (str.length() <= 2) result ="";
  else {
    result = str.substring(1, str.length()-1);
  }
  return result;
}
