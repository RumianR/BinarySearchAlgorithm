/* 
 2. In clear, natural language, give the name of your algorithm and explain in a generalized 
	step-wise manner how it can be applied to an arbitrary sorted array when searching for an arbitrary value.
		
		It's recursive "Binary Search". The base case it checks the middle index of the array, and if the value at that index matches the value x, 
		it returns the index of where that value is stored in the array. Else it will keep calling itself on a smaller range, either over the right 
		half or the left half of the search area, depending on wether the value in the middle is less than x or greater than x respectively. If the 
		start index crosses the end index, it will return -1 meaning no value was found.
		
		
 3. In clear, natural language, describe how you would change your algorithm to search over sorted Strings instead of integers.
		
		The algorithm would be the same assuming the array is sorted lexicographically. Instead of comparing integers, use compareTo
		method. If the comparaison gives 0 in the base case, the base case is met. If not, >0 will make it search on a smaller range to the 
		the right and if <0 it will search on a smaller area on the left, keep searching on the half of the initial perimeter search.
		
		
	
*/

import java.util.Scanner;
public class bsort {
	
	public static void main(String[] args){
	
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a sorted list of integers seperated by a comma");
		System.out.println("	For example: 1,5,17,22,33,37");
		String[] JunkArr = kb.next().split(",");
		int[] arr = new int[JunkArr.length];
		
		for(int i = 0; i<arr.length ; i++)
			arr[i]=Integer.parseInt(JunkArr[i]);
		
		System.out.println("Enter the value you want to search for");
		int val = kb.nextInt();
		
		System.out.println(BinarySearch(0, arr.length, arr, val));
		
		
	}
	
	public static int BinarySearch(int start, int end, int[] arr, int val){
		if(start > end){
			System.out.println("!");
			return -1;
			}
		
		int mid = (end+start)/2;
		
	   if( arr[mid]==val){
			System.out.println(arr[mid]+"=");
			return mid;
			}
		else if (arr[mid]>val)	{
			System.out.println(arr[mid]+">");
			return BinarySearch(start, mid-1, arr, val);}
		else{
			System.out.println(arr[mid]+"<");
			return BinarySearch(mid+1, end, arr, val);
		}
					
	}
	
	
	

}
