public int blackjack(int a, int b) {
  
  int res = 0;
  if (a == 21 || b == 21) res = 21;
  else if (a > 21 && b > 21) res = 0;
  else if (b <= 21 && a % 21 < b % 21) res = b;
  else if (a <= 21 && a % 21 > b % 21) res = a;
  
  return res;
}
