public int makeChocolate(int small, int big, int goal) {
  
  int s = 0;
  if (goal < 5) {
    if (small >= goal%5) {
      s = goal%5;
    }
    else {
      s = -1;
    }
  }
  else if (goal/5 >= big) {
    s = goal%5;
  }
  else {
    if (goal%5 < small) {
      s = goal - big + goal%5;
    }
    else {
      s = -1;
    }
  }
  return s;
}
