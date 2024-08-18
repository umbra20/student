public class day2 {
    public static void main(String[] args) {
        int day = 32;
        boolean m1 = (day > 0) && (day <= 10);
        boolean m2 = (day > 10) && (day <= 20);
        boolean m3 = (day > 20) && (day <= 31);
        String m4 = "Такой даты нет";
        if (m1) {
            System.out.println(day + "- первая декада");
        } else if (m2) {
            System.out.println(day + "- вторая декада");
        } else if (m3) {
            System.out.println(day + "- третья декада");
        } else {
            System.out.println(m4);


        }


    }
}
