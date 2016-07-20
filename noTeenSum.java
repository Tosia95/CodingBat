public int noTeenSum(int a, int b, int c) {
  
  int sum = 0;
  int d = 0;
  if (fixTeen(a) != 0) {
    d = a;
  }
    sum +=d;
  if (fixTeen(b) != 0) {
    d = b;
  }
    sum += d;
  if (fixTeen(c) != 0) {
    d += c; 
  }
    sum += d;
  return sum;
}
public int fixTeen(int n) {
    
    int res = 0;
    if (n < 13 && n > 19 || n == 15 || n == 16) {
      res = n;
    }
    else if (n >= 13 && n <=19) {
      if (n != 15 && n != 16) {
        res = 0;
      }
    }
    
    return res;
}
