package Interface;

public class AND implements LogicOperations {

	@Override
	public String getSign() {
		// TODO Auto-generated method stub
		return "*";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "È";
	}

	@Override
	public boolean estimate(boolean a, boolean b) {
		// TODO Auto-generated method stub
		return a & b;
	}

}
