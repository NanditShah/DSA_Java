package DSASheet.DFS.Medium;

public class HouseRobberIII {
    public static void main(String[] args) {
        System.out.println("House Robber III");
    }

     public class TreeNode {
         int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    public int rob(TreeNode root) {
        int[] twoPossibleAns = robHelper(root);
        return Math.max(twoPossibleAns[0],twoPossibleAns[1]);
    }

    public int[] robHelper(TreeNode root){
        if(root == null) return new int[] {0,0};

        int[] left = robHelper(root.left);
        int[] right = robHelper(root.right);

        int[] result = new int[2];
        result[0] = root.val+left[1]+right[1];
        result[1] = Math.max(left[0],left[1])+Math.max(right[0],right[1]);

        return result;
    }
}
