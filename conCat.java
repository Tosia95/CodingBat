public String conCat(String a, String b) {
  
  String res = "";
  
  if (a.isEmpty()) {
    res = b;
  }
  else if (b.isEmpty()) {
    res = a;
  }
  else if (a.substring(a.length()-1, a.length()).equals(b.substring(0, 1))){
    res = a + b.substring(1, b.length());
  }
  else if (a.isEmpty()) {
    res = b;
  }
  else if (b.isEmpty()) {
    res = a;
  }
  else {
    res = a + b;
  }
  return res;
}
