public boolean firstLast6(int[] nums) {
  
  int a = nums.length;
    if (a <= 2) {
      if (nums[0] == 6 || nums[a-1] == 6) {
        return true;
      }
      return false;
    }
  
  if (nums[0] == 6 || nums[a-1] == 6) {
    return true;
  }
  return false;
}
