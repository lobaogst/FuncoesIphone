package ModelandoIphone;
import java.util.Scanner;

public class exec {
    public static void main(String[] args) {

        MeuTelefone iphone20 = new MeuTelefone() {};
        

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu do iPhone ---");
            System.out.println("[1] Ligar | [2]  ligar Internet | [3] ligar Rede | [4] Tocar | [5] Pausar musica | [6] Selecionar musica | [7] fazer ligacao | [8] Atender ligacao | [9] Correio | [10] Navegador | [11] Nova Aba | [12] Atualizar | [0] Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    iphone20.ligarIphone();
                    
                    break;
                case 2:
                    iphone20.ligarintert();
                    ;
                    break;
                case 3:
                    iphone20.conectarRede();
                    
                    break;
                case 4:
                    iphone20.tocarMusica();
                   
                    break;
                case 5:
                    iphone20.pausarMusica();
                    
                    break;
                case 6:
                    iphone20.selecionaMusica();
                   
                    break;
                case 7:
                    iphone20.fazerLigacao();
                   
                    break;
                case 8:
                    iphone20.chamando(); // 
                    
                    break;
                case 9:
                    iphone20.correidoVoz(); // Assumindo que 'correidoVoz' é ligar para o correio de voz
                    
                    break;
                case 10:
                    iphone20.abrirNavegador();
                    
                    break;
                case 11:
                    iphone20.adicionarNovaaba();
                    
                    break;
                case 12:
                    iphone20.atualizarPagina();
                    
                    break;
                case 0:
                    
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}