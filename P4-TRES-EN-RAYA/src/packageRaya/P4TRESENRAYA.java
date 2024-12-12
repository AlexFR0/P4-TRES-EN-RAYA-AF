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
        } 
		
		
		
		
	}

}
