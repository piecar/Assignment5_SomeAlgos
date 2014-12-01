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
    
    /**
     * Question 3:
     * 
     * @param myList
     * @return 
     */
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
    
    /**
     * Question 5
     * Counts the number of nodes where the elements are within the specified 
     * range with an input count of 0.
     * This is done with inorder traversal. We could take advantage of the
     * fact that it is an AVL tree, but, on average we would still have to visit
     * all the nodes. Worst case is O(n)
     * @param rt
     * @param low
     * @param high
     * @param count
     * @return 
     */
    public int numOfNodes(treeNode rt, int low, int high, int count)
    {
        if(rt == null)
            return count += 0;
        count += numOfNodes(rt.left(), low, high, count);
        if (low <= rt.value() && high >= rt.value())
        {
            count++;
        }
        count += numOfNodes(rt.right(), low, high, count);
        
        return count;
    }
    
    public int deleteMin(int[] Heap)
    {
        if (count == 0)
            return -1;
        
        int temp = Heap[0];
        Heap[0] = Heap[count-1];
        Heap[count-1] = temp;
        count--;
    }
    
    /**
     * Question 9
     * Returns in an ArrayList all the elements that were less than a key value.
     * We traverse every array since at best, we do constant time and at worst
     * we do liniear time. Assuming that averaqge is n/2, we still have linear
     * time. So we may as well traverse the entire heap to find the elements.
     * @param Heap
     * @param val
     * @return 
     */
    public ArrayList<Integer> findAllLess(int[] Heap, int val)
    {
        ArrayList<Integer> retArr = new ArrayList<Integer>;
        int j=0; // keeps track of return array position 
        for(int i=0; i <= count; i++)
        {
            if(val < Heap[i])
            {
                retArr[j] = Heap[i];
                j++;
            }
        }
        return retArr;
    }
    
    /**
     * Question 11
     * Bubble Sort = Stable, doesn't get rearranged
     * Insertion Sort = Stable, doesn't get rearranged
     * Selection Sort = Stable, doesn't get rearranged
     * Merge Sort = Stable, doesn't get rearranged
     * Heap Sort = Not Stable, may end up in different parts of the same bucket
     * QuickSort = Not stable, may end up in different parts of the partition
     */
    
    /**
     * Question 13
     * MergeSort is the best algorithm to use for LinkedList. Instead of having
     * to create multiple arrays you can just change the pointers around to
     * start merging and sorting the parts. if we can rearrange the pointers,
     * then we do not have to create any new data structures to implement. The
     * coding for mergesort is also simpler with LinkedList
     */
    
    /**
     * Question 15
     * Using the first element is bad because we do not know how the array is
     * arranged. If it's unsorted, it amy be okay, if it's unsorted, it will be
     * a bad choice. Because the pivot is best when it is the median of all the
     * sorted elements, if the array we get is near sorted, then the first
     * element will create a very large partition. 
     */
    
    /**
     * Question 17
     */
}
