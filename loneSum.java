public int loneSum(int a, int b, int c) {
  
  int sum = 0;
  
  if (a == b && b == c) {
    sum = 0;
  }
  else if (a != b && b != c && a != c) {
    sum = a+b+c;
  }
  else if (a == b) {
    sum = c;
  }
  else if (c == a) {
    sum = b;
  }
  else if (b == c) {
    sum = a;
  }
  return sum;
}
