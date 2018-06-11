import java.util.Scanner;

public class SecondLargest {
	
int arr[];


	public SecondLargest()
	{
	 arr=new int[10];
	}
	public void get()
	{
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
			arr[i]=sc.nextInt();
		sc.close();
	}
	public void Find()
	{
		int first = arr[0];
		int second = arr[0];
        for (int i=0;i<10;i++)
        {
            if (arr[i] > first)
            {
                second = first;
                first = arr[i];
            }
            else if (arr[i]>second && arr[i]!=first)
                second = arr[i];
        }
        System.out.println(second);
	}
	public static void main(String[] args) {
		SecondLargest S=new SecondLargest();
		S.get();
		S.Find();
	}

}
