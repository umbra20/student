//  день второй, второе задание
public class day2 {
    public static void main(String[] args)
    {
        int day = 15;
        boolean m1 = (day > 0) && (day <= 10);
        boolean m2 = (day > 10) && (day <= 20);
        boolean m3 = (day > 20) && (day <= 31);
           if (day > 0 && day < 11)
        {
            System.out.println(day + "- первая декада");
        } else if (day > 10 && day < 21)
        {
            System.out.println(day + "- вторая декада");
        } else
            System.out.println(day + "- третья декада");


    }
    }
