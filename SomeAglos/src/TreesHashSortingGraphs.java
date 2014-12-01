/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pjime032
 */
public class TreesHashSortingGraphs {
    
    /**
     * Question 1:
     * Will keep the structure of the tree, but set all values in all nodes to
     * null. This is done as an Inorder traversal. To erase all values all nodes
     * need to be visited. As such there is no traversal that is inherently
     * better or worse. Time complexity is O(n).
     */
    public treeNode deleteTree(treeNde myNode)
    {
        if (myNode == null) return myNode; // checks if current node if null leaf.
        deketeTree(myNode.left()); // go to the left child
        myNode.setVal() = null; // set the node value to null
        deleteTree(myNode.right()); // go to the right child.
    }
    
    public treeNode dLLToBBST(LinkedList myList)
    {
        treeNode root = new treeNode(myList.remove);
        for(int i=0; i < myList.length(); i++)
        {
            Object temp = myList.remove();
            insert(temp); // insert is typical tree insert
            if(!root.isBalanced()) //if not a balanced tree
            {
                treeNode unBN = root.findUnbalance(); // find unbalanced node
                root.singleRotation(unBN);
            }
            if(!root.isBalanced()) //if stil not balanced, do double rotation
            {
                root.doubleRotation(unBN);
            }
        }
            
        
        
    }
    
}
