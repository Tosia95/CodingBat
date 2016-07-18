public String fizzString(String str) {
  
  String res ="";
  
  if (str.startsWith("f") && str.endsWith("b")) {
    res = "FizzBuzz";
  }
  else if (str.startsWith("f")) {
    res = "Fizz";
  }
  else if (str.endsWith("b")) {
    res = "Buzz";
  }
  else {
    res = str;
  }
  return res;
}
