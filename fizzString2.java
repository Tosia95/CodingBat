public String fizzString2(int n) {
  
  String res = "";
  
  if (n % 3 == 0 && n % 5 == 0) {
    res = "FizzBuzz!";
  }
  else if (n % 3 == 0) {
    res = "Fizz!";
  }
  else if (n % 5 == 0) {
    res = "Buzz!";
  }
  else {
    res = n + "!";
  }
  return res;
}
