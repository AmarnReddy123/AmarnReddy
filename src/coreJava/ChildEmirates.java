package coreJava;

public class ChildEmirates extends ParentAircraft{

	public static void main(String[] args) {

		ChildEmirates c = new ChildEmirates();
		c.engine();
		c.safetyguidelines();
		c.bodyColour();
		
		// ParentAircraft = new ParentAircraft();
		
		
		
	}

	@Override
	public void bodyColour() {
		// TODO Auto-generated method stub
	    System.out.println("red colour on the body");	
	}

}
