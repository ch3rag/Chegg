
int diameter = 40;
int b1x, b1y, b1clr;
int b2x, b2y, b2clr;
int b3x, b3y, b3clr;
int b4x, b4y, b4clr;

void setup() {
  size(600, 600);
   
  b1x = b2x = b3x = b4x = width / 2;
  b1y = b2y = b3y = b4y = height / 2;
  ellipseMode(CENTER);
  

}

void draw() {
  background(255);
  fill(color(b1clr, 0, 0));
  ellipse(b1x, b1y, diameter,diameter);
  b1x--;
  b1clr++;
  
  fill(color(0, b2clr, 0));
  ellipse(b2x, b2y, diameter, diameter);
  b2x++;
  b2clr++;
  
  fill(color(0, 0, b3clr));
  ellipse(b3x, b3y, diameter, diameter);
  b3y--;
  b3clr++;
  
  fill(color(b4clr, 0, b4clr));
  ellipse(b4x, b4y, diameter, diameter);
  b4y++;
  b4clr++;
}
