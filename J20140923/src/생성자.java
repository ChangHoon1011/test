
public class 持失切 {
	String name;
	public 持失切() {//奄沙持失切	
		this("SSS");// 持失切爽汐
		System.out.println("奄沙持失切");
		this.name = "AAA";
	}
	public 持失切(String name)	{
		this("SSS", 10);
		System.out.println("持失切"+name);
	}
	public 持失切(String name, int a)	{
		this("SSS", 10, 100.5d);
		System.out.println("持失切"+name+ " "+a);
	}
	public 持失切(String name, int a , double b)	{
		System.out.println("持失切"+name+ " "+a +" "+b);
	}
}
