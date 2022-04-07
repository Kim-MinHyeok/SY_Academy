package exam12;

public class CellPhone {
	private String modelName;
	private String company;
	private String color;
	private boolean power=false;
	private boolean camera=false;

	public CellPhone(String modelName, String company, String color) {
		this.modelName = modelName;
		this.company = company;
		this.color = color;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPower() {
		return power;
	}

	public boolean isCamera() {
		return camera;
	}

	public void turnPower() {
		if(this.power == false) {
			this.power = true;
		} else {
			this.power = false;
		}
	}
	
	public void turnCamera() {
		if(this.camera == false) {
			this.camera = true;
		} else {
			this.camera = false;
		}
	}
}
