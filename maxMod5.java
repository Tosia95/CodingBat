public int maxMod5(int a, int b) {
  
  int c = 0;
  if (a == b) {
    c = 0;
  }
  
  else if (a % 5 == b % 5) {
    if (a > b) {
      c = b;
  } else {
      c = a;
    }
  }
  else if (a > b) {
    c = a;
  }
  else {
    c = b;
  }
  return c;
}
