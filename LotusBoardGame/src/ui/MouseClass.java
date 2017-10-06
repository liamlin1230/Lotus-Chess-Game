package ui;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

/**
 * A class that uses some of the finch's methods in conjunction with the Robot
 * class to create a mouse controller
 * 
 * @author Liam
 * 
 */
public class MouseClass implements ActionListener {
	private final Finch _finch;
	private final Robot _robot;
	private int _x;
	private int _y;

	/**
	 * A constructor where a reference to the finch is passed in and assigned to
	 * the _finch, for use within the the class A new Robot is created and the
	 * starting coordinates are initialized
	 * 
	 * @param finch
	 *            a reference to the finch
	 * @throws AWTException
	 *             exception is thrown when the GraphicsEnvironment.isHeadless()
	 *             returns true
	 */
	public MouseClass(Finch finch) throws AWTException {
		_finch = finch;
		_x = 0;
		_y = 0;
		_robot = new Robot();
	}

	/**
	 * A method that checks the current "state of the finch and then moves the
	 * mouse accordingly to the state and changes the color of the beak
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (_finch.isBeakUp()) {
			if (_y < 1000) {
				_y = _y + 15;
			}
		} else if (_finch.isBeakDown()) {
			if (_y > 0) {
				_y = _y - 15;
			}
		} else if (_finch.isLeftWingDown()) {
			_x = _x - 15;
		} else if (_finch.isRightWingDown()) {
			_x = _x + 15;
		} else if (_finch.isShaken()) {
			_robot.mousePress(InputEvent.BUTTON1_MASK);
			_robot.mouseRelease(InputEvent.BUTTON1_MASK);
		}

		_robot.mouseMove(_x, _y);
	}
}
