package tests;

import static org.junit.Assert.assertTrue;
import model.Board;
import model.Piece;
import model.Position;

import org.junit.Test;

public class PositionTest {

	@Test
	public void heightTest() {
		Board b = new Board(2);
		Position p = new Position(0, 0, b);
		int actual = p.height();
		int expected = 0;
		assertTrue(actual == expected);
	}

	@Test
	public void putOnAndHeightTest() {
		Board b = new Board(2);
		Position p = new Position(0, 0, b);
		Piece pi = new Piece("Blue");
		p.putOn(pi);
		int actual = p.height();
		int expected = 1;
		assertTrue(actual == expected);
	}

	@Test
	public void peekTopTest() {
		Board b = new Board(2);
		Position p = new Position(0, 0, b);
		Piece pi = new Piece("Blue");
		p.putOn(pi);
		Piece actual = p.peekTop();
		Piece expected = pi;
		assertTrue(actual == expected);
	}

	@Test
	public void moveTopTest1() {
		Board b = new Board(2);
		Position p = new Position(0, 0, b);
		Piece pi = new Piece("Red");
		Piece pi2 = new Piece("Blue");
		b.createArray();
		p.putOn(pi);
		p.putOn(pi);
		p.putOn(pi);
		p.putOn(pi2);
		p.moveTop();
		Piece expected = pi2;
		Piece actual = p.peekTop();
		assertTrue(actual == expected);
	}

	@Test
	public void moveTopTest2() {
		Board b = new Board(2);
		Position p = new Position(0, 0, b);
		Piece pi = new Piece("Red");
		Piece pi2 = new Piece("Blue");
		b.createArray();
		p.putOn(pi2);
		p.putOn(pi);
		p.putOn(pi2);
		p.putOn(pi);
		p.moveTop();
		Piece expected = pi;
		Piece actual = p.peekTop();
		assertTrue(actual == expected);
	}

	@Test
	public void moveBackwardHeightTest() {
		Board b = new Board(2);
		Position p = new Position(0, 0, b);
		Piece pi = new Piece("Red");
		Piece pi2 = new Piece("Blue");
		b.createArray();
		b.middleTrack()[0].putOn(pi);
		b.middleTrack()[0].putOn(pi);
		b.middleTrack()[0].putOn(pi);
		b.middleTrack()[0].putOn(pi);
		b.middleTrack()[0].moveBackward();
		int expected = 4;
		int actual = b.middleTrack()[0].height();
		assertTrue(actual == expected);
	}

	@Test
	public void specialSpotPlusOneTest() {
		Board b = new Board(2);
		Position p = new Position(0, 0, b);
		p.specialSpot(1);
		int actual = p._offset;
		int expected = 1;
		assertTrue(actual == expected);
	}

	@Test
	public void specialSpotPlusTwoTest() {
		Board b = new Board(2);
		Position p = new Position(0, 0, b);
		p.specialSpot(2);
		int actual = p._offset;
		int expected = 2;
		assertTrue(actual == expected);
	}

	@Test
	public void specialSpotMinusTest() {
		Board b = new Board(2);
		Position p = new Position(0, 0, b);
		p.specialSpot(-1);
		int actual = p._offset;
		int expected = -1;
		assertTrue(actual == expected);
	}
	
	@Test
	public void moveTopHeightTest() {
		Board b = new Board(2);
		Position p = new Position(0, 0, b);
		Piece pi = new Piece("Red");
		Piece pi2 = new Piece("Blue");
		b.createArray();
		b.middleTrack()[0].putOn(pi);
		b.middleTrack()[0].putOn(pi);
		b.middleTrack()[0].moveTop();
		int expected = 2;
		int actual = b.middleTrack()[0].height();
		assertTrue(actual == expected);
	}

}
