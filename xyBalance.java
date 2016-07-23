public boolean xyBalance(String str) {
  
  int lastX = str.lastIndexOf('x');
  int lastY = str.lastIndexOf('y');
  
  if (lastX == -1 && lastY == -1) return true;
  else if (lastX > 0 && lastY == -1) return false;
  else if (lastY > lastX) return true;
  return false;
}
