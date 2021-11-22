package Interface;

public class XOR implements LogicOperations {

	@Override
	public String getSign() {
		// TODO Auto-generated method stub
		return "xor";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Исключающее ИЛИ";
	}

	@Override
	public boolean estimate(boolean a, boolean b) {
		// TODO Auto-generated method stub
		return a^b;
	}

}
