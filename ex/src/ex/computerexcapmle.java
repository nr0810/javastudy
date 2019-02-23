package ex;

public class computerexcapmle {
	public static void main(String[] args) {
		int r = 10;
		Calculator calculator = new Calculator();
		System.out.println("원면적:" + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer0 = new Computer();
		System.out.println("원면적: " + computer0.areaCircle(r));
		System.out.println();
		
		Computer computer1 = new Computer();
		System.out.println("원면적 " + computer1.areaCircle(r));
	}
}
