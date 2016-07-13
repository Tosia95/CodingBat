public int[] makeEnds(int[] nums) {
  int[] res = new int[2];
  
  if (nums.length < 1) {
    res[0] = 0; 
  }
  else if (nums.length == 1) {
    res[0] = nums[0];
    res[1] = nums[0];
  }
  else if (nums.length >=2) {
    res[0] = nums[0];
    res[1] = nums[nums.length-1];
  }
  return res;
}
