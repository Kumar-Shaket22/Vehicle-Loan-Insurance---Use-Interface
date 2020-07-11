
public class Vehicle implements Loan,Insurance{
	
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Vehicle() {
		
	}
	
	public Vehicle(String vehicleNumber, String modelName, String vehicleType,double price) {
		
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType=vehicleType;
		this.price = price;
	}
	public double issueLoan() {
		if(vehicleType.equals("4 wheeler")) {
			return (price-(price*20/100));
		}else if(vehicleType.equals("3 wheeler")) {
			return (price-(price*25/100));
		}else if(vehicleType.equals("2 wheeler")) {
			return (price-(price*50/100));
		}
		return price;
	}
	public double takeInsurance() {
		if(price<=150000) {
			price = 3500;
		}
		else if(price>150000 && price<=300000) {
			price=4000;
		}
		else if(price>300000) {
			price=5000;
		}
		return price;
		
	}
	

}
