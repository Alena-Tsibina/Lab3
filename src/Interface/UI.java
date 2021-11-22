package Interface;

public class UI {

	public static void main(String[] args) {
		
		LogicOperations[] operations = {
				new AND(), new OR(), new StrokeofSchaeffer(), new XOR()
		};
		
		boolean a = false, b = true;
		for (LogicOperations op : operations) {
			System.out.println(op.getName());
			System.out.printf( "%b %s %b = %b\n", a, op.getSign(), b, op.estimate(a, b) );
		}
		// TODO Auto-generated method stub

	}

}
