package by.stormnet.volodko.lesson13;

public class Leader extends Thread {
	Field field;
	int card = 0;

	public Leader(Field field) {
		this.field = field;
	}

	public void run() {
		try {
			while (card>0 ){
				field.get();
				card++;
				card=card+field.get();
				System.out.println("У ведущего карт"+card);
				sleep(100);
			}
		}catch (InterruptedException e){
			System.out.println("не все карты");
		}
	}
}
