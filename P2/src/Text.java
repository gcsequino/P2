// P2 AssignmentFeb 19, 2020
// Author: Greyson Sequino
// Date: Feb 19, 2020
// Class: CS165
// Email: greyson.sequino@colostate.edu

public class Text extends Primitive {
	// Data fields
	int color;
	int x,y;
	String text;
	String fontName;
	int fontSize;
	
	// Constructor
	public Text(int x, int y, java.lang.String text) {
		this.x = x;
		this.y = y;
		this.text = text;
	}
	
	// Text methods
	public void setColor(int c) {
		this.color = c;
	}
	
	public void setFont(java.lang.String name, int size ) {
		this.fontName = name;
		this.fontSize = size;
	}
	
	public void draw(UserInterface ui) {
		ui.textColor(color);
		ui.setFont(fontName,fontSize);
		ui.drawText(x, y, text);
	}

}
