public class operator {
    /**
    *arithmetic-> +,,-,*,/,%
     * boolean-> true, false
     * ternary->  ,:
     * relational->.. < ,> ,<= ,>=
     * logical-> &&, ||
     * Assignment-> =, +=, -=, *=, /=, %= , |=
     * unary->  --,++
     * shift->  >>,<<
     */
    public static void main(String[] args) {
        int i = 10;
        int j = 0;

       // System.out.println(i++); //i=i +1  output=10
       // System.out.println(i);   //i+1 =i   output=11
      //  System.out.println(i+j);
        //System.out.println(++i);  // 1+i = i  output=11
      //  System.out.println(i--); //i=i -1  output=10
      //  System.out.println(i);   //i-1 =i   output=9
        //  System.out.println(--i);  // 1-i = i  output=9
       // System.out.println(i<<2);  //1*2^2 = i*4 =40
        //System.out.println(i<<2);  //1/2^2 = i/2 =2

//        System.out.println(i&j); //1010     //
                                 //1010
                                //.......
                                 //1010


        if(i>0 && j>0){
            System.out.println("both are not zero");

        }else {
            System.out.println("in else");
        }

        if(i>0 || j>0){
            System.out.println("both are not zero");

        }else {
            System.out.println("in else");
        }
        String ot= i>0 || j>0 ?"both are not zero":"in else";
        System.out.println(ot);

    }

}

