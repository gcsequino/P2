// P2 AssignmentFeb 19, 2020
// Author: Greyson Sequino
// Date: Feb 19, 2020
// Class: CS165
// Email: greyson.sequino@colostate.edu

public class Square extends Primitive {
	// Data fields
	int color;
	int x,y;
	int size;
	boolean isFilled;
	
	// Constructor
	public Square(int x, int y, int size) {
		this.x = x;
		this.y = y;
		this.size = size;
	}
	
	// Square methods
	public void setColor(int c) {
		this.color = c;
	}
	
	public void setFilled(boolean f) {
		this.isFilled = f;
	}
	
	public void draw(UserInterface ui) {
		ui.fillColor(color);
		ui.lineColor(color);
		ui.drawRectangle(x, y, size, size, isFilled);
	}

}
