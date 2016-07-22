public int makeChocolate(int small, int big, int goal) {
  
  int s = 0;
  
  if (goal < big * 5 && small >= goal % 5) {
      s =  goal%5;
  }
  else if (goal / 5 < big && small >= goal % 5) { 
      s = goal%5;
    }
  else if (goal / 5 >= big && small >= goal - big * 5) { 
    s = goal - big * 5;  
  }
  else if (big * 5 + small < goal || small < goal % 5) {
    s = -1;
  }
  return s;
}
