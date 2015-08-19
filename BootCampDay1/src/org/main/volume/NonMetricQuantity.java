package org.main.volume;

public abstract class NonMetricQuantity {
	
	private double quantityValue;
	
	public double getQuantityValue() {
		return quantityValue;
	}

	public NonMetricQuantity(double quantityValue) {
		super();
		this.quantityValue = quantityValue;
	}

	public abstract NonMetricQuantity convertToBase();

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		NonMetricQuantity other = (NonMetricQuantity) obj;
		if (this.convertToBase().getClass() != other.convertToBase().getClass()) {
			
			return false;
		}
			
		else {
			if(this.convertToBase().quantityValue == other.convertToBase().quantityValue) {
				
				return true;
		}
			System.out.println(this.convertToBase().getQuantityValue());
			System.out.println(other.convertToBase().getQuantityValue());
		}
		return false;
	}
}
