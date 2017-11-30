#include <stdio.h>
#include <time.h>
#include <stdlib.h>

int * get_random();
int a[10];
int main(){
    int *p;
    p = get_random();
    for(int i=0;i<10;i++){
        printf("%d\n", *(p+i));
    }
    return 0;
}

int * get_random(){
    //int a[10];
    srand( (unsigned)time( NULL ) );
    
    for(int i=0;i<10;i++){
        a[i] = rand();
        printf("%d\n", a[i]);
    }
    return a;
}