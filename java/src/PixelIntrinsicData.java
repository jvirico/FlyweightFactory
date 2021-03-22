package flyweight;

import java.util.ArrayList;

public class PixelIntrinsicData {
	private static ArrayList<PixelColor> _Colors;
	
	public PixelIntrinsicData() {
		
		if (_Colors == null) {
			_Colors = new ArrayList<PixelColor>();
		}
	}
	
	public PixelColor getPixelColor(int color) {
		
		boolean found = false;
		PixelColor retorno = null;
		
		for (PixelColor c : _Colors){
			if (c.getColor() == color) {
				found = true;
				retorno = c;
				break;
			}
		}
		if (!found) {
			retorno = new PixelColor(color);
			_Colors.add(retorno);
		}
		
		return retorno;
	}
}
