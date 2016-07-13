public int maxTriple(int[] nums) {
  
  int res = 0;
  if (nums[0] > nums[nums.length-1]) {
    if (nums[0] < nums[(nums.length/2)]) {
      res = nums[(nums.length/2)];
    }
    else {
      res = nums[0];
    }
  }
  else if (nums[0] < nums[nums.length-1]) {
    if (nums[(nums.length/2)] > nums[nums.length-1]) {
      res = nums[(nums.length/2)];
    }
    else {
      res = nums[nums.length-1];
    }
  }
  else if (nums[(nums.length/2)] > nums[0]) {
    if (nums[(nums.length/2)] > nums[nums.length-1]) {
      res = nums[(nums.length/2)];
    }
    else {
      res = nums[nums.length-1]; 
    }
  }
  return res;
}
