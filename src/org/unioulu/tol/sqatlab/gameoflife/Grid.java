package org.unioulu.tol.sqatlab.gameoflife;

import java.util.HashSet;
import java.util.Set;

public class Grid {
	
	int sizeOfGrid;
	
	public Grid(int sizeOfGrid) {
		this.sizeOfGrid = sizeOfGrid;
	}
	
	private Set<Cell> cells = new HashSet<>(sizeOfGrid);

	public int getNeighbours(Cell cell) {
		int numNeighbours = 0;
		Set<Cell> neighbourhood = new HashSet<Cell>();
		for (int dx=-1; dx<=1; dx++){
			for (int dy=-1; dy<=1; dy++){
				Cell neighbour = new Cell(cell.x + dx, cell.y + dy);
				if (cells.contains(neighbour)){
					numNeighbours++;
				}
			}
		}
		return numNeighbours-1;
	}

	public void addCell(Cell cell) {
		cells.add(cell);		
	}

}
