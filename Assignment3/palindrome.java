public class Palindrome {
      public static void main(String[] args)
    {
        int num=1111, revNum=0, tempNum,lastDigit,orig;
        orig=num;

        while(num!=0)
        {
            tempNum=num/10;
            lastDigit=num%10;
            revNum=revNum*10+lastDigit;
            num=tempNum;
        }

        if(orig==revNum)
            System.out.println("In Palindrome");
        else
            System.out.println("Not in Palindrome");
    }
}