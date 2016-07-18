public int teenSum(int a, int b) {
  
  int sum = 0;
  
  if (a >= 13 && a <= 19 || b >= 13 && b <= 19) {
    sum = 19;
  }
  else {
    sum = a + b;
  }
  return sum;
}
