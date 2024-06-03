import java.util.*;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Terraqueo kuririn = PersonagemFactory.criarKuririn();
        Sayajin goku = PersonagemFactory.criarGoku();
        Sayajin gohan = PersonagemFactory.criarGohan();
        Namekuseijin dende = PersonagemFactory.criarDende();

        PersonagemDragonBall[] personagens = {kuririn, goku, gohan, dende};

        while (true) {
            System.out.println("\nOpcoes:");
            System.out.println("1. Ver personagens");
            System.out.println("2. Ver características de um personagem");
            System.out.println("3. Evoluir Sayajin");
            System.out.println("4. Fazer pedido com Dendê");
            System.out.println("5. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\nPersonagens criados:");
                    for (int i = 0; i < personagens.length; i++) {
                        System.out.println((i + 1) + ". " + personagens[i].nome);
                    }
                    break;

                case 2:
                    System.out.print("Digite o número do personagem: ");
                    int numPersonagem = scanner.nextInt();
                    if (numPersonagem >= 1 && numPersonagem <= personagens.length) {
                        System.out.println(personagens[numPersonagem - 1]);
                    } else {
                        System.out.println("Personagem inválido.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o número do Sayajin: ");
                    int numSayajin = scanner.nextInt();
                    if (numSayajin == 2 || numSayajin == 3) {
                        Sayajin sayajin = (Sayajin) personagens[numSayajin - 1];
                        System.out.print("Digite o nível de transformação: ");
                        int nivel = scanner.nextInt();
                        if (sayajin.nome.equals("Gohan") && nivel > 3) {
                            nivel = 3;
                        }
                        System.out.println(sayajin.transformar(nivel));
                    } else {
                        System.out.println("Personagem não é um Sayajin ou inválido.");
                    }
                    break;

                case 4:
                    System.out.print("Digite a quantidade de esferas do dragão que Dendê possui: ");
                    int quantidadeEsferas = scanner.nextInt();
                    scanner.nextLine(); 
                    dende.setQuantidadeEsferas(quantidadeEsferas);

                    System.out.print("Digite o pedido para Dendê: ");
                    String desejo = scanner.nextLine();
                    System.out.println(dende.fazerDesejo(desejo));
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}