/*
 * Doesn't work and don't know why.
 */

public boolean prefixAgain(String str, int n) {
  
  String prefix = str.substring(0, n);
  int count = 0;
  int pref = prefix.length();
  for (int i = n; i < str.length() - pref; i++) {
    
    if (str.substring(i, i+pref).equals(prefix)) {
      count++;
    }

  }
  if (count > 0) return true;
  return false;
}
/*
 * It works... and don't know why too.
 */

public boolean prefixAgain(String str, int n) {
  
    String prefix = str.substring(0, n);
    
    for (int i = n; i <= str.length() - prefix.length(); i++)
        if (str.substring(i, i + prefix.length()).equals(prefix))
            return true;
    return false;
}