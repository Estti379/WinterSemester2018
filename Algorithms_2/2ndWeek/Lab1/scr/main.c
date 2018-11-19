#include <stdio.h>
#include <stdlib.h>

#include "BinaryTree.h"

char input[] = { "INPUTSTRING" };


int main(){
    struct node* bsTree;

    int i= 0;
    while (input[i] != '\0') {
        bsTree = insert_node(bsTree, input[i]);
        i++;
    }

    print_tree_inorder(bsTree);
    printf("\n\n");
    print_tree_diagram(bsTree,0);


    return 0;
}