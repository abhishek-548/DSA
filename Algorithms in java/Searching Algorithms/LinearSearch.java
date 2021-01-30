/******************************************************************************
                                LinearSearch in Java
*******************************************************************************/
import java.io.*;
import java.util.*;

public class Main
{
    public static int LinearSearch(int arr[],int num){
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                index = i+1;
            }
        }
        return index;
    } 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		int num = sc.nextInt();
		int var = LinearSearch(arr,num);
		if(var==-1){
		    System.out.println("Element not found");
		}
		else{
		    System.out.println("Element found at position at : "+var);
		}
		
	}
}
