package by.stormnet.volodko.lesson13;

public class Field {
	int card = 10;
	int count = 0;

	synchronized boolean put() {
		if (count <= 10) {
			count++;
			System.out.println("Число карт на поле " + count);
			return true;
		}
		return false;
	}
	synchronized int get(){
		if(count>0){
			count--;
			System.out.println("Карты убраны");
		}return 0;

	}
}

