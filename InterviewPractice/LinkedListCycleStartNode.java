package InterviewPractice;

class ListNode2 {
     int val;
     ListNode2 next;
     ListNode2(int x){
         val=x;
         next=null;
     }
}
public class LinkedListCycleStartNode {
    public static void main(String[] args) {
        ListNode2 head3=new ListNode2(0);
        head3.next=new ListNode2(1);
        head3.next.next=new ListNode2(2);
        head3.next.next.next=new ListNode2(3);
        head3.next.next.next.next=new ListNode2(4);
        head3.next.next.next.next.next=new ListNode2(5);
        head3.next.next.next.next.next.next=head3.next.next.next;
        System.out.println("detect of linkedList loop start? " + startLoop(head3).val);


    }

    private static ListNode2 startLoop(ListNode2 head3) {
        int length =0;
        ListNode2 fast=head3;
        ListNode2 slow=head3;

        while(fast!=null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
                length=legnthOfLoop(slow);
                System.out.println(slow.val);
                break;
            }
        }

        if(length==0){
            return null;
        }
        //find the start node
        ListNode2 f=head3;
        ListNode2 s=head3;

        while(length>0){
            s=s.next;
            length--;
        }
        //keep moving both forward and they will meet at cycle start

        while(f!=s){
            f=f.next;
            s=s.next;
        }

        return f;
    }

    private static int legnthOfLoop(ListNode2 head3) {


        ListNode2 fast=head3;
        ListNode2 slow=head3;

        while(fast !=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast==slow){
                int length=0;
                ListNode2 temp=slow;
                do {
                    temp=temp.next;
                    length++;
                }while(temp!=slow);
                    return length;

            }
        }

        return 0;
    }
}
