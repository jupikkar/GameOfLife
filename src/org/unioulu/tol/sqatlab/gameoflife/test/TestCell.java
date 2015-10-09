package org.unioulu.tol.sqatlab.gameoflife.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqatlab.gameoflife.Cell;

public class TestCell {

	@Test
	public void testLiveCellWithNoNeighboursShouldDie() {
		//arrange
		Cell cell = new Cell("Alive");
		//act
		cell.nextIteration();
		//assert
		assertEquals("Dead", cell.getState());
		
	}
	
	@Test
	public void testLiveCellWithTwoNeighboursShouldLive() {
		//arrange
		Cell cell = new Cell("Alive");
		//act
		cell.nextIteration();
		//assert
		assertEquals("Alive", cell.getState());
		
	}

}
