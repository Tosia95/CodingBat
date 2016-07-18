public int dateFashion(int you, int date) {
  
  int table = 0;
  
  if (you >=8 || date >=8) {
    if (you <= 2 || date <= 2) {
      table = 0;
    }
    else {
      table = 2;
    }
  }
  else if (you <= 2 || date <= 2) {
    table = 0;
  }
  else {
    table = 1;
  }
  return table;
}
