import java.util.Scanner;

public class WaveForm {

	int arr[];
	
	
	public WaveForm() {
		arr=new int[10];
	}
	public void get()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
			arr[i]=sc.nextInt();	
		sc.close();
	}
	public void show()
	{  
	        int temp = 0;  
	         for(int i=0;i<10;i++){  
	             for(int j=1;j<(10-i);j++){  
	                 if(arr[j-1]>arr[j]){    
	                    temp = arr[j-1];  
	                    arr[j-1] = arr[j];  
	                    arr[j] = temp;  
	                   }         
	                 }
	         }
	         for(int i=0;i<10;i=i+2)
	         {
	        	 temp=arr[i];
	        	 arr[i]=arr[i+1];
	        	 arr[i+1]=temp;
	         }
	         for(int i=0;i<10;i++)
	        	 System.out.println(arr[i]);
	}


	public static void main(String[] args) {
		WaveForm W=new WaveForm();
		W.get();
		W.show();
	}

}
