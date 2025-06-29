// 0 
// 1 1 
// 0 0 0 
// 1 1 1 1
// 0 0 0 0 0



// import javax.swing.text.html.FormView;

public class pattern10 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i ; j++) {
              

                if(i%2==0) {
                System.out.print("1 ");
            } else {
                    System.out.print("0 ");
                
            }
        }
           System.out.println();
        
        }
    }
    
}
