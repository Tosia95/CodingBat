public boolean endOther(String a, String b) {
  
  String a1 = a.toLowerCase();
  String b1 = b.toLowerCase();
  if(b1.length() == a1.length()) {
    if (a1.equals(b1)) return true;
    return false;
  }
  else if (b1.length() > a1.length()) {
    if (b1.substring(b1.length()-a1.length(), b1.length()).equals(a1)) return true;
    return false;
  }
  else if (a1.length() > b1.length()){
    if (a1.substring(a1.length()-b1.length(), a1.length()).equals(b1)) return true;
    return false;
  }
  return false;
}
