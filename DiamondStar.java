public class DiamondStar {
    public static void main(String[] args) {
        //upper half of the diamond
        for (int i = 0; i <5 ; i++){
            //print spaces
            for (int j = 5-1; j > i; j--) {
                System.out.print(" ");
            }
            //print asterisks
            for (int k = 0; k <=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Lower half of the diamond
        for (int i = 1; i < 5; i++) {
            //print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //print asterisks
            for (int k = 5-1; k >=i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
