package FromVSCodeJava;

public class demo {
    public static void main(String[] args) {
        d1();
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
