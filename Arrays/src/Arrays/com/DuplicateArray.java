package Arrays.com;
//Program to print the duplicate elements of an array
public class DuplicateArray {
	public static void main(String[] args) {
		int arr[]= {2,3,1,2,3};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
				System.out.println("repeated occuring numbers:"+arr[i]);
			}
		}	
	}
}



