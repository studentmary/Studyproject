package by.stormnet.volodko.lesson13;

public class Player extends Thread {
	String name;
	int card = 10;
	int count = 0;
	Field field;

	public Player(String name, Field field) {
		this.name = name;
		this.field = field;
	}

	public void run() {
		try {
			while (card <= 10) {
				field.put();
				card--;
				card = card + field.get();
				System.out.println("Имя игрока " + name + " " + card + "карт");
				sleep(100);
				if (card == 0) {
					break;
				}
			}
		} catch (InterruptedException e) {
			System.out.println("Вы не положили карту");
		}

	}
}
