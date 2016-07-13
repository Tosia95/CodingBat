public int[] rotateLeft3(int[] nums) {
  
  int[]rotate = new int[3];
  rotate[0] = nums[1];
  rotate[1] = nums[2];
  rotate[2] = nums[0];
  return rotate;
}
