import java.util.Scanner;

public class Main {
    //Nazwa pliku taka sama jak nazwa klasy, Nazwa klasy dużą literą
    /*public static void main(String[] args) {
        System.out.println("Hello world!");
    }
     */
    public static void main(String[] args) {
        /*
        brak dostępne w pakiecie
        public dostępne wszędzie
        private dostępne tylko w tej klasie
        protected dostępne w tej klasie  w klasach dziedziczących w całym pakiecie
         */
        /*
        static metoda może być wywołana bez obiektu
         */
        System.out.println("Pierwszy program");
        System.out.println("wylosowanie jednej liczby z zakresu od 1 do 100");
        int wylosowana =(int) (Math.random()*100+1);//  Math.random() losowanie z zakresu <0,1)
        //typy proste int,double,float,boolean,char
        //zmienne tych typów nie są obiektami
        //rzutowanie zawężające
        //z liczby która zajmuje więcej miejsca w pamieci robię liczbę ktora zajmuje miej miejsca w pamięci
        System.out.println(wylosowana);
        System.out.println("podaj liczbę całkowitą z zakresu 1,100");
        Scanner klawiatura = new Scanner(System.in);
        int wpisana;
        wpisana = klawiatura.nextInt();
        if(wpisana == wylosowana){
            System.out.println("wygrałeś");
        }
        else{
            System.out.println("nie udało sie");

        //wyrażenie warunkowe
        int roznica = wylosowana > wpisana ? wylosowana - wpisana : wpisana - wylosowana;
        //całokowita z dzieleniea
        roznica = roznica/10;
            System.out.println(
                    switch (roznica) {
                        case 0 -> "było blisko";
                        case 1 -> "całkiem nieżle";
                        default -> "sprubuj ponownie";
                    }
                );

            }
        }
    }
