public int start1(int[] a, int[] b) {
  
  int count = 0;
  if (a.length <1) {
    if (b.length < 1) count = count;
    else if (b[0] == 1) count ++;
  }
  else if (b.length <1) {
    if (a.length < 1) count = count;
    else if (a[0] == 1) count ++;
  }
  else if (a.length >= 1 || b.length > 1) {
    if (a[0] == 1){
      if (b[0] == 1) count =+2;
      else count++;
    }
    else if (b[0] ==1) {
      if (a[0] == 1) count =+2;
      else count++;
    }
  }
  return count;
}
