
public class p15 {

	public static void main(String[] args) {
		
		p15Car car1;
		car1=new p15Car();
		
		int number=1234;
		double gasoline=20.5;
		
		
		car1.setNumGas(number, gasoline);

	}

}
//Car類別

class p15Car
{	
	int num;
	double gas;
	
	void setNumGas(int n,double g) {
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
		
		
		
	}
	void show()
	{
		
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
