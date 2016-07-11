public String seeColor(String str) {
  
  String res = "";
    
  if (str.length() >= 3 && str.substring(0, 3).equals("red")) {
      res = "red";
  }
  else if (str.length() >= 4 && str.substring(0, 4).equals("blue")) {
    res = "blue";
  }
  
  else {
    res = "";
  }
  return res;
}
