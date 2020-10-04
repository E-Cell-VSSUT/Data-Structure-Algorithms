import java.util.*;

class InsertionSort {
   public static void main(String []args){
   int i,n=0;
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt();
   
   int a[]=new int[n];
   for(i=0;i<n;i++){
   a[i]=sc.nextInt();
   }
   
   for (i = 1; i < n; ++i) { 
			int key = a[i]; 
			int j = i - 1; 

			
			while (j >= 0 && a[j] > key) { 
				a[j + 1] = a[j]; 
				j = j - 1; 
			} 
			a[j + 1] = key; 
		} 
    for(i=0;i<n;i++){
    System.out.print(a[i]+" ");
    }
  }
}  
