//find the position of bit
#include <stdio.h>
int main ()
{
  int a = 10;
  int mask = 1;
  int shift;
  printf ("\nenter the number  :");
  scanf ("%d", &a);
  printf ("enter the position to find the bit  :");
  scanf ("%d", &shift);
  mask = mask << shift;
  // printf("%d",mask);
  if ((a & mask))
    {
      printf ("1");
    }
  else
    {
      printf ("0");
    }
  return 0;
}

