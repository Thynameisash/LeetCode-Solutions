# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def levelOrder(self, root):
        res = []
        if not root: return res
        queue = [root]
        
        while queue:
            cur_level = [] 
            for i in range(len(queue)):# 15,7
                node = queue.pop(0)
                
                if node.left:
                    queue.append(node.left)
                if node.right:
                    queue.append(node.right)
                    
                cur_level.append(node.val) # 3 9 20 15 7
            res.append(cur_level)
        return res
        