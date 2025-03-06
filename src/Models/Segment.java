package Models;

import SwingShapes.Ellipse;
import SwingShapes.Rectangle;
import java.awt.Color;
import java.awt.Graphics2D;

public class Segment {
	private Ellipse segment;
	private Rectangle rectangle;
	
	public Segment(int startXLocation, int startYLocation, Color color) {
		rectangle = new Rectangle();
		rectangle.setColor(color);
		rectangle.setSize(20,  20);
		rectangle.setLocation(startXLocation, startYLocation);
	}

	public int getXLocation() {
		return rectangle.getXLocation();
	}

	public int getYLocation() {
		return rectangle.getYLocation();
	}
	
	public void setColor(Color color) {
		rectangle.setColor(color);
	}
	
	public void draw(Graphics2D g) {
		rectangle.paint(g);
	}
}
