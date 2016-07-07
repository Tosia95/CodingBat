public String stringX(String str) {
  
  String news = "";
  
  for (int i = 0; i < str.length(); i++) {
    if (!(i > 0 && i < str.length()-1 && str.substring(i, i+1).equals("x"))){
      news = news + str.substring(i, i+1);
    }
  }
  return news;
  
}
