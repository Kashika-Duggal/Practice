import java.time.YearMonth;
import java.util.Scanner;


public class EnumPract {

    public enum MonthsofYear{JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AGUST,SEPTEMPER,OCROMBER,NOVEMBER,DECEMBER}

    public static void main(String[] args) {

        for(MonthsofYear mth : MonthsofYear.values())
            System.out.println(mth);

        int year=2023;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a month");

        int month=sc.nextInt();

        YearMonth yrmnth=YearMonth.of(year, month);
        int numdaysInMonth=yrmnth.lengthOfMonth();

        System.out.println("Number of the days in "+yrmnth.getMonth()+" :"+numdaysInMonth);
    }

 

}
