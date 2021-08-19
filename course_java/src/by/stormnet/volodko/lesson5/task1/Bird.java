package by.stormnet.volodko.lesson5.task1;


public class Bird {
	private String view;
	private double weight;
	static double sum;


	public Bird(String view, double weight) {

		this.weight = weight;
		this.view = view;
		sum = sum + weight;

	}

	public Bird(String view) {
		this.view = view;
	}

	public Double getWeight() {
		return weight = weight;
	}

	public String getView() {
		return view;
	}


	public void setWeight(Double weight) {
		this.weight = weight;
	}


	public static double getSum() {
		return sum;
	}
}



















