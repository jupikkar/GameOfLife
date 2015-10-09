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
	public void TwoNeighbourCellsOnGridShouldHaveOneNeighbourEach() {
		Grid grid = new Grid();
		Cell cell1 = new Cell(0,0);
		Cell cell2 = new Cell(0,1);
		
		grid.addCell(cell1);
		grid.addCell(cell2);
		
		int numNeighbours = grid.getNeighbours(cell1);
		
		assertEquals(1, numNeighbours);
	}
	
	@Test
	public void TwoNeighbourCellsOnDifferentRowsGridShouldHaveOneNeighbourEach() {
		Grid grid = new Grid();
		Cell cell1 = new Cell(0,0);
		Cell cell2 = new Cell(1,0);
		
		grid.addCell(cell1);
		grid.addCell(cell2);
		
		int numNeighbours = grid.getNeighbours(cell1);
		
		assertEquals(1, numNeighbours);
	}

}
