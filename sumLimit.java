public int sumLimit(int a, int b) {
  
  int sum = a+b;
  String sum1 = String.valueOf(sum);
  String a1 = String.valueOf(a);
  int aLength = a1.length();
  int sumLength = sum1.length();
  
  
  if (sumLength > aLength) {
    return a;
  }
  else if (aLength == sumLength) {
    return sum;
  }
  return 0;
}
