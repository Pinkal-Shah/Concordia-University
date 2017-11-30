#include <stdio.h>

// Variable declaration:
extern int a, b;
extern int c;
extern float f;

int maxprint();

int main () {

   maxprint();
   int x;
   int * p;
   x = 10;
   p = &x;
   printf("Value of x is: %d, address: %d and value by address: %d", x, p, * p);
   return 0;
}

int maxprint(){
	printf("I am the max \n");
	return 1;
}