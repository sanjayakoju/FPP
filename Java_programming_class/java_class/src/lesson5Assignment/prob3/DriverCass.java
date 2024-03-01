package lesson5Assignment.prob3;

public class DriverCass {

	public static void main(String[] args) {
		Figure figures[] = new Figure[5];
		figures[0] = new UpwardHat();
		figures[1] = new UpwardHat();
		figures[2] = new DownwardHat();
		figures[3] = new Facemaker();
		figures[4] = new Vertical();
		for(Figure fig: figures) {
			fig.getFigure();
		}
		System.out.println();
		for(Figure fig: figures) {
			System.out.print(fig.getClass().getSimpleName() + " : ");
			fig.getFigure();
			System.out.println();
		}
	}
}