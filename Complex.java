import java.util.Scanner;

public class Complex {

	int Real;
	int Imag;
	
	public Complex(int real, int imag) {
		Real = real;
		Imag = imag;
	}
	public void Display()
	{
		System.out.print(Real);
		if(Imag>=0)
			System.out.print("+"+Imag+"i");
		else
			System.out.print(Imag+"i");
			
	}
	public static void main(String[] args) {
		int real;
		int imag;
		Scanner sc=new Scanner(System.in);
		real=sc.nextInt();
		imag=sc.nextInt();
		sc.close();
		Complex C=new Complex(real,imag);
		C.Display();
		

	}

}
