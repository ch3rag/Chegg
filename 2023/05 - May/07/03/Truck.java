import java.util.ArrayList;

interface Load {

}

class Car implements Load {

}

class TreeLog implements Load {

}

class RefrigeratedStorage implements Load {

}


public final class Truck <T extends Load> {
	private ArrayList<T> freight = new ArrayList<>();

	public void load(T item) {
		this.freight.add(item);
	}

	public T unload(int index) {
		return this.freight.get(index);
	}

	public static void main(String[] args) {
		Truck<Car> truck = new Truck<>();
	}
}
