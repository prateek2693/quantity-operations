package org.main.volume;

public abstract class MetricQuantity implements Quantity{
	
	private double quantityValue;
	
	public MetricQuantity(double quantityValue) {
		super();
		this.quantityValue = quantityValue;
	}

	public abstract MetricQuantity convertToBase();

	public double getQuantityValue() {
		return quantityValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(quantityValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		MetricQuantity other = (MetricQuantity) obj;
		if (this.convertToBase().getClass() != other.convertToBase().getClass())
			return false;
		else {
			if(this.convertToBase().quantityValue == other.convertToBase().quantityValue)
				return true;
		}
		return false;
	}
}
