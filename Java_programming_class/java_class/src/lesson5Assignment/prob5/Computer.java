package lesson5Assignment.prob5;

public class Computer {
	String manufacturer;
	String processor;
	int ramSize;
	double processorSpeed;
	
	public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.processorSpeed = processorSpeed;
	}
	
	public int getRamSize() {
		return ramSize;
	}
	
	public double getProcessorSpeed() {
		return processorSpeed;
	}
	
	public double computePower() {
		return ramSize * processorSpeed;
	}
	
	@Override
	public String toString() {
		return "Manufacturer : " + manufacturer + "," + " Processor " + processor + ", Ram Size " + ramSize + "," + " Processor Speed " + processorSpeed;
	}
	
	@Override
	public boolean equals(Object object) {
		if (object == null) return false;
		if (!(object instanceof Computer) ) return false;
		if (this == object) return false;
		Computer computer = (Computer) object;
		return this.manufacturer.equals(computer.manufacturer) && this.ramSize == computer.ramSize && 
				this.processor.equals(computer.processor) && this.processorSpeed == computer.processorSpeed;
	}
}
