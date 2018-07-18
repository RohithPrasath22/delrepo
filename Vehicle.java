public abstract class Vehicle{
	private int tyres;
	public Vehicle(){
	}
	public Vehicle(int  tyres){
	System.out.println("Vehicle is constructed");
	this.tyres=tyres;
	}
	public abstract void move();

	public void setTyres(int tyres){
		this.tyres = tyres;
	}
	
	public int getTyres(){
		return tyres;
	}


}