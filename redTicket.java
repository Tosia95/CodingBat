public int redTicket(int a, int b, int c) {
  
  int d = 0;
  
  if(a == 2 && b == 2 && c == 2) {
    d = 10;
  }
  else if (a == 1 && b == 1 && c == 1 || a == 0 && b == 0 && c == 0) {
    d = 5;
  }
  else if (b != a && c != a) {
    d = 1;
  }
  else {
    d = 0;
  }
  return d;
}
