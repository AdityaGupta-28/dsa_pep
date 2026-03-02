import java.util.Scanner;

public class reverseByKpos {
  public class ListNode{
    int val;
    ListNode next;
  }
 public ListNode rotateRight(ListNode head, int k) {
    ListNode temp=head;
    int s=1;
    while(temp.next!=null){
      temp=temp.next;
      s++;
    }
    temp.next=head;

    ListNode cur=head;
    s-=(k%s);
    while(s>1){
        cur=cur.next;
        s--;
    }
    ListNode t=cur.next;
    cur.next=null;
    return t;

public void main(String[] args){
    Scanner sc= sc.nextInt();
    int n=sc.nextInt();

}
}
