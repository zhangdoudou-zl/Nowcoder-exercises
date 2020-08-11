//输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）

/**
 * 解题思路：
 * 二叉树都是递归定义的，所以递归操作是比较常见的做法
 * 首先明白：子结构怎么理解，可以理解成子结构是原树的子树(或者一部分)
 * 也就是说，B要是A的子结构，B的根节点+左子树+右子树，都在A中存在且构成树形结构
 * 比较的过程要分为两步
 * 1. 先确定起始位置 2. 在确定从该位置开始，后续的左右子树的内容是否一致
 */
class TreeNode {
 int val = 0;
 TreeNode left = null;
 TreeNode right = null;
   public TreeNode(int val) {
    this.val = val;
   }
 }
public class Solution6 {
    public  boolean IsSameFromBegin(TreeNode begin, TreeNode beginSub) {
        if (beginSub == null) {
            //beginSub为null，说明已经比较完了
            return true;
        }
        if (begin == null) {
            //begin为空，说明beginSub不是你的子树
            return false;
        }
        if (begin.val != beginSub.val) {
            return false;
            //说明，整树中，有不相等的节点
        }
        //分别比较左右左右子树，必须都是相等的
        // 这里大家深度想想递归是怎么返回的【整个递归的结果，由最深层调用的结果决定】
        return IsSameFromBegin(begin.left, beginSub.left) && IsSameFromBegin(begin.right, beginSub.right);
    }

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        //第一步，先确定起始比较位置
        if (root1 == null || root2 == null) {
            return false;
        }
        boolean result = false;
        if (root1.val == root2.val) {
            //确立起始比较位置,从该位置尝试比较
            result = IsSameFromBegin(root1, root2);
        }
        //说明root1.val != root2.val or 上面的起始位置不满足需求，换一个起始位置
        if (result != true) {
            result = HasSubtree(root1.left, root2); //在左子树中找找 }
        }
        //同上
        if (result != true) {
            result = HasSubtree(root1.right, root2); //在左子树中找找 }

        }
        return result;
    }
}
