package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;
import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;
import org.unioulu.tol.sqatlab.gameoflife.Grid;

public class TestGrid {

	@Test
	public void singleCellonGridHasNoNeighbours() {
		//arrange
		Grid grid = new Grid();
		Cell cell = new Cell(0,0);
		//act
		grid.addCell(cell);
		int numNeighbours = grid.getNeighbours(cell);
		//assert
		assertEquals(0, numNeighbours);
	}
	
	@Test
	public void sidngleCellonGridHasNoNeighbours() {
		Grid grid = new Grid();
		Cell cell = new Cell(0,0);
		
		int numNeighbours = grid.getNeighbours(cell);
		
		assertEquals(0, numNeighbours);
	}

}
