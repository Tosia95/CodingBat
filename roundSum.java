public int roundSum(int a, int b, int c) {
  
  int a1 = round10(a);
  int b1 = round10(b);
  int c1 = round10(c);
  int sum = a1+b1+c1;
  return sum;
}
public int round10(int n) {
  
  int res = 0;
  int s = 10 - n % 10;
  if (n % 10 >= 5 ) {
    res = n + s;
  }
  else {
    res = n - n % 10;
  }
  return res;
}
