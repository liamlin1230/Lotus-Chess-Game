package ui;

import javax.swing.SwingUtilities;

/**
 * A class that runs the game
 * 
 * @author Liam
 * 
 */
public class Driver {
	public static void main(String[] args) {

		/**
		 * A an if statement that checks run arguments and then passes them into
		 * the game so that the correct game can be created based upon the
		 * arguments
		 */
		if (args.length < 8)
			if (args[0].equals("Finch") || args[0].equals("finch"))
				SwingUtilities.invokeLater(new Game(args.length - 1, true));
			else if (args[0].equals("Mouse") || args[0].equals("mouse"))
				SwingUtilities.invokeLater(new Game(args.length - 1, false));

	}
}
