//to check the  number of setbits
#include <stdio.h>

int main ()
{
  int a,c=0;
  int mask = 1;
  int shift;
  int i;
  printf ("\nenter the number  :");
  scanf ("%d", &a);
    for(i=0;a!=0;i++)
    {
        a=a&(a-1);
        c++;
    }
  printf ("%d", c);
  return 0;
}


