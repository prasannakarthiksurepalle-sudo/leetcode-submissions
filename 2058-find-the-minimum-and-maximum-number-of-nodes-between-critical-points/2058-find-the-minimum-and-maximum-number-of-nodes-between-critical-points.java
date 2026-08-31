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
        List<Integer> ls=new ArrayList<>();
        int idx=2;
        while(cur.next!=null){
            if((cur.val > prev.val && cur.val > cur.next.val) || (cur.val < prev.val && cur.val < cur.next.val)) ls.add(idx);
            idx++;
            prev=cur;
            cur=cur.next;
        }
        if(ls.size()<2) return new int[]{-1,-1};
        Collections.sort(ls);
        int sz=ls.size();
        int maxDist=ls.get(sz-1)-ls.get(0);
        int minDist=100001;
        for(int i=0;i<sz-1;i++) minDist=Math.min(minDist,ls.get(i+1)-ls.get(i));
        return new int[]{minDist,maxDist};
    }
}