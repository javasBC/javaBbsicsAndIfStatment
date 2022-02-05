import java.util.Random;

public class myFirstJava {
    public static void main(String[] args) {
        // this is a comment line

        /*
            this is a block f comments
             to write more than one line of comment
         */


        System.out.println("java is life "); //to print "java is life" to the console

        byte age = 50;
        short s1 = -32768;
        int x = 2_000_000_000;
        long l1 = 330l;
        boolean b1 = false;
        float f1 = 0.0f;
        double d1 = 15.5;
        char ch = 't';


        String name = "5+9";
        System.out.println(name); // to prints the value of name
        System.out.println(name.toUpperCase());//converts all lower to upper case
        System.out.println(name.toLowerCase());// converts all the upper to lower case
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf("hodi")); //returns the position of the first litter in the text
        System.out.println(name.length()); // return the len of the String -
        System.out.println("   good     morning  ");
        System.out.println("   good     morning  ".trim()); // delete all the spaces before and after the actual text

        //hi im my name is "hodi"
        System.out.println("hi my name is \"hodi\"");
        System.out.println("hi my name is \\hodi\\");
        System.out.println("hi my name is \'hodi\'");
        System.out.println("hi my name is \t hodi");

        int x1 = 5, y = 6;
        int z0 = x1 + y;
        int z1 = x1 - y;
        int z2 = x1 * y;
        int z3 = x1 / y;
        int z4 = x1 % y;
        x++;
        x = x + 1;
        x = x - 1;
        x--;
        // x+=8  x=x+8
        // x*=8  x=x*8
        // x/=8  x=x/8
        // x%=8  x=x%8


        System.out.println("+" + z0);
        System.out.println("-" + z1);
        System.out.println("*" + z2);
        System.out.println("/" + z3);
        System.out.println("%" + z4);
        int x3 = 3;
        double ans = (double) x3 / 2.0;
        x3 = (int) ans;
        double s = x3;
        System.out.println(ans);
        System.out.println(x3);
        System.out.println(s);
        /*int x= 5;
        int y=8;
         x=x*5;
         x*=5;
         //x+=y;=> x=x+y  */

        System.out.println(Math.sqrt(169));
        System.out.println(Math.max(-0.15, -0.5));
        System.out.println(Math.min(85, 88));
        System.out.println(Math.abs(-33));
        System.out.println(Math.random());

        Random rnd = new Random();
        System.out.println(rnd.nextInt(100));
        System.out.println(-50 + rnd.nextInt(101)); // -50---50

        //binet's formula to calc a number in fibonacci's number by position
        // 0  1  1  2  3   5   8     13       21
        // f=(phi)^n - ((-(phi)^-n))/sqrt(5)
        // phi=1.61803
        // Sn = (Φⁿ–(– Φ⁻ⁿ))/√5
        int n = 5;
        float phi = 1.61803f;
        double f = (Math.pow(phi, n) - Math.pow(-phi, -n)) / Math.sqrt(5);
        System.out.println(Math.floor(f));

        int number = 5;
        if (number % 2 == 0)
            System.out.println("zogi");
        else
            System.out.println("lo zogi");


        int age1 = -110;

        if (age1 > 0 && age1++ < 20)
            System.out.println("hii kid");
        if (age1 >= 20 && age1 <= 60)
            System.out.println("hii adult");
        if (age1 > 60 && age1 <= 120)
            System.out.println("hi wise man");
        if (age1 <= 0 || age1 > 120)
            System.out.println("not exist");
        System.out.println();//sout

        int x4 = 8;

        if (x4 > 20) {
            System.out.println("greater than 20 ");
        } else if (x4 >= 10) {
            System.out.println("betwwen  10 - 20");
        } else {
            System.out.println("lower than 10");
        }




        if (x > 3)
            System.out.println(3 + 9);
        System.out.println(9 + 78);
        int e = 22;



        /*

        what is the output

        a=1 b=2 c=3
        3.if (a < c)
            System.out.println("*");
        else if (a == b)
            System.out.println("&");
        else
            System.out.println("$");

            */




         /*
         a=1 b=2 c=3
       4. if(c<b)
            System.out.println("####");
        int x=15;
        else
            System.out.println("&&&&");
        System.out.println("****");
        #####
        ****

        &&&&
        ****

        a=1 b=2 c=3
        5. if(c>b)
            System.out.println("####");
        else
        {System.out.println("&&&&");
            System.out.println("****");}

            &&&&
            ****

            ####
        */
        int t = 4;
        System.out.println(++t);


            /*
                    a=1 b=3 c=4
                    b++;
    `           if(a++> ++b || a-- > 0)
                    c++;
                 else
                    c--;
                 System.out.println(a+" "+b+" "+c);


            */


    }

}
