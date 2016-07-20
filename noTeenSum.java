public int noTeenSum(int a, int b, int c) {
  
  boolean a1 = fixTeen(a);
  boolean b1 = fixTeen(b);
  boolean c1 = fixTeen(c);
  int sum = 0;
  int d = 0;
  if (a1) {
    if (b1) {
      if (c1) {
        sum = a+b+c;
      }
      else {
        sum = a+b;
      }
    }
    else {
      if (c1) {
        sum = a+c;
      }
      else {
        sum = a;
      }
    }
  }
  else {
    if (b1) {
      if (c1) {
        sum = b+c;
      }
      else {
        sum = b;
      }
    }
    else {
      if (c1) {
        sum = c;
      }
      else { 
        sum = 0;
    }
  }
}
  return sum;
}
public boolean fixTeen(int n) {
    
    if (n == 15 || n == 16) {
      return true;
    }
    else if (n >= 13 && n <= 19) {
      return false;
    }
    else {
        return true;
    }
}
