package testGit;

public class Main7 {

	public static void main(String[] args) {

		for(int i = 1; i < 10+1; i++) {
			for(int k =0 ; k < 10-i; k++) {
				System.out.print(" ");
			}
			for(int n = 0; n < i; n++) {
				System.out.print("**");
			}
			System.out.println("");
		}
	}

}
