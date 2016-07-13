public int[] fix23(int[] nums) {
  
  int a = nums.length;
  for (int i = 0; i < a; i++) {
    if (nums[i] == 2 && nums[i+1] == 3) {
      nums[i+1] = 0; 
    }
  }
  return nums;
}
