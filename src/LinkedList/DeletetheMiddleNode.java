package LinkedList;

import java.util.List;

class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class DeletetheMiddleNode {
    public static ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        if(count == 1){
            head = null;
            return head;
        }

        if(count == 2){
            head.next = null;
            return head;
        }

        int mid = count/2;

        ListNode temp2 = head;
        for(int i = 0;i < count/2 - 1 ; i++){
                temp2 = temp2.next;
        }

        temp2.next = temp2.next.next;

        return head;
    }

  public static void main(String[] args) {
      ListNode head = new ListNode(2);
      head.next = new ListNode(1);
      head.next.next = new ListNode(3);
      head.next.next.next = new ListNode(4);
      head.next.next.next.next = new ListNode(1);
      head.next.next.next.next.next = new ListNode(2);
      head.next.next.next.next.next.next = new ListNode(6);
      deleteMiddle(head);
      ListNode temp = head;
      while(temp!=null){
          System.out.print(temp.val+" ");
          temp = temp.next;
      }

  }
}
