import java.util.Scanner;

public class HelloWorld {
    public static int sum(int a, int b){
        int sum= a+b;
        return sum;
    }
    //1. Given 3 numbers, print the biggest and the smallest
    public static void minandmax(int a,int b,int c){
        int min,max;
        //pt maxim
       if (a>=b) {
           max=a;
           min=b;
       }
       else {
           max = b;
           min=a;
       }
       if (c>=max){
           max=c;
       }
       else min=c;
       System.out.println(min);
       System.out.println(max);

    }
    //2. Given one character, print it if it is an upper case letter, otherwise print an error message.
    public static void verifyIfUppercase(char a){
        if(Character.isUpperCase(a)){
            System.out.println(a);
        }
        else System.out.println("The letter is not an upper case letter");
    }
    //3. Given a a strictly positive integer, find out whether it is a leap year(366 days) or not.
    public static boolean isLeapYear(int y){
        if(y%400==0){
            System.out.println("The year"+ y+"is a Leap year");
            return true;
        }
        if(y%100==0){
            System.out.println("The year"+ y+"is not a Leap year");
            return false;
        }
        if(y%4==0){
            System.out.println("The year"+ y+"is a Leap year");
            return true;
        }
        System.out.println("Not a Leap Year");
        return false;

    };
    //4.  Given 2 words from the keyboard, print “Great” if they are the same,
    // “Good” if they are the same but different case, “Okayish” if they are the
    // same length and “Bad” if they do not meet any of the criteria.
    public static void equalityOfTwoWords(String a,String b){
        String c,d;
        c=a.toLowerCase();
        d=b.toLowerCase();

        if(a.equals(b)==true){
            System.out.println("Great");
        }
        if(c.equals(d)==true){
            System.out.println("Good");
        }
        if(a.length()==b.length()){
            System.out.println("Okayish");
        }else System.out.println("Bad");


    };
    //5 Print the first 100 even numbers.
    public static void printEvenNumbers(){
        int i=1;
        int j=2;
        while(i!=100){
            System.out.println(j+" ");
            j=j+2;
            i=i+1;
        }
    };
    //6 Print the reverse of a given number (123 → 321)
    public static int getReverseOfNumber(int a){
        int newnr=0;
        int uc;
        if(a>=0 && a<=9) return a;
        while(a!=0){
            uc=a%10;//ultima cifra
            newnr=newnr*10+uc;
            a=a/10;

        }
     return newnr;
    };
    //7  Using 2 for loops, produce the output shown below:
    public static void letItSnow(int n){
        int m=n;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                System.out.print("*");
            m=m-1;
            System.out.println();
        }
    }
    //8 Generate the first 20 Fibonacci numbers.
    public static void fiboNumbers(int n){
        int a=1;
        int b=1;
        int c;
        while(n!=0){
            System.out.println(b);
            n=n-1;
            c=a+b;
            a=b;
            b=c;

        }
    }
    //9. Given an array of characters, encode it using Caesar's code.
    // Caesar's code encodes a letter by moving it n positions down
    // the alphabet cyclically. For n=3:  'A' → 'D', 'C' → 'F', 'Z' → 'C'
    //  “Testing” → “Whvwlqj”
    public static String getCaesarCode(String a,int nr){
        char c,c1;
        int n;
        StringBuilder newstr= new StringBuilder();
        for(int i=0;i<a.length();i++){
            //luam Stringul caracter cu caracter
            c= a.charAt(i);
            //transformare caracter in nr corespunzator
            n=(int) c;
            //adaugam un nr de pasi la codul ascii
            n = n+nr;
            if (n >122 && Character.isLowerCase(c)) {
                    int dif = n - 122;
                    n = 97 + (dif - 1);

                }
            if (n>90 && Character.isUpperCase(c)){
                int dif1= n-90;
                n=65+(dif1-1);
                }


            //transformare cod ascii in caracterul corespunzator
            c1=(char) n;
            newstr.append(c1);
        }
        return newstr.toString();
    }
    //Problems with lists



    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        /*System.out.println("Hello");
        System.out.println("Agi");
        System.out.println("The sum is: "+ sum(10,12));
        Dog d= new Dog("black",3,"toto");
        System.out.println(d.getColor());*/
        //1. Given 3 numbers, print the biggest and the smallest
       /* System.out.println("Min and max values: ");
        minandmax(5,3,6);
        minandmax(3,7,8);
        minandmax(8,6,5);
        //2. Given one character, print it if it is an upper case letter, otherwise print an error message.
        System.out.println("Verify if a letter is upper case");
        verifyIfUppercase('a');
        verifyIfUppercase('B');
        //3. Given a a strictly positive integer, find out whether it is a leap year(366 days) or not.
        System.out.println("Verify if an year is a leap year");
        isLeapYear(2000);
        isLeapYear(1904);
        isLeapYear(1995);
        //4.  Given 2 words from the keyboard, print “Great” if they are the same,
        // “Good” if they are the same but different case, “Okayish” if they are the
        // same length and “Bad” if they do not meet any of the criteria.
        System.out.println("Enter the first string:");
        String a= sc.nextLine();
        System.out.println("Enter the second string:");
        String b=sc.nextLine();
        equalityOfTwoWords(a,b);
        //5 Print the first 100 even numbers.
        printEvenNumbers();
        //6 Print the reverse of a given number (123 → 321)
        System.out.println("Enter a number to reverse: ");
        int x=sc.nextInt();
        System.out.println(getReverseOfNumber(x));
        //7  Using 2 for loops, produce the output shown below
        System.out.println("Enter a number to snow: ");
        int y=sc.nextInt();
        letItSnow(y);
        //8 Generate the first 20 Fibonacci numbers
        System.out.println("Enter the number of fibo numbers that you want:");
        int z=sc.nextInt();
        fiboNumbers(z);*/
        //9 Given an array of characters, encode it using Caesar's code.
        //  Caesar's code encodes a letter by moving it n positions down
        //  the alphabet cyclically. For n=3:  'A' → 'D', 'C' → 'F', 'Z' → 'C'
        //  “Testing” → “Whvwlqj”
        System.out.println("Caesar's code: ");
        System.out.println(getCaesarCode("Testing",3));


    };

}
