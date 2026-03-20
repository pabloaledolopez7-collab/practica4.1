import java.time.LocalDateTime;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		System.out.println("Hola mundo");
		mostrarFechaHora();

		Usuario[] usuarios = crearUsuarios(2);

		for (usuario u : usuarios) {
			System.out.println(u.nombre + " " + u.apellidos + " - " + u.email);
		}
	}

	public static void mostrarFechaHora() {
		LocalDateTime ahora = LocalDateTime.now();
		System.out.println("Fecha y hora actual: " + ahora);
	}

	public static Usuario[] crearUsuarios(int n) {
		Scanner sc = new Scanner(System.in);
		Usuario[] usuarios = new Usuario[n];

		for (int i = 0; i < n; i ++) {
			Usuario u = new Usuario();

			System.out.println("Nombre:");
			u.nombre = sc.nextLine();

			System.out.println("Apellidos:");
			u.apellidos = sc.nextLine();

			System.out.println("Email:");
			u.email = sc.nextLine();

			usuarios[i] = u;
		}

		return usuarios;
	}
}

