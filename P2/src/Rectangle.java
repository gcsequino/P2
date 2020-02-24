// P2 AssignmentFeb 19, 2020
// Author: Greyson Sequino
// Date: Feb 19, 2020
// Class: CS165
// Email: greyson.sequino@colostate.edu

public class Rectangle extends Primitive {
	// Data fields
	int color;
	int x,y;
	int width,height;
	boolean isFilled;
	
	// Constructor
	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	// Rectangle methods
	public void setColor(int c) {
		this.color = c;
	}
	
	public void setFilled(boolean f) {
		this.isFilled = f;
	}
	
	public void draw(UserInterface ui) {
		ui.fillColor(color);
		ui.lineColor(color);
		ui.drawRectangle(x, y, width, height, isFilled);
	}

}
