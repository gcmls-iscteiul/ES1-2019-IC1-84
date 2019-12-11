 package pt.iscte.es.projecto;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow {
private JFrame frame;
private JButton butaoImportar, butaoThresholds;
	
public MainWindow() {
		this.frame = new JFrame("Comparator Tool");
		buildGUI();
		
	}
	private void buildGUI() {
		frame.setBounds(100, 100,800,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel painelSul = new JPanel();
		frame.add(painelSul,BorderLayout.SOUTH);
		
		this.butaoImportar = new JButton("Importar");
		painelSul.add(butaoImportar);
		
		//ACAO DO BUT�O IMPORTAR
		butaoImportar.addActionListener(new ActionListener() {

			

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser fileChooser = new JFileChooser("."); 	
				fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
					int returnValue = fileChooser.showOpenDialog(null);
					if(returnValue == JFileChooser.APPROVE_OPTION) {
						File ficheiroSelecionado = fileChooser.getSelectedFile();
						LeitorExcel excellReader= new LeitorExcel(ficheiroSelecionado.getAbsolutePath());
						atualizarGUI(excellReader);
					}
			}
			
		});
		
		this.butaoThresholds = new JButton("Thresholds");
		painelSul.add(butaoThresholds);
		
		//ACAO DO BOTAO THRESHOLD
		butaoThresholds.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		}
		
	
	//DEPOIS DE ESCOLHIDO O FICHEIRO , VIZUALIZAR NA GUI
	public void atualizarGUI(LeitorExcel reader) {
	System.out.println(reader.getMetodos().get(0).getMetodoID());
	System.out.println(reader.getMetodos().get(reader.getMetodos().size()-1).getMetodoID());
		

		
	}
	public void open() {
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		MainWindow window = new MainWindow();
		window.open();
	}
}


