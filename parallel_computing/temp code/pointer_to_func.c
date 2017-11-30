#include <stdio.h>

void square (int *p);
float getavg(int *arr, int size);

int main(){
    int x=10;
    square(&x);
    printf("Val of x: %d \n", x);

    int arr[] = {1,2,3,4};
    printf("Average is %f: ", getavg(arr, 4));
    return 0;
}

void square(int* p){
    *p *= *p;
}

float getavg(int *arr, int size){
    int sum = 0;
    for(int i=0; i<size; i++){
        sum += arr[i];
    }
    return (float) (sum/size);
}