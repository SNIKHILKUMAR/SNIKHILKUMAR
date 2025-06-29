// *********
//  *******
//   *****
//    ***
//     *
public class pattern17 {
	public static void main(String[] args) {
		int n=5;
        for (int i = n; i >=1 ; i--) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
                for (int j2 = 1; j2 <=2*i-1; j2++) {
                    System.out.print("*");
                }
            
            System.out.println();
}
}
}