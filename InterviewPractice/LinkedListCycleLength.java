package InterviewPractice;

class ListNode1{
    int val;
    ListNode1 next;
    ListNode1(int x){
        val=x;
        next=null;

    }
}

public class LinkedListCycleLength {
    public static void main(String[] args) {
        ListNode1 head=new ListNode1(0);
        head.next=new ListNode1(1);
        head.next.next=new ListNode1(2);
        head.next.next.next = head.next;
        System.out.println("length of linkedList? " + hasCycle1(head));
    }

    private static int hasCycle1(ListNode1 head) {
        ListNode1 fast1=head;
        ListNode1 slow1=head;
        while(fast1 != null && fast1.next != null){

            fast1=fast1.next.next;
            slow1=slow1.next;

            if (fast1==slow1){
                ListNode1 temp=slow1;
                int length=0;
                do{
                    temp=temp.next;
                    length++;

                }while(temp != slow1);

                return length;

            }
        }
        return 0;

    }
}
