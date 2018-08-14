
public class Seat {
	String material;
	String filler;
	String brand;
	String suitableSeason;
	boolean isInfantSafe;
	boolean isHeated;
	
	
	public Seat(String material, String filler, String brand, String suitableSeason, boolean isInfantSafe,
			boolean isHeated) {
		super();
		this.material = material;
		this.filler = filler;
		this.brand = brand;
		this.suitableSeason = suitableSeason;
		this.isInfantSafe = isInfantSafe;
		this.isHeated = isHeated;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getFiller() {
		return filler;
	}
	public void setFiller(String filler) {
		this.filler = filler;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSuitableSeason() {
		return suitableSeason;
	}
	public void setSuitableSeason(String suitableSeason) {
		this.suitableSeason = suitableSeason;
	}
	public boolean isInfantSafe() {
		return isInfantSafe;
	}
	public void setInfantSafe(boolean isInfantSafe) {
		this.isInfantSafe = isInfantSafe;
	}
	public boolean isHeated() {
		return isHeated;
	}
	public void setHeated(boolean isHeated) {
		this.isHeated = isHeated;
	}
	void adjustHeight(int level){
		System.out.println("adjusted height");
		
	} 
    void pullForward(){
    	System.out.println("Going forward");
    }
	void pushBack(){
		System.out.println("Pushing backward");
	}

	public String toString() {
		return "Seat [material=" + material + ", filler=" + filler + ", brand=" + brand + ", suitableSeason="
				+ suitableSeason + ", isInfantSafe=" + isInfantSafe + ", isHeated=" + isHeated + "]";
	}

	
}
