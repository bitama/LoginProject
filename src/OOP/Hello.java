package OOP;

public class Hello {
	
	private int var;
	String name;
	
	
	public Hello() {
		this.var=10;
	}
	
	public Hello(int num) {
		this.var=num;
	}
	Hello(int num,String name){
		this.var=num;
		this.name=name;
	}
	public void getNum() {
		System.out.println("Your name is "+ name + " Your number is "+ var );
	}

	
	public static void main(String[] args) {
		Hello hello = new Hello(100,"Patrick");
		hello.getNum();
	}
	

}
