public boolean no23(int[] nums) {
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 2 || nums[i] == 3) {
      return false;
    }
    else if (nums[i+1] == 2 || nums[i+1] == 3) {
      return false;
    }
    return true;
  }
  return true;
}
