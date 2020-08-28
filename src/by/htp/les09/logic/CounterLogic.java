package by.htp.les09.logic;

import by.htp.les09.entity.Counter;

public class CounterLogic {

	public Counter upCounter(Counter count) {
		int newCount;
		int upperLimit;
		int lowerLimit;

		newCount = count.getCounter() + 1;
		upperLimit = count.getUpperLimit();
		lowerLimit = count.getLowerLimit();

		if (newCount > upperLimit) {
			newCount = lowerLimit;
		}
		Counter c = new Counter(newCount, upperLimit, lowerLimit);
		return c;

	}

	public Counter downCounter(Counter count) {
		int newCounter;
		int upperLimit;
		int lowerLimit;

		newCounter = count.getCounter() - 1;
		upperLimit = count.getUpperLimit();
		lowerLimit = count.getLowerLimit();

		if (newCounter < lowerLimit) {
			newCounter = upperLimit;
		}

		Counter c = new Counter(newCounter, upperLimit, lowerLimit);
		return c;
	}
}
