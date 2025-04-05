import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var usuario = new Usuario();
        List<Usuario> usuarios = new ArrayList<>();

        usuario.exibeMenu();
//        Escolha uma das opções abaixo:
//
//        1- Cadastrar Usuário
//        2- Listar usuarios cadastrados
//        3- Sair

        String opcao = sc.nextLine();

        do {
            usuario.exibeMenu(); // Exibe o menu
            opcao = sc.nextLine(); // Lê a opção do usuário

            switch (opcao) {
                case "1":
                    usuario.cadastrarUsuario(sc, usuarios);
                    break;
                case "2":
                    usuario.listarUsuario(usuarios);
                    break;
                case "3":
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (!opcao.equals("3"));
    }
}







