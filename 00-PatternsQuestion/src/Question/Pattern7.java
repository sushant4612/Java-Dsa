package Question;
/*
 *****
 ****
 ***
 **
 *
 */
public class Pattern7 {
    public static void main(String[] args) {
        pattern7(5);
    }
    static void pattern7(int n){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=n-i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
