public String mixString(String a, String b) {
  
  String result = "";
  String shorter = (a.length() < b.length()) ? a : b;
  String longer = (a.length() > b.length()) ? a : b;
  for (int i = 0; i < shorter.length(); i++) {
    result = result + a.charAt(i) + b.charAt(i);
  }
  if (a.length() != b.length()) {
  result = result + longer.substring(shorter.length(), longer.length()); 
  }
  return result;
}
