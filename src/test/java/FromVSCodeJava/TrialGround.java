package FromVSCodeJava;

public class TrialGround {
    public static void main(String[] args) {
//        d1();
        d2();
    }

    private static void d2() {
		// TODO Auto-generated method stub
    	try {
    		  // Code that may throw an exception goes here
    		  int result = 1 / 0;
    		} catch (ArithmeticException e) {
    		  // Exception handling code goes here
    		  System.out.println("An arithmetic exception occurred: " + e.getMessage());
    		} finally {
    		  // Finally block is optional and is executed whether an exception was thrown or not
    		  System.out.println("This code is always executed.");
    		}

		
	}

	public static void d1(){
        String str = "I Am Not String";
        System.out.println("Input String->"+str);
        char[] ch = str.toCharArray();
        char[] ch1 = new char[str.length()];
        System.out.println(ch1);
        // System.out.println(Integer.valueOf(ch1));

       int size = ch.length;
       char[] resultArray = new char[size];

       for(int i=0 ; i<size; i++){
          if(ch[i] == ' '){
              resultArray[i] = ' ';
          }
       }
       int j = resultArray.length-1;

       for (int i=0; i<ch.length; i++){
           if(ch[i]!=' '){
               if(resultArray[j] == ' '){
                   j--;
               }
                   resultArray[j] = ch[i];
               j--;
           }
       }
       System.out.println("Reverse string-->" +String.valueOf(resultArray));
    }
}
