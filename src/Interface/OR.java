package Interface;

public class OR implements LogicOperations {

	@Override
	public String getSign() {
		// TODO Auto-generated method stub
		return  "+";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "»À»";
	}

	@Override
	public boolean estimate(boolean a, boolean b) {
		// TODO Auto-generated method stub
		return a | b;
	}

}
