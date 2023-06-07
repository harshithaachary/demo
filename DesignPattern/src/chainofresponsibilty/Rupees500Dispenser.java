package chainofresponsibilty;

public class Rupees500Dispenser implements DispenseChain {

	
	private DispenseChain nextObject;
	
	@Override
	public void dispense(Currency cur) {
		
		if(cur.getAmount() >= 500)
		{
			int noOfNotes = cur.getAmount()/500;
			int remainder = cur.getAmount() % 500;
			System.out.println("Dispensing "+ noOfNotes + "notes of rs 500");
		if(remainder !=0 )
			
		
		this.nextObject.dispense(cur);
		}
		else {
			this.nextObject.dispense(cur);
		}
	}

	@Override
	public void setNextObjectInChain(DispenseChain nextObject) {
		// TODO Auto-generated method stub
		this.nextObject = nextObject ;
	}

}
