package org.unioulu.tol.sqatlab.gameoflife;

import java.util.HashSet;
import java.util.Set;

public class Grid {
	private Set<Cell> cells = new HashSet<>();

	public int getNeighbours(Cell cell) {
		Set<Cell> neighbours = new HashSet<Cell>();
		return 0;
	}

	public void addCell(Cell cell) {
		cells.add(cell);		
	}

}
