package entitites;

public class Rectangle implements Resizable {
	
	private double Width;
	private double Height;

	@Override
	public double resizeWidth(double Width) {
		return this.Width = Width;
	}

	@Override
	public double resizeHeight(double Height) {
		return this.Height = Height;
	}

	public double getWidth() {
		return Width;
	}

	public void setWidth(double width) {
		Width = width;
	}

	public double getHeight() {
		return Height;
	}

	public void setHeight(double height) {
		Height = height;
	}

	public Rectangle(double width, double height) {
		super();
		Width = width;
		Height = height;
	}

	@Override
	public String toString() {
		return "Width=" + Width + "\nHeight=" + Height;
	}
	

}
