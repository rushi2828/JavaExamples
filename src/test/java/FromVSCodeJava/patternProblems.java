package FromVSCodeJava;

public class patternProblems {
    public static void main(String[] args) {
        pp1(5);
        pp2(5);
    }

    //Right angle programme-->
    // * 
    // * *
    // * * *
    // * * * *
    // * * * * *
    private static void pp1(int count) {
        for(int i=0; i<count; i++){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Pyrimid triangle
    //           * 
    //         *   * 
    //       *   *   *
    //     *   *   *   * 
    //   *   *   *   *   *
    //      
    private static void pp2(int count) {
        for(int i=0; i<=count; i++){ //outer loop for no. of rows        
            for(int j=count-i; j>1; j--){ //inner loop to handle number of spaces  
                    System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    //Reverse pyramid 
    //   *   *   *   *   *
    //     *   *   *   *
    //       *   *   *
    //         *   *
    //           * 

}
