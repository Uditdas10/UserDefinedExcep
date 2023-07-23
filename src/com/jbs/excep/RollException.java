package com.jbs.excep;

public class RollException extends Exception{ //RuntimeException{
	private int invalideRoll;

	public RollException(int invalideRoll) {
		super();
		this.invalideRoll = invalideRoll;
	}

	public int getInvalideRoll() {
		return invalideRoll;
	}

	public void setInvalideRoll(int invalideRoll) {
		this.invalideRoll = invalideRoll;
	}

	@Override
	public String toString() {
		return "RollException (must be > 0)[invalideRoll=" + invalideRoll + "]";
	}
	

}
