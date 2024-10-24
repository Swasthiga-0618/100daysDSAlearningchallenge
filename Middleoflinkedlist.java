class Solution {
    public ListNode middleNode(ListNode head) {
        if(size(head)<2){
            return head;
        }
        int n = size(head)/2;
        int count = 0;
        ListNode middle = head;
        while(middle!=null){
            middle = middle.next;
            count ++;
            if(count==n){
                return middle;
            }
        }
        return middle;
    }
    public int size(ListNode head){
        int count = 0;
        ListNode current = head;
        while(current!=null){
            count ++;
            current = current.next;
        }
        return count;
    }
}
