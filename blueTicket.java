public int blueTicket(int a, int b, int c) {
  
  int res = 0;
  
  if(a+b == 10 || a+c == 10 || b+c == 10) {
    res = 10;
  }
  else if (a+b == a+c+10 || a+b == b+c+10) {
    res = 5;
  }
  else {
    res = 0;
  }
  return res;
}
