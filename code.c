#include <stdio.h>
#include <math.h>
#include <ctype.h>
#include <string.h>
#include <stdlib.h>

typedef struct{
    char name[20];
    int score;
}node;

qsort(const void* a,const void* b){
    const node* s1=(const node*)a;
    const node* s2=(const node*)b;
    if(s1->score != s2->score){
        return (s1->score)-(s2->score);
    }
    return strcmp(s1->name,s2->name);
}

struct N{
    char name[20];
    int score;
    struct N* next;
};
typedef struct N Node;

char* change(char x[]){
    int t=strlen(x);
    for(int i=0;i<t;i++){
        x[i]=tolower(x[i]);
    }
    if(x[t-1]<'a' || x[t-1]>'z'){
        x[t-1]='\0';
    }
    return x;
}

Node* makenode(char x[]){
    Node* newnode=(Node*)malloc(sizeof(Node));
    strcpy(newnode->name,x);
    newnode->score=1;
    newnode->next=NULL;
    return newnode;
}

void addfirst(Node** head,char x[]){
    Node* newnode=makenode(x);
    if(*head==NULL){
        *head=newnode;
        return;
    }
    newnode->next=*head;
    *head=newnode;
}

int encode(char x[]){
    int t=strlen(x);
    while
}

Node* array[306];
node arr[306];
















