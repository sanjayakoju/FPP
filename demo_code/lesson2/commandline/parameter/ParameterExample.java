package lesson2.commandline.parameter;

public class ParameterExample {

	public static void main(String[] args) {
		if (args.length > 0) { //args is never null
			return;
           }
		for (int i = 0; i < args.length ; ++i) {
			System.out.println("position " + i + ": " + args[i]);
		}
	}

}
