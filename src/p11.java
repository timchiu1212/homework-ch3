
public class p11 {

	public static void main(String[] args) {
		
		p11Car car1;
		car1=new p11Car();
		
		car1.num=1234;
		car1.gas=20.5;
		
		car1.show();
		car1.show();

	}

}
//Car類別

class p11Car
{
	int num;
	double gas;
	
	void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		
	}
}
