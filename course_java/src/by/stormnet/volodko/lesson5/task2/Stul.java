package by.stormnet.volodko.lesson5.task2;

public class Stul {
	private String type;
	private String material;

	public Stul(String type, String material) {
		this.material = material;
		this.type = type;
	}

	public class Seat {
		public void up() {
			System.out.println("Сиденье вверх");
		}

		public void down() {
			System.out.println("Сиденье вниз");
		}
	}

	public class Back {
		public void forward() {
			System.out.println("Спинка наклонена вперед");
		}

		public void backward() {
			System.out.println("Спинка наклонена назад");
		}

	}

	public class Legs {
		int legs = 4;

		public void legs() {
			System.out.println(legs);
		}
	}
}
