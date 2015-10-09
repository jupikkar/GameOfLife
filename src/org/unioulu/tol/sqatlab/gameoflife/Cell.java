package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {
	
	String state;

	public Cell(String initialState) {
		this.state = initialState;
	}

	public void nextIteration(int numberOfLiveCells) {
		if (state == "Alive" && numberOfLiveCells < 2)
			state = "Dead";
	}

	public Object getState() {
		return this.state;
	}

}
