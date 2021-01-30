/******************************************************************************
                            queue in java
                            (using dynamic array)
*******************************************************************************/
class Queue{
    int len = 5;
    int arr[] = new int[len];
    int size = 0;
    int front = 0;
    int rear = 0;
    /*inserting element into queue*/
    public void enqueue(int data){
        if(rear>=len){
            int x = arr.length+1;
            int arr1[] = new int[x];
            for(int i=0;i<arr.length;i++){
                arr1[i] = arr[i];
            }
            arr1[x-1] = data;
            rear++;
            size++;
            arr = arr1;
        }
        else{
            arr[rear] = data;
            rear++;
            size++;
        }
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
        obj.enqueue(60);
        obj.enqueue(70);
        obj.enqueue(80);
        obj.dequeue();
	    obj.show();
	}
}
