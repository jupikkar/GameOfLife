package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {
	
	String state;

	public Cell(String initialState) {
		this.state = initialState;
	}

	public Cell(int x, int y) {
		// TODO Auto-generated constructor stub
	}

	public void nextIteration(int numberOfLiveCells) {
		if (state == "Alive" && numberOfLiveCells < 2)
			state = "Dead";
		else
			state = "Alive";
	}

	public Object getState() {
		return this.state;
	}

}
