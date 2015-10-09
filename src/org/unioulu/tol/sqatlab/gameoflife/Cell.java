package org.unioulu.tol.sqatlab.gameoflife;

public class Cell {
	
	String state;
	int x;
	int y;
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Cell(String initialState) {
		this.state = initialState;
	}

	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
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
