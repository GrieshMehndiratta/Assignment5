import java.util.Scanner;

public class Rectangle {

	int length;
	int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public void CalculateArea()
	{
		int area;
		area=length*breadth;
		System.out.println("Area of Reactangle is : "+area);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Length=sc.nextInt();
		int Breadth=sc.nextInt();
		sc.close();
		Rectangle R=new Rectangle(Length,Breadth);
		R.CalculateArea();

	}

}
