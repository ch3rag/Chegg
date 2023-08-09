public class SnowManProg {
	public static void main(String[] args) {
		SnowMan snowman = new SnowMan(50, 10);
		snowman.draw();

		snowman = new SnowMan(120, 10);
		snowman.draw();

		snowman = new SnowMan(150, 150);
		snowman.draw();

		snowman = new SnowMan(-10, -10);
		snowman.draw();
	}
}
 