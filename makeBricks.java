public boolean makeBricks(int small, int big, int goal) {
  
  if (small + (big * 5) >= goal) {
    if (goal / 5 <= big) {
      if (goal % 5 <= small) {
        return true;
      }
      return false;
    }
    else {
      if (small >= goal / 5 - big + goal % 5) {
        return true;
      }
      return false;
    }
  }
  return false;
}
