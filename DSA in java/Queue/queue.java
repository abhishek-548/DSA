/******************************************************************************
                            queue in java
                            (using array)
*******************************************************************************/
class Queue{
    int arr[] = new int[5];
    int size = 0;
    int front = 0;
    int rear = 0;
    /*inserting element into queue*/
    public void enqueue(int data){
        arr[rear] = data;
        rear++;
        size++;
    }
    /*deleting element in queue*/
    public int dequeue(){
        int data = arr[front];
        front++;
        return data;
    }
    /*displaying elements in queue*/
    public void show(){
        for(int i=0;i<size-front;i++){
            System.out.println(arr[i+front]);
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    Queue obj = new Queue();
	    obj.enqueue(10);
	    obj.enqueue(20);
	    obj.enqueue(30);
	    obj.enqueue(40);
	    obj.enqueue(50);
	    obj.dequeue();
	    obj.dequeue();
	    obj.show();
	}
}
