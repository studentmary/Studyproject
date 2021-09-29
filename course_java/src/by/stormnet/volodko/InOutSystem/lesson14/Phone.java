package by.stormnet.volodko.InOutSystem.lesson14;

public class Phone {
	private String name;
	private int value;

	public Phone(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Phone" + name + " " + "Price" + value;
	}
}