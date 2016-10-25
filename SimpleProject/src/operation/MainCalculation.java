package operation;

import calculation.Basic;
import multiplication.MulltiplyOperation;

public class MainCalculation {
	public static void main(String[] args) {
		Basic oneOperation = new MulltiplyOperation();
		oneOperation.add(15, 10);
		oneOperation.display();
	}
}
