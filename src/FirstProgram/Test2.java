package FirstProgram;

public class Test2 {
	public static void click() {
		System.out.println("In click() with 0 arguments");
	}
	public void click(String WebElement) {
		System.out.println("In click(String) with String arguments,123");
		System.out.println("WebElement: "+WebElement);
	}
	public static void click(int xAxis, int yAxis) {
		System.out.println("In click(int,int) with int arguments");
		System.out.println("xAxis: "+xAxis);
		System.out.println("yAxis: "+yAxis);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		click();
		Overloading test = new Overloading();
		test.click("Login Button");
		click(1,2);
		

	}

}
