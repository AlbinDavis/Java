package problems.programs;

import static problems.programs.TreeDFS.preOrder;

public class MakeBBSTFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        preOrder(makeBBST(0,arr.length-1,arr));
    }

    private static TreeNode<Integer> makeBBST(int left, int right, int[] arr) {
        if(left > right)
            return null;
        int mid = left + (right-left)/2;
        TreeNode<Integer> root  = new TreeNode<>(arr[mid]);
        root.left = makeBBST(left,mid-1,arr);
        root.right = makeBBST(mid+1,right,arr);
        return root;
    }
}
