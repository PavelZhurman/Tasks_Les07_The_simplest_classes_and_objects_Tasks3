package by.htp.les09.main;

import by.htp.les09.entity.Counter;
import by.htp.les09.view.CounterPrint;
import by.htp.les09.logic.CounterLogic;

public class Main {

	public static void main(String[] args) {
		
		Counter count = new Counter(4,10,5);
		CounterPrint print = new CounterPrint();
		CounterLogic logic = new CounterLogic();
		
		print.print(count);
		count = logic.upCounter(count);
		print.print(count);
		
		count.setCounter(10);
		print.print(count);
		
		count = logic.upCounter(count);
		print.print(count);
		
		count.setCounter(0);
		print.print(count);
		
		count = logic.downCounter(count);
		print.print(count);
		
		Counter counter = new Counter();
		
		print.print(counter);

	}

}
