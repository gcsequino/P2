// P2 AssignmentFeb 19, 2020
// Author: Greyson Sequino
// Date: Feb 19, 2020
// Class: CS165
// Email: greyson.sequino@colostate.edu

public class Triangle extends Primitive {
	// Data fields
	int color;
	int x0,y0;
	int x1,y1;
	int x2,y2;
	boolean isFilled;
	
	// Constructor
	public Triangle(int x0,int y0,int x1,int y1,int x2,int y2) {
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	// Triangle methods
	public void setColor(int c) {
		this.color = c;
	}
	
	public void setFilled(boolean f) {
		this.isFilled = f;
	}
	
	public void draw(UserInterface ui) {
		int[] xPoints = {x0,x1,x2};
		int[] yPoints = {y0,y1,y2};
		ui.fillColor(color);
		ui.lineColor(color);
		ui.drawPolygon(xPoints, yPoints, isFilled);
	}

}
