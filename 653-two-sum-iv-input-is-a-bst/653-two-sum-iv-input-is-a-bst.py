# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def findTarget(self, root: Optional[TreeNode], k: int) -> bool:
        def inorder(root,res) -> List[int]:
            if not root:
                return res.append
            inorder(root.left,res)
            res.append(root.val)
            inorder(root.right,res)
            return res
        res=inorder(root,[])
        if len(res)==1:
            return False
        for i in range(len(res)):
            for j in range(i+1,len(res)):
                if res[i]+res[j]==k:
                    return True
        return False
            