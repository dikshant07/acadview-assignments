public class Reverse {

    public static void main(String[] args)
    {
        int num=123456, revNum=0, tempNum,lastDigit;
        tempNum=num;

        while(num!=0)
        {
            tempNum=num/10;
            lastDigit=num%10;
            revNum=revNum*10+lastDigit;
            num=tempNum;
        }
        System.out.println("Reversed number is "+revNum);
    }
}