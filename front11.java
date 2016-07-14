public Integer[] front11(int[] a, int[] b) {
  
  ArrayList <Integer> res = new ArrayList<Integer>();
  int c = 0;
  if (a.length < 1) {
    if (b.length < 1) {
      res.clear();
    }
    else {
      c = b[0];
      res.add(c);
    }
  }
  else if (b.length < 1) {
    if (a.length <1) {
      res.clear();
    }
    else {
      c = a[0];
      res.add(c);
    }
  }
  else if (a.length >= 1 && b.length >= 1) {
    c = a[0];
    res.add(c);
    c = b[0];
    res.add(c);
  }
  Integer[] result = res.toArray(new Integer[res.size()]);
  return result;
}
