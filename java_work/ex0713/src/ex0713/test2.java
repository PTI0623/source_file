package ex0713;

class Car{
	int gasol;
	public Car(int gasol) {
		super();
		this.gasol = gasol;
	}
	@Override
	public String toString() {
		return "Car [gasol=" + gasol + "]";
	}
	
}
class Hybrid extends Car{
	int electric;

	public Hybrid(int gasol, int electric) {
		super(gasol);
		this.electric = electric;
	}

	@Override
	public String toString() {
		return "Hybrid [electric=" + electric + "]";
	}
	
}
class HWaterCar extends Hybrid{
	int water;
	
	public HWaterCar(int gasol, int electric, int water) {
		super(gasol, electric);
		this.water = water;
	}
	
	@Override
	public String toString() {
		return "HWaterCar [water=" + water + "]";
	}

	public void showCurrent() {
		System.out.println("잔여 가솔린 : "+this.gasol);
		System.out.println("잔여 전기량 : "+this.electric);
		System.out.println("잔여 워터량 : "+water);
	}
}
public class test2 {
	public static void main(String[] args) {
		HWaterCar hw=new HWaterCar(50,100,120);
		hw.showCurrent();
	}
}
