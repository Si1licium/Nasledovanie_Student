public class Main {
public static void main (String[] args) {
        Student student = new Aspirant ();

        Student Nill  = new Student();
        Nill.firstName = "Mark";
        Nill.lastName = "Smit";
        Nill.group = "PKS-120";
        Nill.averageMark = 5.0;

        Aspirant Jack = new Aspirant ();
        Jack.firstName = "Anny";
        Jack.lastName = "Coyl";
        Jack.group = "ISP-219";
        Jack.averageMark = 4.5;

        Student[] all = {Nill, Jack};

        for (int i = 0; i < all.length ;i++){
        all [i].getScholarship ();
        }
        }
}