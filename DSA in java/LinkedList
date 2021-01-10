/******************************************************************************
                            
                            Data strctures in java (Linked List) 
                            
*******************************************************************************/
class Node{
    int value;
    Node next;
}

class LinkedList extends Node{
    Node head;
    
    /* insertion */
    
    public void Insert(int data){
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
    
    /* inserting at required positions */
    
    public void InsertAt(int index,int data){
        Node n = head;
        Node node = new Node();
        node.value = data;
        for(int i = 0;i<index-1;i++){
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
    }
    
    
    /*updation*/
    
    public void Update(int index,int data){
        Node n = head;
        for(int i = 0 ; i < index; i++){
            n = n.next;
        }
        n.value = data;
        
    }
    
    /*deletion*/
    
    public void DeleteAt(int index){
        Node n = head;
        for(int i = 0;i<index-1;i++){
            n = n.next;
        }
        Node n1 = n.next; 
        n.next = n1.next;
        n1 = null;
    }
    
    /*Deleting all elements*/
    
    public void DeleteAll(){
        head = null;
    }
    
    /*printing elements in linkedlist*/
    
    public void Show(){
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
	    obj.Insert(50);
	    obj.Insert(20);
	    obj.Insert(10);
	    obj.Insert(30);
	    obj.Insert(40);
	    obj.InsertAt(2,100);
	    obj.DeleteAt(2);
	    obj.Show();
	    
	}
}
