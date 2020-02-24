// P2 AssignmentFeb 19, 2020
// Author: Greyson Sequino
// Date: Feb 19, 2020
// Class: CS165
// Email: greyson.sequino@colostate.edu

public class Circle extends Primitive {
	// Data fields
	int color;
	int x,y;
	int radius;
	boolean isFilled;
	
	// Constructor
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	// Circle methods
	public void setColor(int c) {
		this.color = c;
	}
	
	public void setFilled(boolean f) {
		this.isFilled = f;
	}
	
	public void draw(UserInterface ui) {
		ui.fillColor(color);
		ui.lineColor(color);
		ui.drawOval(x, y, radius, radius, isFilled);
	}

}
