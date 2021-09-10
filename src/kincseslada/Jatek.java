package kincseslada;

import java.util.Scanner;

public class Jatek {
    Ladak kiiras = new Ladak();
    Scanner beolvas = new Scanner(System.in);
    void kezdes(){
        System.out.println("Szép napot vándor!\nKérlek válassz a 3 láda közül, de figyelj, hogy bölcsen tedd ezt,\nmivel csupán egyikben van kincs, és a ládák közül csak az egyik mond igazat!");
        kiiras.ladaValasz();
    }
    void kerdes(){
        System.out.print("\nA válaszod legyen egy sima szám, például 1.\nVálasz: ");
        int valasz = beolvas.nextInt();
        if (valasz==2) {
            System.out.println("Gratulálok, nyertél, tiéd a kincs!");
        }else{
            System.out.println("Sajnálom, nem találtad el..");
        }
    }
}
