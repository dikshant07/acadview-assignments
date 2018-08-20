class Leap_year
{
    static boolean checkYear(int year)
    {
        if (year % 400 == 0)
            return true;
     
        if (year % 100 == 0)
            return false;
     
        if (year % 4 == 0)
            return true;
        return false;
    }
         
    public static void main(String[] args) 
    {
        int year = 1998;
        System.out.println( checkYear(year)? "Leap Year" :
                           "Not a Leap Year" );
    }
}