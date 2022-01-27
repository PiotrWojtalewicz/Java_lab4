
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) napisać interfejs CzlowiekI,
        b) zadeklarować 2 metody,

        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI,
        d) zadeklarować 3 metody,

        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI,
        f) zadeklarować 3 metody,
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI,
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI,
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować:
        --Code/Prawy myszy-->Generate-->getters/setters/toString),
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola,
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola,
        c) wypisać metody toString() wszystkich objektów,
        */

        Student student = new Student();
        student.setIndex(21);
        student.setAverageGrade(3.66);




        Student student1 = new Student();
        student1.setIndex(999);
        student1.setAverageGrade(4.67);


        Employee employee = new Employee();
        employee.setBoss("Masłowski");

        Employee employee1 = new Employee();
        employee1.setBoss("Twardowski");

        System.out.println("Surname of student: "+ student.surname() + "\n Index of student: " + student.getIndex() + "\n Age of student: " + student.age() + " \n Department of student: " + student.department() + "\n Field of Study: " + student.fieldOfStudy() + "\n Average grade of student: " + student.getAverageGrade() + "\n Library: " + student.library());
        System.out.println( student1.surname() + " " + student1.getIndex() + " " + student1.age() + " " + student1.department() + " " + student1.fieldOfStudy() + " " + student1.getAverageGrade() + " " + student1.library() );
        System.out.println("My surname is: "+ employee.surname() + "\n My position is: " + employee.position() + "\n I work: " + employee.hoursCount() + " hours per month." + "\n My income per month: " + employee.income() + "\n My boss is: " + employee.getBoss() );
        System.out.println(employee1.getBoss());



        /* zad.4* - Dla chętnych (bez dodatkowych punktów),
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */

        /* zad5* - Dla chętnych (bez dodatkowych punktów),
        a) stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę,
        b) dokończyć implementację metod z interfejsów,
        c) stworzyć pola w metodzie main() i wywołać metody
        */
    }

}
