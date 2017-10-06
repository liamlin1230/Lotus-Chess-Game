package tests;

import static org.junit.Assert.assertTrue;
import model.Board;
import model.StartPosition;

import org.junit.Test;

public class BoardTests {

	@Test
	public void getPlayerStart3PlayersTest() {
		Board b = new Board(3);
		int actualP3P2 = b.getPlayerStart(2, 1).height();
		int expectedP3P2 = 2;
		assertTrue(actualP3P2 == expectedP3P2);

		int actualP3P1 = b.getPlayerStart(2, 0).height();
		int expectedP3P1 = 1;
		assertTrue(actualP3P1 == expectedP3P1);

		int actualP3P3 = b.getPlayerStart(2, 2).height();
		int expectedP3P3 = 3;
		assertTrue(actualP3P3 == expectedP3P3);

		int actualP3P4 = b.getPlayerStart(2, 3).height();
		int expectedP3P4 = 4;
		assertTrue(actualP3P4 == expectedP3P4);
	}

	@Test
	public void getPlayerStart6PlayersTest() {
		Board b = new Board(6);
		int actualP3P2 = b.getPlayerStart(2, 1).height();
		int expectedP3P2 = 2;
		assertTrue(actualP3P2 == expectedP3P2);

		int actualP3P1 = b.getPlayerStart(2, 0).height();
		int expectedP3P1 = 1;
		assertTrue(actualP3P1 == expectedP3P1);

		int actualP3P3 = b.getPlayerStart(2, 2).height();
		int expectedP3P3 = 3;
		assertTrue(actualP3P3 == expectedP3P3);
	}

	@Test
	public void getLeftTest() {

		Board b = new Board(2);

		int actual0 = b.getLeft(0).height();
		int expected0 = 0;
		assertTrue(actual0 == expected0);

		StartPosition[] s = b.getPlayerStart(0);
		s[0].moveTopLeft();
		int actual = b.getLeft(0).height();
		int expected = 1;
		assertTrue(actual == expected);

		StartPosition[] s1 = b.getPlayerStart(0);
		s[1].moveTopLeft();
		int actual1 = b.getLeft(1).height();
		int expected1 = 1;
		assertTrue(actual1 == expected1);

		StartPosition[] s2 = b.getPlayerStart(0);
		s[2].moveTopLeft();
		int actual2 = b.getLeft(2).height();
		int expected2 = 1;
		assertTrue(actual2 == expected2);

		StartPosition[] s3 = b.getPlayerStart(0);
		s[3].moveTopLeft();
		int actual3 = b.getLeft(3).height();
		int expected3 = 1;
		assertTrue(actual3 == expected3);
	}

	@Test
	public void getRightTest() {

		Board b = new Board(2);

		int actual0 = b.getRight(0).height();
		int expected0 = 0;
		assertTrue(actual0 == expected0);

		StartPosition[] s = b.getPlayerStart(0);
		s[0].moveTopRight();
		int actual = b.getRight(0).height();
		int expected = 1;
		assertTrue(actual == expected);

		StartPosition[] s1 = b.getPlayerStart(0);
		s[1].moveTopRight();
		int actual1 = b.getRight(1).height();
		int expected1 = 1;
		assertTrue(actual1 == expected1);

		StartPosition[] s2 = b.getPlayerStart(0);
		s[2].moveTopRight();
		int actual2 = b.getRight(2).height();
		int expected2 = 1;
		assertTrue(actual2 == expected2);

		StartPosition[] s3 = b.getPlayerStart(0);
		s[3].moveTopRight();
		int actual3 = b.getRight(3).height();
		int expected3 = 1;
		assertTrue(actual3 == expected3);
	}

	@Test
	public void getMiddleTest() {
		Board b = new Board(2);

		int actual0 = b.getMiddle(0).height();
		int expected0 = 0;
		assertTrue(actual0 == expected0);

		StartPosition[] s = b.getPlayerStart(0);
		s[0].moveTopMiddle();
		int actual = b.getMiddle(0).height();
		int expected = 1;
		assertTrue(actual == expected);

		StartPosition[] s1 = b.getPlayerStart(0);
		s[1].moveTopMiddle();
		int actual1 = b.getMiddle(1).height();
		int expected1 = 1;
		assertTrue(actual1 == expected1);

		StartPosition[] s2 = b.getPlayerStart(0);
		s[2].moveTopMiddle();
		int actual2 = b.getMiddle(2).height();
		int expected2 = 1;
		assertTrue(actual2 == expected2);

		StartPosition[] s3 = b.getPlayerStart(0);
		s[3].moveTopMiddle();
		int actual3 = b.getMiddle(3).height();
		int expected3 = 1;
		assertTrue(actual3 == expected3);
	}

	@Test
	public void getCommonTest() {

		Board b = new Board(2);

		int actual0 = b.getCommon(0).height();
		int expected0 = 0;
		assertTrue(actual0 == expected0);

		StartPosition[] s = b.getPlayerStart(0);
		s[0].moveTopRight();
		int actual = b.getCommon(0).height();
		int expected = 1;
		assertTrue(actual == expected);

		StartPosition[] s1 = b.getPlayerStart(0);
		s[1].moveTopRight();
		int actual1 = b.getCommon(1).height();
		int expected1 = 1;
		assertTrue(actual1 == expected1);

		StartPosition[] s2 = b.getPlayerStart(0);
		s[2].moveTopRight();
		int actual2 = b.getCommon(2).height();
		int expected2 = 1;
		assertTrue(actual2 == expected2);

		StartPosition[] s3 = b.getPlayerStart(0);
		s[3].moveTopRight();
		int actual3 = b.getCommon(3).height();
		int expected3 = 1;
		assertTrue(actual3 == expected3);
	}

	@Test
	public void leftTrackTest() {
		Board b = new Board(2);
		int actual = b.leftTrack().length;
		int expected = 14;
		assertTrue(actual == expected);
	}

	@Test
	public void middleTrackTest() {
		Board b = new Board(2);
		int actual = b.middleTrack().length;
		int expected = 14;
		assertTrue(actual == expected);
	}

	@Test
	public void rightTrackTest() {
		Board b = new Board(2);
		int actual = b.rightTrack().length;
		int expected = 14;
		assertTrue(actual == expected);
	}

	@Test
	public void getPlayersTest() {
		Board b = new Board(2);
		int actual = b.getPlayers();
		int expected = 2;
		assertTrue(actual == expected);
	}

	@Test
	public void getPlayerStartTest() {
		Board b = new Board(2);
		int actual = b.getPlayerStart(0).length;
		int expected = 4;
		assertTrue(actual == expected);
	}

}
