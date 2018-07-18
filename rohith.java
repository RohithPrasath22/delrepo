public class rohith {
	
	public static void main(String[] args){
		System.out.println("my first program ");
		Car c= new Car();
		c.move();
		c.setTyres(4);
		System.out.println("this car has " +c.getTyres()+" tyres");
		Bus b= new Bus();
		b.setTyres(8);
		System.out.println("this bus has " +b.getTyres()+" tyres");
		Vehicle v= new Bus();
		v.move();

	}



}