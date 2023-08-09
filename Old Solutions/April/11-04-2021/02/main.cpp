#include <windows.h>
#include <GL/glut.h>

void display(void)
{
	glColor3f(0.0, 0.0, 0.0);
	glColor3d(0.0, 0.0, 0.0);
	glBegin(GL_LINE_LOOP);
	glVertex2d(-5.0, -5.0);
	glVertex2d(5.0, -5.0);
	glVertex2d(5.0, 5.0);
	glVertex2d(-5.0, 5.0);
	glVertex2d(-5.0, -5.0);
	
	// More code here	
	glVertex2d(0, -5.0);
	glVertex2d(0, 0);
	glVertex2d(-1, 0);
	glVertex2d(-1, 2);
	glVertex2d(1, 2);
	glVertex2d(1, 0);
	glVertex2d(0, 0);
	glVertex2d(0, -5.0);
	glEnd();

	glFlush();
}

int main(int argc, char **argv)
{
	glutInit(&argc, argv);
	glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB | GLUT_DEPTH);
	glutInitWindowPosition(100, 100);
	glutInitWindowSize(600, 600);
	glutCreateWindow("OpenGL");
	glClearColor(1.0, 1.0, 1.0, 1.0);
	glMatrixMode(GL_PROJECTION);
	glLoadIdentity();
	glOrtho(-6.0, 6.0, -6.0, 6.0, -1.0, 1.0);
	glMatrixMode(GL_MODELVIEW);
	glutDisplayFunc(display);
	glutMainLoop();
	return 0;
}
