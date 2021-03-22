package flyweight;

public class Pixel {
	private int _row, _col;
	private PixelColor _color;
	
	public Pixel(int rowid, int colid, PixelColor color ) {
		_row = rowid;
		_col = colid;
		_color = color;
	}
	void report() {
		System.out.print( " " + _row + ", " + _col + ": "+ _color.getColor());
	}
}