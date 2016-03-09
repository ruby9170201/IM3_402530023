/*
 * [A]100
 * [TA's advise]
 * 1.Good Job.
 * */
class Rectangle {
	double Height, Width, X, Y;

	Rectangle(double _Height, double _Width, double _X, double _Y) {
		this.Height = _Height;
		this.Width = _Width;
		this.X = _X;
		this.Y = _Y;
	}

	Rectangle() {
	}

	double getHeight() {
		return this.Height;
	}

	double getWidth() {
		return this.Width;
	}

	double getX() {
		return this.X;
	}

	double getY() {
		return this.Y;
	}

	public String toString() {
		return "java.Rectangle[x=" + this.X + ",y=" + this.Y + ",width=" + this.Width + ",height=" + this.Height;
	}

}

public class RectangleTester {

	public static void main(String[] args) {

		Rectangle Rectangle1 = new Rectangle(18, 57, 25, 15);
		Rectangle Rectangle2 = new Rectangle(47, 60, 12, 0);
		double Area1 = Rectangle1.getHeight() * Rectangle1.getWidth();
		double Perimeter1 = Rectangle1.getHeight() * 2 + Rectangle1.getWidth() * 2;
		double Area2 = Rectangle2.getHeight() * Rectangle2.getWidth();
		double Perimeter2 = Rectangle2.getHeight() * 2 + Rectangle2.getWidth() * 2;
		System.out.println(Rectangle1);
		System.out.println("Area:" + Area1);
		System.out.println("Perimeter:" + Perimeter1 + "\r");
		System.out.println(Rectangle2);
		System.out.println("Area:" + Area2);
		System.out.println("Perimeter:" + Perimeter2);

	}

}
