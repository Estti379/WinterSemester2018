//
// Created by estti379 on 24/09/18.
//

#ifndef LAB1_BINARYTREE_H
#define LAB1_BINARYTREE_H

#endif //LAB1_BINARYTREE_H

struct node
{
    char data;
    struct node *left;
    struct node *right;
};

struct node *root;


/* Insert a node with data at or after r */
struct node *insert_node(struct node *r, char data);
/* Search for a node with key value data in r */
struct node *search(struct node *r, char data);
/* Search for the node with minimum key value in r */
struct node *min(struct node *r);
/* Search for the node with maximum key value in r */
struct node *max(struct node *r);
/* Inorder traversal and output of tree with root r */
void print_tree_inorder(struct node *r);
/* Tree diagram output (left to right) of tree with root r and level l */
void print_tree_diagram(struct node *r, int l);