// clock function in c
#include <stdio.h>
#include <time.h>

int main()
{
    clock_t start, end;
    double cpu_time_used;
    int a=12;
    int b=11;
    start = clock();
    if(!(a&1))
    {
        printf("hi");
    }
    end = clock();
    cpu_time_used = ((double) (end - start));
    printf("%f",cpu_time_used);
}




// int main()
// {
//     clock_t start, end;
//     double cpu_time_used;
//     int a=12;
//     int b=11;
//     start = clock();
//     if(a%2==0)
//     {
//         printf("hi");
//     }
//     end = clock();
//     cpu_time_used = ((double) (end - start));
//     printf("%f",cpu_time_used);
// }

