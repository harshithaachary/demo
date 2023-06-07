package chainofresponsibilty;

public interface DispenseChain {
	
	void dispense(Currency cur);
	
	void setNextObjectInChain(DispenseChain nextObject);

}
