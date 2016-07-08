public String twoChar(String str, int index) {
  
  String res = "";
  if((str.length() - index) > str.length() || index >= (str.length()-1)) {
    res = str.substring(0,2);
  }
  else {
  res = str.substring(index, index+2);
  }
  return res;
}
