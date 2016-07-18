public int caughtSpeeding(int speed, boolean isBirthday) {
  
  int ticket = 0;
  
  if(!isBirthday) {
    if (speed <= 60) {
      ticket = 0;
    }
    else if (speed > 60 && speed <= 80) {
      ticket = 1;
    }
    else {
      ticket = 2;
    }
  }
  else {
    if (speed <= 65) {
      ticket = 0;
    }
    else if (speed > 65 && speed <= 85) {
      ticket = 1;
    }
    else {
      ticket = 2;
    }
  }
  return ticket;
}
