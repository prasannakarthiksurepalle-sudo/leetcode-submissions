/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode prev=head;
        ListNode cur=head.next;
        int first=-1,last=-1;
        int idx=2;
        int minDist=Integer.MAX_VALUE;
        int maxDist;
        while(cur.next!=null){
            if((cur.val > prev.val && cur.val > cur.next.val) || (cur.val < prev.val && cur.val < cur.next.val)){
                if(first==-1) first=idx;
                else{
                    minDist=Math.min(idx-last,minDist);
                }
                last=idx;
            };
            idx++;
            prev=cur;
            cur=cur.next;
        }
        maxDist=last-first;
        if(first==-1 || first==last) return new int[]{-1,-1};
        return new int[]{minDist,maxDist};
    }
}