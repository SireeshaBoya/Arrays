package Arrays.com;
// program for print all elements present in the arary
public class CopyElementsArray {
	public static void main(String[] args) {
		int arr[]=new int[] {1,2,3,4};
		int arr1[]=new int[arr.length];
		for(int  i=0;i<arr.length;i++) {
			arr1[i]=arr[i];	
		}
		System.out.println("elements are before");
		 for(int i=0;i<arr.length;i++) {
			 
			 System.out.println(arr[i]);
		 }
		 System.out.println();
		System.out.println("elements are after");
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr1[i]);
		 }
		
		
	}}