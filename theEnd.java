public String theEnd(String str, boolean front) {
  
  String result = "";
  
  if(front) {
    result = str.substring(0,1);
  }
  else {
    result = str.substring(str.length()-1, str.length());
  }
  return result;
}
