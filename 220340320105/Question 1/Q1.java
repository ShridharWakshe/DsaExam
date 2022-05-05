  import java.util.Scanner;
  
  class Q1{
	void printArray(int arr[]){
		for (int i = 0; i<arr.length; i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	void sort(int arr[]){
		int n = arr.length;
		for(int i = 1; i < n; i++){  
			int temp = arr[i];
			int j = i-1;              
		while(j >=0 && arr[j] > temp){
			arr[j+1] = arr[j];       
			j = j-1;
			
			printArray(arr);
		}
		arr[ j + 1 ] = temp;
	}
}
	
  public static void main(String [] args){
  
    Q1 isd = new Q1();
    Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Array size : ");
    int N = sc.nextInt();
	System.out.print("Enter Array elements: ");
	
	int arr[] = new int [N];         
   
    for (int i = 0; i < N; i++){
			arr[i] = sc.nextInt();
    	}
	System.out.println("Before sorting : ");
	isd.printArray(arr);
	System.out.println("After Applying insertion Sort : ");
	isd.sort(arr);
	isd.printArray(arr);
   
  }  
  
}