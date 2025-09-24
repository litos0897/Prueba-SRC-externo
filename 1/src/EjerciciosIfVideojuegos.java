import java.sql.SQLOutput;

public class EjerciciosIfVideojuegos {
    public static void main(String[] args) {

// ==============================

        // EJERCICIO 1 – Vida del personaje (Minecraft)

        // ==============================

        // Declara una variable con la vida de un jugador (entero entre 0 y 100).

        // Usa if/else para imprimir:

        //   Vida > 70 → "Tu personaje está fuerte 💪"

        //   Vida entre 30 y 70 → "Tu personaje está herido 😢"

        //   Vida < 30 → "Tu personaje está en peligro ⚠️"

        int vida = 60;
        if (vida > 70) {
            System.out.println("Tu personaje está fuerte 💪");

        }if (vida >= 30 && vida <= 70) {
            System.out.println("Tu personaje está herido 😢");

        }if (vida < 30) {
            System.out.println("Tu personaje está en peligro ⚠️");

        }


            // ==============================

            // EJERCICIO 2 – Elección de ataque (Pokémon)

            // ==============================

            // Declara una variable con el tipo de ataque: "fuego", "agua" o "planta".

            // Con if/else if/else imprime:

            //   Si es fuego → "¡Es super eficaz contra planta!"

            //   Si es agua → "¡Es super eficaz contra fuego!"

            //   Si es planta → "¡Es super eficaz contra agua!"

            //   Otro caso → "Tipo de ataque no reconocido"

           String ataque = "fuego";

            if (ataque == "fuego") {
                System.out.println("¡Es super eficaz contra planta!");

            } else if (ataque == "agua") {
                System.out.println("¡Es super eficaz contra fuego!");

            } else if (ataque == "planta") {
                System.out.println("¡Es super eficaz contra agua!");

            } else {
                System.out.println("Tipo de ataque no reconocido");
            }


            // ==============================

            // EJERCICIO 3 – Tienda de objetos (Fortnite)

            // ==============================

            // Declara una variable con el número de V-Bucks.

            // Con if imprime qué puede comprar el jugador:

            //   Si tiene 2000 o más → "Puedes comprar una skin legendaria"

            //   Si tiene 1200 o más → "Puedes comprar una skin épica"

            //   Si tiene 800 o más → "Puedes comprar una skin rara"

            //   Si tiene menos de 800 → "No tienes suficientes V-Bucks"

            int vBucks = 2300;
            if (vBucks >= 2000) {
                System.out.println("Puedes comprar una skin legendaria");

            }if (vBucks >= 1200) {
                System.out.println("Puedes comprar una skin épica");

            }if (vBucks >= 800) {
                System.out.println("Puedes comparar una skin rara");

            }if (vBucks < 800) {
                System.out.println("No tienes suficientes V-Bucks");

            }


                // ==============================

                // EJERCICIO 4 – Clasificación de rango (League of Legends)

                // ==============================

                // Declara una variable con los puntos de ranking.

                // Con if imprime el rango:

                //   0–999   → "Bronce"

                //   1000–1999 → "Plata"

                //   2000–2999 → "Oro"

                //   3000 o más → "Platino"

                 long rango = 2500;

                  if (rango < 999) {
                      System.out.println("Bronce");

                  }else if (rango <=1000 && rango <= 1999) {
                System.out.println("Plata");

                  }else if (rango <=2000 && rango <= 2999) {
                      System.out.println("Oro");

                  }else if (rango <=3000) {
                      System.out.println("Platino");
                  }


                // ==============================

                // EJERCICIO 5 – Evento especial (Minecraft)

                // ==============================

                // Declara una variable "hora" (entero de 0 a 23).

                // Con if imprime:

                //   Entre 6 y 11 → "Es de mañana, los aldeanos están activos ☀️"

                //   Entre 12 y 18 → "Es de tarde, hora de explorar 🔍"

                //   Entre 19 y 23 → "Es de noche, cuidado con los mobs 🌙"

                //   Entre 0 y 5 → "Madrugada, mejor dormir 😴"

        int hora = 17;

                  if (hora >= 6 && hora <= 11) {
                      System.out.println("Es de mañana, los aldeanos están activos ☀️");

                  }else if (hora >= 12 && hora <= 18) {
                      System.out.println("Es de tarde, hora de explorar 🔍");

                  }else if (hora >= 19 && hora <= 23) {
                      System.out.println("Es de noche, cuidado con los mobs 🌙");

                  }else if (hora >= 0 && hora <= 5) {
                      System.out.println("Madrugada, mejor dormir 😴");
                  }


                // ==============================

                // EJERCICIO 6 – Reto final: Sistema de logros (multijuego)

                // ==============================

                // Declara tres variables:

                //   - kills (número de enemigos derrotados)

                //   - muertes (veces que ha muerto el jugador)

                //   - tiempo (minutos jugados)

                //

                // Crea condiciones con if para asignar logros:

                //   - Si kills >= 10 → "Logro: Cazador experto 🏹"

                //   - Si muertes == 0 → "Logro: Intocable 👑"

                //   - Si tiempo > 60 → "Logro: Maratón gamer ⏱️"

                //   - Si kills < muertes → "Logro: Necesita entrenar 🐣"

                //

                // Extensión opcional:

                //   - Combina condiciones con && y || para logros más complejos.

                //   - Ejemplo: (kills > 20 && muertes < 5) → "Logro: PRO absoluto 🔥"


        int kills = 30;
        int muertes = 0;
        int tiempo = 80;

        if (kills >= 12){
            System.out.println("Logro: Cazador experto 🏹");

        }if (muertes == 0){
            System.out.println("Logro: Intocable 👑");

        }if (tiempo > 60){
            System.out.println("Logro: Maratón gamer ⏱️");

        }if (kills < muertes) {
            System.out.println("Logro: Necesita entrenar 🐣");

        }if ((kills > 20 || muertes < 5) && tiempo > 70) {
            System.out.println("Logro: PRO absoluto 🔥");
        }




            }
        }

