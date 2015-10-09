package org.unioulu.tol.sqatlab.gameoflife;

import java.util.HashSet;
import java.util.Set;

public class Grid {
	private Set<Cell> cells = new HashSet<>();

	public int getNeighbours(Cell cell) {
		int numNeighbours = 0;
		Set<Cell> neighbours = new HashSet<Cell>();
		Set<Cell> neighbourhood = new HashSet<Cell>();
		
		for (int i=-1; i<=1; i++){
			Cell neighbour = new Cell(cell.x + i, cell.y + i);
			if (cells.contains(neighbour)){
				numNeighbours++;
			}
		}
		return numNeighbours;
	}

	public void addCell(Cell cell) {
		cells.add(cell);		
	}

}
