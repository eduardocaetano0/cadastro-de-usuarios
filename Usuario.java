import java.util.List;
import java.util.Scanner;

public class Usuario{
Scanner sc = new Scanner(System.in);
    private String nome;
    private String id;
    private String endereco;
    private String telefone;

    public String getEndereco() {
        return endereco;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getId() {
        return id;
    }

    public Usuario(String nome, String id, String endereco, String telefone){
        this.id = id;
        this.telefone = telefone;
        this.nome = nome;
        this.endereco = endereco;
    }
    public Usuario() {
    }
    public void exibeMenu(){
        System.out.println("""
                Escolha uma das opções abaixo:
                
                1- Cadastrar Usuário
                2- Listar usuarios cadastrados
                3- Sair
                
                """);

    }
    public void cadastrarUsuario(Scanner scanner, List<Usuario> usuarios) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("ID: ");
        String id = scanner.nextLine();
        scanner.nextLine();

        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        Usuario usuario = new Usuario(nome, id, endereco, telefone);
        usuarios.add(usuario);

        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void listarUsuario(List<Usuario> usuarios) {
        if(usuarios.isEmpty()){
            System.out.println("Nenhum usuário encontrado.");
        }else{
            System.out.println("\n Lista de usuários: ");
            for(Usuario usuario : usuarios){
                System.out.println("Nome: " + usuario.getNome());
                System.out.println("ID: " + usuario.getId());
                System.out.println("Endereço: " + usuario.getEndereco());
                System.out.println("Telefone: " + usuario.getTelefone());
                System.out.println("----------------------------------------");
            }
        }
    }
}