package org.main.length;

public class Kilometer extends Length {

	public Kilometer(double kilometervalue) {
		super(kilometervalue);
	}

	@Override
	public Meter convertToBase() {
		return new Meter(getQuantityValue() * 1000);
	}

	public static Kilometer convertFromBaseMeterToUnit(Meter meter) {
		return new Kilometer(meter.getQuantityValue() / 1000);
	}

	public static Kilometer convertToKilometer(Length length) {
		Meter m = (Meter) length.convertToBase();
		return Kilometer.convertFromBaseMeterToUnit(m);
	}

}
