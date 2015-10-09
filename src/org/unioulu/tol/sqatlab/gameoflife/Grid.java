package org.unioulu.tol.sqatlab.gameoflife;

import java.util.HashSet;
import java.util.Set;

public class Grid {
	private Set<Cell> cells = new HashSet<>();

	public int getNeighbours(Cell cell) {
		Set<Cell> neighbours = new HashSet<Cell>();
		Set<Cell> neighbourhood = new HashSet<Cell>();
		
		for (int i=-1; i<=1; i++)
			Cell neighbour = new Cell(cell.x + i, cell.y + i);
		
		return 0;
	}

	public void addCell(Cell cell) {
		cells.add(cell);		
	}

}
