package coreJava;

public class AustralianTraffic implements CentralTraffic,ContinentalTraffic{

	public static void main(String[] args) {

		
		AustralianTraffic a= new AustralianTraffic();
		a.redStop();
		a.flashYellow();
		a.greenGo();
		
        AustralianTraffic at = new AustralianTraffic();
        ContinentalTraffic ct = new AustralianTraffic();
        at.walkonsymbol();
        ct.trainSymbol();
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greengo implementation");
	}

	public void walkonsymbol()
	{
		System.out.println("walking");
	}
	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redstop implementation");
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flash yellow implementation");
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		
		
	}

}
