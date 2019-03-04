package collectionHW;

public class Point implements Comparable<Point> {

	int x;
	int y;

	Point() {
		x = 0;
		y = 0;
	};

	Point(int _x, int _y) {
		x = _x;
		y = _y;
	};
	@Override
	public int compareTo(Point o) {

		int _x = o.x;
		int _y = o.y;
		if (x == _x) {
			if (y == _y) {
				return 0;
			}
		}
		else if (x < _x) 
				return -1;	
		else 
			return 1;
		if (y < _y) 
			return -1;
		else
			return 1;
	}
};