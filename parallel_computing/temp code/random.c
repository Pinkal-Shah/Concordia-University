#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#include "mpi.h"

int main ()
{
    printf ("Our first number: %d\n", rand());
    srandom ( time(NULL) );

    printf ("Some random number: %d\n", rand());
    srand ( 1 );

    printf ("The first number again: %d\n", rand() );

    return 0;
}