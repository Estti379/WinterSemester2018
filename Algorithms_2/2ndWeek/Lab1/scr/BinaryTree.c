//
// Created by estti379 on 24/09/18.
//

#include "stdio.h"
#include "stdlib.h"

#include "BinaryTree.h"


/* Insert a node with data at or after r */
struct node *insert_node(struct node *r, char data) {
    if (r == NULL) {
        r = malloc(sizeof(struct node*));
        r->data = data;
        r->left = NULL;
        r->right = NULL;
    } else if (data < r->data) {
        r->left = insert_node(r->left, data);
    } else if (data > r->data) {
        r->right = insert_node(r->right, data);
    } else if (data == r->data) {
        /* enpty */
    }
    return r;
}


/* Search for a node with key value data in r
 * Returns NULL if no such key value found
 */
struct node *search(struct node *r, char data) {
    struct node *searchResult = NULL;

    if (r == NULL){
        /*empty*/
    }else if(r->data == data) {
        searchResult = r;
    } else if (r->data < data) {
        searchResult = search(r->left, data);
    } else if (r->data > data) {
        searchResult = search(r->right, data);
    }

    return searchResult;
}

/* Search for the node with minimum key value in r */
struct node *min(struct node *r) {
    if(r == NULL || r->left == NULL ){
        return r;
    } else {
        return min(r->left);
    }
}

/* Search for the node with maximum key value in r */
struct node *max(struct node *r) {
    if(r == NULL || r->right == NULL ){
        return r;
    } else {
        return min(r->right);
    }
}

/* Inorder traversal and output of tree with root r */
void print_tree_inorder(struct node *r) {
    if (r != NULL) {
        print_tree_inorder(r->left);
        printf("%c, ", r->data);
        print_tree_inorder(r->right);
    }
}

/* Tree diagram output (left to right) of tree with root r and level l */
void print_tree_diagram(struct node *r, int l) {
    if( r == NULL ) {
        return;
    }

    print_tree_diagram(r->right, l+1);
    for (int i = 0; i < l; i++) {
        printf("\t");
    }
    printf("%c\n", r->data);
    print_tree_diagram(r->left, l+1);
}