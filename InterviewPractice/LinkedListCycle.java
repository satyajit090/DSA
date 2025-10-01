package InterviewPractice;

class  ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
        next=null;
    }
}

public class LinkedListCycle {

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);

        System.out.println("Has Cycle? " + hasCycle(head1)); // false

        // Example 2: Linked List with cycle
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = head2; // creates cycle

        System.out.println("Has Cycle? " + hasCycle(head2)); // true
    }

    public static boolean hasCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        while(fast !=null && fast.next != null){
                fast=fast.next.next;
                slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
