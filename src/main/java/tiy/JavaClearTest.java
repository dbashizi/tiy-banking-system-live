public class JavaClearTest { 

	static String os = System.getProperty("os.name"); 

	public static void main(String[] args) throws Exception { 
		System.out.println("Running ..."); 

		clearScreen(); 

		System.out.println("Done!"); 
	}

	static void clearWindowsScreen() throws Exception { 
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor(); 
	}

	static void clearScreen() throws Exception { 
		if (os.contains("Windows")) { 
			clearWindowsScreen(); 
		} else { 
			System.out.print("\033[H\033[2J");
		}
	}

}