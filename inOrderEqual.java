public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
  
  if (equalOk) {
    if (a <= b && b <= c) {
      return true;
    }
    return false;
  }
  else {
    if (a < b && b < c) {
      if (!(a == b || b == c || a+1 == b || b+1 == c)) {
        return true;
      }
      return false;
    }
    return false;
  }
}
