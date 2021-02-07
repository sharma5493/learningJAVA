
public class variableScope {
	int a = 10;
	static int b = 34;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(b);
		variableScope x = new variableScope();

		System.out.println(x.a);
		x.a();
	}
	public void a() {
		System.out.println("methodCalled");
	}

}
