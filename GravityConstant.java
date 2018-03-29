package A4;

public class GravityConstant implements GravityModel{
	private double g;
	
	//constructor
	public GravityConstant(double g){
		this.g = g;
	}
	
	public double getGravitationalField() {
		return g;
	}
}