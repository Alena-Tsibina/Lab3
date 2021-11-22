package Interface;

public class StrokeofSchaeffer implements LogicOperations {

	@Override
	public String getSign() {
		// TODO Auto-generated method stub
		return "|";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Штрих Шеффера";
	}

	@Override
	public boolean estimate(boolean a, boolean b) {
		// TODO Auto-generated method stub
		return !(a & b);
	}

}
