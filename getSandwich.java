public String getSandwich(String str) {
  
  int first = str.indexOf("bread");
  int last =  str.lastIndexOf("bread");
  String res = "";
  
  if (last == first) res = "";
  else res = str.substring(first+5, last);
  return res;
}
