public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */

Square square = new Square();

        System.out.println("Field in the square: " + square.getField(2,2));
        System.out.println("Circule in the square: " + square.getCircuit(2,2,2,2));


Rectangle rectangle = new Rectangle();
        System.out.println("Field in the rectangle: " + rectangle.getField(2,4));
        System.out.println("Circule in the rectangle: " + rectangle.getCircule(2,4));


    }
}
