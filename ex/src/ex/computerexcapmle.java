package ex;

public class computerexcapmle {
	public static void main(String[] args) {
		int r = 10;
		Calculator calculator = new Calculator();
		System.out.println("������:" + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer0 = new Computer();
		System.out.println("������: " + computer0.areaCircle(r));
		System.out.println();
		
		Computer computer1 = new Computer();
		System.out.println("������ " + computer1.areaCircle(r));
	}
}
