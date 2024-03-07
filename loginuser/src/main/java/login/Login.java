package login;
import javax.swing.*;

public class Login {
    public static void main(String[] args) {
        boolean logado = false;
        String usuarioCadastrado = null;
        String senhaCadastrado = null;

        while (!logado){
            String opcao = JOptionPane.showInputDialog(null,"Selecione uma opcao:\n1 - Cadastrar\n2 - Logar\n3 - Sair", "Menu - SafeLearn ", JOptionPane.QUESTION_MESSAGE);

            if (opcao== null || opcao.equals("3")){
                JOptionPane.showMessageDialog(null, "Saindo...");
                break;
            }

            switch (opcao){
                case "1":
                    usuarioCadastrado = JOptionPane.showInputDialog(null, "Digite o nome do usúario:");
                    senhaCadastrado = JOptionPane.showInputDialog(null, "Digite a senha");
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!!");
                case "2":
                    String usuario = JOptionPane.showInputDialog(null, "Digite o nome do usuário:");
                    String senha = JOptionPane.showInputDialog(null, "Digite a senha: ");

                    if (usuario != null && senha!=null &&
                            usuario.equals(usuarioCadastrado) && senha.equals(senhaCadastrado)
                    ){
                        JOptionPane.showMessageDialog(null, "Login realizado!");
                        logado = true;
                    }else {
                        JOptionPane.showMessageDialog(null, "Usuário ou senha incorreto.\n Tente novamente");
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcão invalida.\n Tente novamente.");
                    break;
            }
        }
    }
}

