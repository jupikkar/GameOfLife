package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestGrid {

	@Test
	public void singleCellGrid() {
		Grid grid = new Grid();
		Cell cell = new Cell(0,0);
		
		int numNeighbours = grid.getNeighbours(cell);
		
		assertEquals(0, numNeighbours);
	}

}
