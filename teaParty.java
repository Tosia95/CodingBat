public int teaParty(int tea, int candy) {
  
  int party = 0;
  
  if (tea < 5 || candy < 5) {
    party = 0;
  }
  else if (tea >= 5 && candy >= 5) {
    if (tea >= 2 * candy || candy >= 2 * tea) {
    party = 2;
  }
    else {
    party = 1;
    }
  }
  return party; 
}
