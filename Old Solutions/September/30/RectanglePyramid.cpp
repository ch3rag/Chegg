/*******************************************************************************
* `RectanglePyramid` Class Implementation
*******************************************************************************/
#include "RectanglePyramid.h"

// Constructor
RectanglePyramid :: RectanglePyramid(double length, double width, double height) {
	this->length = length;
	this->width = width;
	this->height = height;
}

double RectanglePyramid :: getLength() const {
	return length;
}

double RectanglePyramid :: getWidth() const {
	return width;
}

double RectanglePyramid :: getHeight() const {
	return height;
}

void RectanglePyramid :: setLength(double d) {
	length = d;
}

void RectanglePyramid :: setWidth(double d) {
	width = d;
}

void RectanglePyramid :: setHeight(double d) {
	height = d;
}

double RectanglePyramid :: calcVolume() {
	return (length * width * height) / 3.0;
}
