public int greenTicket(int a, int b, int c) {
  
  int d = 0;
  
  if (a == b && a == c && b == c) {
    d = 20;
  }
  else if (a == b || b == c || a == c) {
    d = 10;
  }
  else {
    d = 0;
  }
  return d;
}
