package packageRaya;
import java.util.Scanner;

public class P4TRESENRAYA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PARTE1
        Scanner scanner = new Scanner(System.in);
		
		// Solicitar los nombres de los jugadores
        System.out.print("Ingrese el nombre del jugador 1: ");
        String jugador1 = scanner.nextLine();
        
        System.out.print("Ingrese el nombre del jugador 2: ");
        String jugador2 = scanner.nextLine();
        
        char[][] tablero = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
            };
		
		//PARTE2

        int turnos = 0; 
        char jugadorActual = 'X'; 
        String jugadorNombre = jugador1; 
        
        //Bucle para los turnos de los jugadores
        while (turnos < 9) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(tablero[i][j] + " ");
                }
                System.out.println();
            }
            // Pedir al jugador que elija una casilla
            System.out.println(jugadorNombre + ", es tu turno. Elige una casilla (1-9): ");
            int casilla = scanner.nextInt();
            
            //PARTE3

            
            if (casilla < 1 || casilla > 9) {
                System.out.println("Número inválido. Elige un número entre 1 y 9.");
                continue;
            }
        
            int fila = 0;
            int columna = 0;

            if (casilla == 1) {
                fila = 0; columna = 0;
            } else if (casilla == 2) {
                fila = 0; columna = 1;
            } else if (casilla == 3) {
                fila = 0; columna = 2;
            } else if (casilla == 4) {
                fila = 1; columna = 0;
            } else if (casilla == 5) {
                fila = 1; columna = 1;
            } else if (casilla == 6) {
                fila = 1; columna = 2;
            } else if (casilla == 7) {
                fila = 2; columna = 0;
            } else if (casilla == 8) {
                fila = 2; columna = 1;
            } else if (casilla == 9) {
                fila = 2; columna = 2;
            }
            
            if (tablero[fila][columna] != '-') {
                System.out.println("¡Esa casilla ya está ocupada! Elige otra.");
                continue;
            }
            
            
        //PARTE4
            tablero[fila][columna] = jugadorActual;
            turnos++;
            
            // Comprobar filas
            for (int i = 0; i < 3; i++) {
                if (tablero[i][0] == jugadorActual && tablero[i][1] == jugadorActual && tablero[i][2] == jugadorActual) {
                    System.out.println("¡Felicidades " + jugadorNombre + ", has ganado!");
                    return; 
                }
            }
            
         // Comprobar columnas
            for (int i = 0; i < 3; i++) {
                if (tablero[0][i] == jugadorActual && tablero[1][i] == jugadorActual && tablero[2][i] == jugadorActual) {
                    System.out.println("¡Felicidades " + jugadorNombre + ", has ganado!");
                    return; 
                }
            }
            
         // Comprobar diagonales
            if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) {
                System.out.println("¡Felicidades " + jugadorNombre + ", has ganado!");
                return; // Sale del programa si hay un ganador
            }
            if (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
                System.out.println("¡Felicidades " + jugadorNombre + ", has ganado!");
                return; // Sale del programa si hay un ganador
            }

            //PARTE5
            
         // Cambiar de jugador
            if (jugadorActual == 'X') {
                jugadorActual = 'O';
                jugadorNombre = jugador2;
            } else {
                jugadorActual = 'X';
                jugadorNombre = jugador1;
            }
        }

        // Si no hay ganador después de 9 turnos
        System.out.println("¡Es un empate!");

        
        }
	
	}


