/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2){
    struct ListNode reslist;
    struct ListNode *res=&reslist;
    while(list1!=NULL && list2!= NULL)
    {
        if(list1->val<=list2->val)
        {
            res->next=list1;
            list1=list1->next;
        }
        else
        {
            res->next=list2;
            list2=list2->next;
        }
        res=res->next;
    }
    
    if(list1==NULL && list2 != NULL){
        res->next=list2;
    }
    else if(list2==NULL && list1 != NULL){
        res->next=list1;
    }
    return reslist.next;
}   

struct ListNode* sortList(struct ListNode* head){
    if(head == NULL)
        return NULL;
    if(head->next == NULL)
        return head;
    struct ListNode *mid, *slow = head, *fast = head->next;

    while(fast->next!=NULL && fast->next->next!=NULL )
    {
        slow=slow->next;
        fast=fast->next->next;
        
    }
    mid=slow->next;
    slow->next=NULL;

    return mergeTwoLists(sortList(head),sortList(mid));
}
