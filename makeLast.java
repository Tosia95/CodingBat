public int[] makeLast(int[] nums) {
  
  int[] res = new int[2 * nums.length];
  
  res[res.length-1] = nums[nums.length-1];
  return res;
}
