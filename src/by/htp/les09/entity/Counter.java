package by.htp.les09.entity;

public class Counter {
	private int counter;
	private int upperLimit;
	private int lowerLimit;

	public Counter() {
		this(0, 10, 1);
	}

	public Counter(int counter, int upperLimit, int lowerLimit) {
		this.counter = counter;
		this.upperLimit = upperLimit;
		this.lowerLimit = lowerLimit;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public int getUpperLimit() {
		return upperLimit;
	}
	
	public int getLowerLimit() {
		return lowerLimit;
	}
	
	public void setUpperLimit (int upperLimit) {
		this.upperLimit = upperLimit;
	}
	
	public void setLowerLimit (int lowerLimit) {
		this.lowerLimit = lowerLimit;
	}

	

}
