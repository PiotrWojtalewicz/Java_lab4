import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int tab[] = {1,2,3,4,5,6};
        System.out.println("Podaj numer indeksu z zakresu 1-6");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if(x>= 6 || x< 0){
            try {
                System.out.println(tab[x]);
            }
            catch
            (ArrayIndexOutOfBoundsException e){
            System.out.println("Podaj liczbę od 1-6!!!!!!");
                throw e;
        }
        try {
            x= Integer.parseInt(scan.next());
        }
        catch (NumberFormatException e){
            System.out.println("Wprowadź liczbę całkowitą od 1-6!!!");
            throw e;
        }
        finally{
            System.out.println("zakończenie programu");
        }
        }






        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */
    }



        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */

    }

