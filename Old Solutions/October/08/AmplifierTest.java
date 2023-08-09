// AmplifierTest.java
import java.util.Scanner;
public class AmplifierTest {
	public static void main(String [] args) {

		Scanner in = new Scanner(System.in);
		Amplifier a = null;
		
		String type = in.next();
		double r1 = in.nextDouble();
		double r2 = in.nextDouble();
		
		switch (type) {
			case "invert":
				a = new InvrtAmp(r1, r2);
				break;
			case "noninvert":
				a = new NInvrtAmp(r1, r2);
				break;
			case "voltdivide":
				a = new VDivAmp(r1, r2);
				break;
			default:
				System.out.println("Unknown amplifier type");
		}

		System.out.printf("Amplifier is %s%n", a.getDescription());
		System.out.printf("Gain from %s is %.2f%n", a, a.getGain());

		// Clean Up
		in.close();
	}
}