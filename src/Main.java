import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double powBudynku, double powPodworka, double powParkingu);
            - String adresBudynku(String miejscowosc, String ulica, int nrDomu, String nrLokalu, String kodPocztowy);
            - void liczbaOkien(int value); // użycie jak setter
            - void liczbaMieszkancow(int value); // użycie jak setter
            - void kolorDomu(KolorEnum kolor); // użycie jak setter
            - double wyliczCene(double powierzchnia, double cena);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie (nie deklarujemy tej metody w interfejsie),
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól,
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom,
        d) sprawdzić czy idzie wywołać z obu instancji objektu (deklaracja z interfejsu i z klasy)
        metodę której nie ma zadeklarowane w interfejsie Budynek, ale jest dopisana w klassie Dom,
        */
    }

 House house = new House() {
     @Override
     public double buildingSurface(double surface) {
         return 115;
     }

     @Override
     public String adress(String adress1) {
         return "Gdańsk";
     }

     @Override
     public int windowsCount(int windows) {
         return 15;
     }

     @Override
     public int citizenCount(int citizen) {
         return 1500;
     }

     @Override
     public void houseColor(EnumColor color) {

     }

     @Override
     public int roomsCount(int rooms, int bathrooms) {
         return super.roomsCount(7,2) ;
     }
 } ;
    House building = new House(){
        @Override
        public double buildingSurface(double surface) {
            return 50;
        }

        @Override
        public String adress(String adress1) {
            return "Gdynia";
        }

        @Override
        public int windowsCount(int windows) {
            return 7;
        }

        @Override
        public int citizenCount(int citizen) {
            return 50;
        }

        @Override
        public void houseColor(EnumColor color) {

        }

        @Override
        public int roomsCount(int rooms, int bathrooms) {
            return roomsCount(3,2) ;
        }
    };

}
enum EnumColor{
    White, Black, Red, Blue, Green

}