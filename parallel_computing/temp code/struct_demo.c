#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Book{
    char author[30];
    char title[30];
    float cost;
};

void print_struct(struct Book *book);

int main(){
    struct Book book1, *book2;
    strcpy(book1.author , "Shyam Kantesariya");
    book1.cost = 40;
    book2 = &book1;
    book2 -> cost = 100;
    //printf("Author is: %s, cost is: %f", book1.author, book1.cost);
    print_struct(&book1);
    return 0;
}

void print_struct(struct Book *book){
    printf("Author is: %s, cost is: %f", book -> author, book -> cost);
}