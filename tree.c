#include<stdio.h>
#include<stdlib.h>
struct node{
    int val;
    struct node * left;
    struct node * right;
}*root,*newptr;

struct node* create_node(int x);
void node_tree();
void Insert_tree();
void in_order(struct node*);
void pre_order(struct node*);
void post_order(struct node*);
struct node*succ(struct node*);

struct node* create_node(int x){
    newptr = (struct node *)malloc(sizeof(struct node));
    newptr->val = x;
    newptr->left = NULL;
    newptr->right = NULL;
    return newptr;
}

void Insert_tree(struct node* newptr)
{
    if(root == NULL)
    {
        root = newptr;
    }
}

int main(){
    root = NULL;
   newptr = create_node(7);
   Insert_tree(newptr);
    // struct node * root = (struct node *)malloc(sizeof(struct node));
    // root->val = 1;
    // root->left = NULL;
    // root->right = NULL;

    // struct node * leftChild = (struct node *)malloc(sizeof(struct node));
    // leftChild->val = 2;
    // leftChild->left = NULL;
    // leftChild->right = NULL;

    // struct node * rightChild = (struct node *)malloc(sizeof(struct node));
    // rightChild->val = 3;
    // rightChild->left = NULL;
    // rightChild->right = NULL;

    // root->left = leftChild;
    // root->right = rightChild;

    printf("Root: %d\n", root->val);
    // printf("Left Child: %d\n", root->left->val);
    // printf("Right Child: %d\n", root->right->val);

    // return 0;
}