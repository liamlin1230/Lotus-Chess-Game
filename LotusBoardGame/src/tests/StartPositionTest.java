package tests;

import static org.junit.Assert.assertTrue;
import model.Board;
import model.Piece;
import model.StartPosition;

import org.junit.Test;

public class StartPositionTest {

	@Test
	public void moveTopLeft() {
		Board b = new Board(2);
		StartPosition p = new StartPosition(0, 0, b);
		Piece pi = new Piece("Red");
		b.createArray();
		p.putOn(pi);
		p.putOn(pi);
		p.putOn(pi);
		p.moveTopLeft();
		Piece expected = pi;
		Piece actual = p.peekTop();
		assertTrue(actual == expected);
	}

	@Test
	public void moveTopMiddle() {
		Board b = new Board(2);
		StartPosition p = new StartPosition(0, 0, b);
		Piece pi = new Piece("Red");
		b.createArray();
		p.putOn(pi);
		p.putOn(pi);
		p.putOn(pi);
		p.moveTopMiddle();
		Piece expected = pi;
		Piece actual = p.peekTop();
		assertTrue(actual == expected);
	}

	@Test
	public void moveTopRight() {
		Board b = new Board(2);
		StartPosition p = new StartPosition(0, 0, b);
		Piece pi = new Piece("Red");
		b.createArray();
		p.putOn(pi);
		p.putOn(pi);
		p.putOn(pi);
		p.moveTopRight();
		Piece expected = pi;
		Piece actual = p.peekTop();
		assertTrue(actual == expected);
	}
}
