package collectionHW;

import java.util.Comparator;

public abstract class CompareY implements Comparator<Point>{

	int x;
	int y;
	CompareY(int _x, int _y){
		x= _x;
		y = _y;
	}
	public boolean compareTo(int _x, int _y) {
		if (y == _y)
			if(x == _x)
				return true;
		return false;
	}

}
