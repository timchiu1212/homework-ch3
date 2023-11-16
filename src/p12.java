
public class p12 {

	public static void main(String[] args) {
		
		p12Car car1;
		car1=new p12Car();
		
		car1.num=1234;
		car1.gas=20.5;
		
		car1.showp12Car();
	

	}

}
//Car類別

class p12Car
{
	int num;
	double gas;
	
	void show() {
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		
	}
	void showp12Car()
	{
		System.out.println("開始顯示車子資料");
		this.show();
	}
}
