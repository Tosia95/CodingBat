public Integer[] frontPiece(int[] nums) {
  
  ArrayList <Integer> res = new ArrayList<Integer>();
  int a = 0;
  if (nums.length < 1) {
    res.clear();
  }
  else if (nums.length == 1) {
    a = nums[0];
    res.add(a);
  }
  else if (nums.length >=2) {
    a = nums[0];
    res.add(a);
    a = nums[1];
    res.add(a);
  }
  Integer[] result = res.toArray(new Integer[res.size()]);
  return result;
}
