public int diff21(int n) {
   int a = 0;
   
   if (n <= 21)
   {
     a = 21-n;
     return a;
   }
   else
   {
     a = 2*(n-21);
     return a;
   }
}
