/*
 * Doesn't work...
 */
public boolean xyzMiddle(String str) {
  
  int len = str.length();
  if (len < 3) return false;
  else if (len%2 == 1) {
    if (str.substring((len/2)-1, (len/2)+2).equals("xyz")) {
      return true;
    }
    else if (str.substring((len/2)-2, (len/2)+1).equals("xyz")) {
      return true;
    }
    return false;
  }
  return false;
}

/*
 * Work
 */

public boolean xyzMiddle(String str) {
    int len = str.length();
    if (len < 3) return false;
    if (len % 2 == 1)
        return str.substring(len/2 - 1, len/2 + 2).equals("xyz");
    return str.substring(len/2 - 2, len/2 + 1).equals("xyz") 
            || str.substring(len/2 - 1, len/2 + 2).equals("xyz");
}  

