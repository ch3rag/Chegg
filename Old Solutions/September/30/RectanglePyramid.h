#ifndef RECTANGLE_PYRAMID_H
#define RECTANGLE_PYRAMID_H

/*******************************************************************************
* `RectanglePyramid` Class Specification
*******************************************************************************/

class RectanglePyramid {
	private:
		double length;
		double width;
		double height;
	public:
		// Constructor Specification
		// Three Double Parameters For Length, Width, And Height
		RectanglePyramid(double, double, double);
		double getLength() const;
		double getWidth() const;
		double getHeight() const;
		void setLength(double);
		void setWidth(double);
		void setHeight(double);
		double calcVolume();
};
#endif