public boolean evenlySpaced(int a, int b, int c) {
  
  if (a == b && b == c) return true;
  if (a==b || b==c || c==a) return false;
  else if (Math.abs(c-a) == Math.abs(a-b) || 
  Math.abs(b-a) == Math.abs(b-c) || Math.abs(b-c) == Math.abs(a-c)) return true;
  return false;
}
