public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  
  if (isAsleep) {
    return false;
  }
  else if (isMorning) {
    if (isMom) {
      return true;
    }
    return false;
  }
  return true;
}
