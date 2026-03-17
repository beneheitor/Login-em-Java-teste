import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        byte escolha;
        double cpf = 0;
        double cpfLogin;
        int senha = 0;
        int senhaLogin;
        int numero;


        System.out.println("--------APLICATIVO DO BANCO EM JAVA-------- ");
        System.out.println("Informe seu nome para continuarmos: ");
        String nome = scanner.nextLine();

        cpfLogin = cpf;
        senhaLogin = senha;

        System.out.println("Olá, " + nome + "!");
          
        do {
        System.out.println("--------INFORME O QUE DESEJA FAZER--------------");
        System.out.println("(1) - QUERO VERIFICAR O SALDO");
        System.out.println("(2) - QUERO ME CADASTRAR");
        System.out.println("(3) - QUERO FAZER LOGIN");
        System.out.println("(4) - SAIR");
        escolha = scanner.nextByte(); 

        
        

        switch (escolha) {
            case 1:
                System.out.println ("Seu saldo é: " + (numero = random.nextInt(10000)));
                
                break;
        
            case 2:

            System.out.println("Cadastre seu CPF: ");
            cpf = scanner.nextDouble();

            System.out.println("Cadastre sua senha: ");
            senha = scanner.nextInt();

            System.out.println("Cadastrado com sucesso!!!");

                break;

            case 3:
                System.out.println("Digite seu CPF: ");
                cpfLogin = scanner.nextDouble();
                System.out.println("Digite sua senha: ");
                senhaLogin = scanner.nextInt();

                if (cpfLogin != cpf || senhaLogin != senha) {

                    System.out.println("CPF inválido ou senha inválida.");

                    return;
                     
                } else{

                  System.out.println("Bem vindo," + nome + "!");

                  return;
                }

            case 4:
                break;

                

        
            }
        
        } while (escolha != 4);
        scanner.close();
        
        
}

}
