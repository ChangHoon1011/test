
public class ������ {
	String name;
	public ������() {//�⺻������	
		this("SSS");// �������ּ�
		System.out.println("�⺻������");
		this.name = "AAA";
	}
	public ������(String name)	{
		this("SSS", 10);
		System.out.println("������"+name);
	}
	public ������(String name, int a)	{
		this("SSS", 10, 100.5d);
		System.out.println("������"+name+ " "+a);
	}
	public ������(String name, int a , double b)	{
		System.out.println("������"+name+ " "+a +" "+b);
	}
}
