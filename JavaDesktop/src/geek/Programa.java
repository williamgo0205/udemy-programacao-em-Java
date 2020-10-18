package geek;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

// Simulação de tela de login de sistema validando user e password
public class Programa {

	public static void main(String[] args) {
		final String USER = "geek";
		final String PASSWORD = "university";
		
		// Criando a Janela do sistema
		JFrame frame = new JFrame("Geek University :: Acesso ao Sistema");	
		// Fechando a aplicação ao clicar em sair "x"
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Agrupa os componentes do sistema
		JPanel panel = new JPanel(); 
        // Definindo o layout (Gerenciador de layout)
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		// Criando o label "Usuário" na tela e um textfield para o usuário com tamenho de 20
		JLabel lblUsuario = new JLabel("Usuário: ");
        JTextField txtUsuario = new JTextField(20);     
        txtUsuario.setToolTipText("Informe seu usuário de acesso...");
        
		// Criando o label "senha" na tela e um textfield para a senha com tamenho de 20
		JLabel lblSenha = new JLabel("Senha: ");
        JPasswordField txtSenha = new JPasswordField(20);        
        txtSenha.setToolTipText("Informe sua senha de acesso...");
        
        // Criando botão para login
        JButton btnLogin = new JButton("Login");
        
        // Chamada do método criado para o botão login
        btnLoginOnClick(USER, PASSWORD, frame, txtUsuario, txtSenha, btnLogin);
        
        // Adicionando os elementos ao panel
        panel.add(lblUsuario);
        panel.add(txtUsuario);
        
        panel.add(lblSenha);
        panel.add(txtSenha);
        
        panel.add(btnLogin);
        
        // Adicionando o panel ao Frame
        frame.setContentPane(panel);
        
        // Empacotando o frame
        frame.pack();
        
        // Colocando o frame como visivel
        frame.setVisible(true); 
	}

	private static void btnLoginOnClick(final String USER, final String PASSWORD, JFrame frame, JTextField txtUsuario,
			JPasswordField txtSenha, JButton btnLogin) {
		btnLogin.addActionListener(new ActionListener() {
			
	        // Adicionando ação ao botão login ao qual valida User e Password e caso sejam válidos
	        // apresenta a mensagem "Acesso autorizado", senão apresenta a mensagem "Acesso não autorizado".
			@Override
			public void actionPerformed(ActionEvent e) {
				// Valida o usuário e senha com as constantes do sistema
				if(txtUsuario.getText().equals(USER) && new String(txtSenha.getPassword()).equals(PASSWORD)) {
					// Cria uma mensagem informando "acesso autorizado" ao usuário
					JOptionPane.showMessageDialog(frame, "Acesso autorizado");
				}else {
					// Cria uma mensagem informando "acesso não autorizado" ao usuário
					JOptionPane.showMessageDialog(frame, "Acesso não autorizado");
				}
					
			}
		});
	}

}
