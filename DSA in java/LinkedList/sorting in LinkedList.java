/******************************************************************************

                        Sorting in LinkedList

*******************************************************************************/
class Node{
    int value;
    Node next;
}
class LinkedList{
    Node head;
    public void insert(int data){
        Node node = new Node();
        node.value = data;
        node.next = null;
        if(head==null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }
    }
    public void sort(){
        Node n = head;
        Node index = null;
        int temp;
        while(n!=null){
            index = n.next;
            while(index!=null){
                if(n.value>index.value){
                    temp = n.value;
                    n.value = index.value;
                    index.value = temp;
                }
                index = index.next;
            }
            n = n.next;
        }
    }
    public void show(){
        Node n = head;
        while(n.next!=null){
            System.out.println(n.value);
            n = n.next;
        }
        System.out.println(n.value);
    }
}
public class Main
{
	public static void main(String[] args) {
	    LinkedList obj = new LinkedList();
	    obj.insert(10);
	    obj.insert(40);
	    obj.insert(50);
	    obj.insert(30);
	    obj.insert(20);
	    System.out.println("Before sorting : ");
	    obj.show();
	    obj.sort();
	    System.out.println("After sorting : ");
	    obj.show();
	    
	}
}
