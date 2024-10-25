package basicsofjava;

public class Variable {
	int id=10;
	void print()
	{
		String msg="hello";
		System.out.println(msg);
	}
	static String message=("Hellow students");
	public static void main(String args[])
	{
		Variable obj=new Variable();
		System.out.println(obj.id);
		obj.print();
		System.out.println(message);
	}
}
