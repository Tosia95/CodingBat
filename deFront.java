public String deFront(String str) {    
  
  String res ="";
  if (str.substring(0, 1).equals("a")) {
    
    if (str.substring(1, 2).equals("b")) {
    res = "a" + "b" + str.substring(2, str.length());
  }
    else {
      res = "a" + str.substring(2, str.length());
    }
  }
  else if (str.substring(1, 2).equals("b")) {
    
    if (str.substring(0, 1).equals("a"))  {
      res = "a" + "b" + str.substring(2, str.length());
    }
    else {
      res = "b" + str.substring(2, str.length());
      }
    }
    else {
      res = str.substring(2, str.length());
      }
      return res;
    }
  

