
public class 생성자 {
	String name;
	public 생성자() {//기본생성자	
		this("SSS");// 생성자주석
		System.out.println("기본생성자");
		this.name = "AAA";
	}
	public 생성자(String name)	{
		this("SSS", 10);
		System.out.println("생성자"+name);
	}
	public 생성자(String name, int a)	{
		this("SSS", 10, 100.5d);
		System.out.println("생성자"+name+ " "+a);
	}
	public 생성자(String name, int a , double b)	{
		System.out.println("생성자"+name+ " "+a +" "+b);
	}
}
