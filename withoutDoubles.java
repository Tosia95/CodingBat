public int withoutDoubles(int die1, int die2, boolean noDoubles) {
  
  int res = 0;
  if (noDoubles) {
    if (die1 == die2) {
      if (die1 == 6) {
        res = 7;
      }
      else {
        res = 2 * die1 + 1;
      }
    }
    else {
      res = die1 + die2;
    }
  }
  else {
    res = die1 + die2;
  }
  return res;
}
