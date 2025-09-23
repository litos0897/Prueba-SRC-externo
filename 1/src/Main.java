//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //EJERCICIO 1//

        String nombre = "Pepe";
        long nivel = 22;
        int vida = 15;
        System.out.println("El jugador es: " + nombre + "\n , es nivel " + nivel + "\n y tiene " + vida + " puntos de vida");

        //EJERCICIO 2//

        long Pikachu = 2300;
        long Charmander = 1300;
        long daño = Pikachu - Charmander;
        System.out.println("Pikachu le hace " + daño + " puntos de daño a Charmander");

        //EJERCICIO 3//

        long dinero = 23000;
        long skin = 2300;
        long total = dinero - skin;
        System.out.println("Después de comprar la skin, te quedan " + total + " V-Bucks");

        //EJERCICIO 4//

        double campeon = 0.634;
        double buff = 0.200;
        double velocidadTotal = campeon + buff;
        System.out.println("La velocidad final de Jinx es " + velocidadTotal);

        //EJERCICIO 5//

        long MC = 2300;
        long VB = MC * 5;
        long RP = VB * 2;
        System.out.println(MC + " Monedas de Mincraft equivalen a " + VB + " V-Bucks y a " + RP + " RP del LOL");

        //EJERCICIO 6//

        int kills = 19;
        int deaths = 4;
        int assists = 3;
        int KDA = (kills + assists) / deaths;
        System.out.println("KDA = " + KDA);

        if (KDA >= 5) {
            System.out.println("Jugador PRO");
            System.out.println("Jugador Platino");

        } else if (KDA >= 3) {
            System.out.println("Jugador BUENO");
            System.out.println("Jugador Oro");

        }else if (KDA >= 1) {
        System.out.println("Jugador NORMAL");
        System.out.println("Jugador Plata");

        }else if (KDA <1) {
            System.out.println("Jugador NOOB");
            System.out.println("Jugador Bronce");
        }
    }

    }