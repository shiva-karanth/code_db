// clear the ith setbit
#include <stdio.h>
int main ()
{
  int a;
  int mask = 1;
  int shift;
  printf ("\nenter the number  :");
  scanf ("%d", &a);
  printf ("enter the position to clear the bit  :");
  scanf ("%d", &shift);
  mask = mask << shift;
  //printf("%d",mask);
  a = a & (~mask);
  printf ("%d", a);
  return 0;
}

