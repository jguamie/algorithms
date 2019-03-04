# Binary Trees (BT)
A "leaf node" has no subtrees, otherwise it is an "internal" node. Binary trees should not be confused with [B-trees](https://en.wikipedia.org/wiki/B-tree).
## Binary Search Tree (BST)
A "binary search tree" (BST) is also known as a "ordered binary tree." Elements to the left are less-or-equal (<=) to a given node. Elements to the right are greater (>) to the node.
## Traversals
### Depth First Traversals
#### Pre-Order (NLR)
Pre-order evaluates in Node, Left, Right order.
1. Visit the node.
1. Traverse the left subtree, i.e., call Preorder(left-subtree)
1. Traverse the right subtree, i.e., call Preorder(right-subtree) 
#### In-Order (LNR)
In-order evaluates in Left, Node, Right order.
1. Traverse the left subtree, i.e., call Inorder(left-subtree)
1. Visit the node.
1. Traverse the right subtree, i.e., call Inorder(right-subtree)
#### Post-order (LRN)
Post-order evaluates in Left, Right, Node order.
1. Traverse the left subtree, i.e., call Postorder(left-subtree)
1. Traverse the right subtree, i.e., call Postorder(right-subtree)
1. Visit the node.
