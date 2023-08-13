package importantprogram;

public class FindLength {
    public static void main(String[] args) {
   int  len=0;
   String s="Hello shraddha";
  // s.trim();    //for remove blank spaces
   for (int i=s.length()-1;i>=0;i--){
       if (s.charAt(i)==' '){
          break;
       }
       else {
           len++;
       }
   }
        System.out.println("Length Of Last Word is "+len);
   //..........................................................................

   String str=" I am Fox ";          //blank space after last word
        int len1=0;
        boolean b=false;
        for (int i=str.length()-1;i>0;i--){
            if (str.charAt(i)==' ' && b==true){
                  break;
            } else if (str.charAt(i)!=' ') {
                b=true;
                len1++;
            }
        }
        System.out.println( "Length Of fox is"+len1);

//        ...........................................................
        int length=0;
        String a="This name";
        for (int i=0;i<a.length();i++){
            if (a.charAt(i)!=' '){//return the character at the specified index
                 length++;
            }else {
               break;
            }
        }
        System.out.println("Length of array is "+length);

    }}
