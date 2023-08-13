package importantprogram;

/**  InBuild Method
 * str.trim();
 * str.replaceAll
 *
 */
public class RemoveWhiteSpaces {
    public static void main(String[] args) {



       String str=" I Am Shraddha " ;
        System.out.println(str);
        String noWhiteSpace="";
        for (int i=0;i<str.length();i++){
            if ((str.charAt(i)!=' ')&& (str.charAt(i)!='\t')){
                noWhiteSpace=noWhiteSpace+str.charAt(i);
            }

        }
        System.out.println(noWhiteSpace);
//.........................................................................................
  String str2=" my name is shraddha";
        System.out.println("The String is: "+str2);
  String whitespace="";
  for (int i=0;i<str2.length();i++){
      if ((str2.charAt(i)!=' ') && (str2.charAt(i)!='\t')){
          whitespace=whitespace+str2.charAt(i);
      }
  }
        System.out.println("After Removing The Space : "+whitespace);
    }
}
