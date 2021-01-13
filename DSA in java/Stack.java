/******************************************************************************
                            stack in java
                        (array implementation)
*******************************************************************************/
class Stack{
    int arr[] = new int[5];
    int top = 0;
    /*inserting elements in stack*/
    public void push(int data){
        arr[top] = data;
        top++;
    }
    /*deleting the top value in stack*/
    public int pop(){
        int data = arr[top-1];
        arr[top-1] = 0;
        top--;
        return data;
    }
    /*returning the top value in stack*/
    public int peek(){
        return arr[top-1];
    }
    /*gives size of the stack*/
    public int size(){
        return top;
    }
    /*checking wether stack is empty or not*/
    public boolean isEmpty(){
        return top<=0;
    }
    /*displaying elements in stack*/
    public void show(){
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}

public class Main
{
	public static void main(String[] args) {
		Stack obj = new Stack();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		System.out.println("The pop value is : "+obj.pop());
		System.out.println("The peek value is : "+obj.peek());
		System.out.println("The size of the stack is : "+obj.size());
		System.out.println(obj.isEmpty());
		obj.show();
	}
}

