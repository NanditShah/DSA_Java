package Assignments.Trees;

public class CountNodesEqualToAverageOfSubtree {
    public static void main(String[] args) {
        System.out.println("Count Nodes Equal to Average of Subtree");
    }

    static int result = 0;
    public int averageOfSubtree(TreeNode root) {
        traverse(root);
        return result;
    }

    private int[] traverse(TreeNode node) {
        if (node == null) return new int[]{0, 0};

        int[] left = traverse(node.left);
        int[] right = traverse(node.right);

        int currSum = node.val + left[0] + right[0];
        int currCount = 1 + left[1] + right[1];

        if (currSum / currCount == node.val) result++;

        return new int[]{currSum, currCount};
    }
}
