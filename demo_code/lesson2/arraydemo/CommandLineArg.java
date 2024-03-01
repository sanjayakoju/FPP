package lesson2.arraydemo;

import java.util.Arrays;

public class CommandLineArg {
	public static void main(String[] args) {
		
		/* Commandline parameters can be inserted into a Run Configuration in Eclipse.
		 *       Right click class > Run As > Run Configurations,Check the Main Class name, 
		 *       add Program Arguments in Arguments tab. */ 
		if(args.length>0)
		System.out.println("Arguments Values : " + Arrays.toString(args));
		
		int len = 0;
		if(args != null) len = args.length;
		for(int i = 0; i < len; ++i) {  
		    System.out.println("position " + i + ": " + args[i]);
		} 
      } 
}
        

