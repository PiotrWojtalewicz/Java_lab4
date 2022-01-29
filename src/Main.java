import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        int[] tab =new int[6];
        for (int i = 0; i==5; i++){
            tab[i] = i+1;
        }
        try{

            System.out.println("Podaj numer indeksu tablicy od 0-5 : ");
            x = scan.nextInt();
            for (x: tab) {
                System.out.println(x);
            }

        }

        catch (InputMismatchException e ){
            System.out.println("Wpisz liczby całkowite łosiu");
         }
        catch (ArrayIndexOutOfBoundsException e ) {
            System.out.println("Wpisz liczbę od 1-6");
        }

        finally {
            System.out.println("Udało się zakończyć program");
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

