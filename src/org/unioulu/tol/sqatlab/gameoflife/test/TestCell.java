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
		cell.nextIteration(0);
		//assert
		assertEquals("Dead", cell.getState());
		
	}
	
	@Test
	public void testLiveCellWithTwoNeighboursShouldLive() {
		//arrange
		Cell cell = new Cell("Alive");
		//act
		cell.nextIteration(2);
		//assert
		assertEquals("Alive", cell.getState());
	}
	
	@Test
	public void testLiveCellWithThreeNeighboursShouldLive() {
		//arrange
		Cell cell = new Cell("Alive");
		//act
		cell.nextIteration(3);
		//assert
		assertEquals("Alive", cell.getState());
	}
	
	@Test
	public void testLiveCellWithOverThreeNeighboursShouldDie() {
		//arrange
		Cell cell = new Cell("Alive");
		//act
		cell.nextIteration(4);
		//assert
		assertEquals("Dead", cell.getState());
	}

}
