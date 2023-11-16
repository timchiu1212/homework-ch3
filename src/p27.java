
public class p27 {

	public static void main(String[] args) {
		
		p27Car car1;
		car1=new p27Car();
		car1.show();
		
		p27Car car2;
		car2=new p27Car(1234,25.0);
		car2.show();
	}

}
//Car類別

class p27Car
{	
	
	private int num;
	private double gas;
	
	public p27Car()
	{
		num=0;
		gas=0.0;
		System.out.println("生產了車子");
	}
	public p27Car(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	
	public void show()
	{
		
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
