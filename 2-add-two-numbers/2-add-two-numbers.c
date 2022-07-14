/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2){
 int sum = 0;
    struct ListNode *ret = NULL, *prev = NULL;
    while (l1 || l2 || sum)
    {
        if (l1!=NULL)
        {
            printf("%d\n",sum);
            sum += l1->val;
            l1 = l1->next;
        }
        if (l2!=NULL)
        {
            printf("%d\n",sum);
            sum += l2->val;
            l2 = l2->next;
        }

        struct ListNode *newnode = (struct ListNode*) malloc(sizeof(struct ListNode));
        newnode->val = sum % 10;
        if (prev!=NULL)
            prev->next = newnode;
        else
            ret = newnode;
        prev = newnode;
        sum /= 10;
    }
    prev->next = NULL;
    return ret;
    
}