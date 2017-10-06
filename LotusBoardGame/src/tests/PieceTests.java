package tests;

import static org.junit.Assert.assertTrue;
import model.Board;
import model.Piece;
import model.Position;

import org.junit.Test;

public class PieceTests {

	@Test
	public void toStringTest() {
		Piece p = new Piece("Red");
		String actual = p.toString();
		String expected = "Red";
		assertTrue(actual == expected);

	}

	@Test
	public void getTrackAndSetTrackTest() {
		Board b = new Board(2);
		Piece p = new Piece("Red");
		Position[] po = new Position[2];
		po[0] = new Position(0, 0, b);
		po[1] = new Position(0, 1, b);
		p.setTrack(po);
		Position[] actual = p.getTrack();
		Position[] expected = po;
		assertTrue(actual.equals(expected));

	}
}
