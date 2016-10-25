package multiplication;

import calculation.Basic;

public class MulltiplyOperation implements Basic {
	int finalValue;
	
	public void add(int value1, int value2) {
		finalValue = value1 * value2;
	}

	public void display() {
		System.out.println("Value: " + finalValue);
	}

}
