import javax.swing.JOptionPane;

public class Main {
    static int menu(){
        int opcao;
        do{
            String msg = "Escolha sua opção:\n"
            + "1 - cadastrar\n"
            + "2 - atualizar\n"
            + "3 - apagar uma pessoa\n"
            + "4 - exibir pessoas\n"
            + "0 - sair";
            opcao = Integer.parseInt(JOptionPane.showInputDialog(msg));
        }while (opcao < 0 || opcao >4);

        
        return opcao;

    }
    
    public static void main(String[] args) {
        int op;
        do{
            op = menu();
        
            switch (op) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 0:
                    JOptionPane.showMessageDialog(null,"obrigrado, volte sempre");
            }
        }while ( op != 0);
    }
    
}
