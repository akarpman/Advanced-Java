package collectionHW;

import java.util.Comparator;

public abstract class Point implements Comparable {
	int x;
	int y;
	Point(int _x, int _y){
		x= _x;
		y = _y;
	}
	public boolean compareTo(int _x, int _y) {
		if (x == _x)
			if(y == _y)
				return true;
		return false;
	}

};
