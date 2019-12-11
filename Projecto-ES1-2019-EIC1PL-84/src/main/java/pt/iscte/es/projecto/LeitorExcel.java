package pt.iscte.es.projecto;

import java.util.ArrayList;
import org.apache.poi.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//ALTERACAO DAS DEPENDENCIAS MAVEN

public class LeitorExcel {
	private XSSFWorkbook workbook;
	private XSSFSheet sheet;
	private XSSFRow linha;
	private ArrayList<Metodo> metodosExcell;
	

	public LeitorExcel(String path) {
		this.metodosExcell = new ArrayList<Metodo>();
		try {
		this.workbook = new XSSFWorkbook(path);
		this.sheet = workbook.getSheetAt(0);
		lerExcell();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	//ONDE É LIDO O EXCELL
	private void lerExcell() {
		System.out.println("ler exellll");
		String conteudoLinha = "";
		System.out.println(conteudoLinha);
		for(int i = sheet.getFirstRowNum()+1; i < sheet.getPhysicalNumberOfRows();i++) {
			this.linha = sheet.getRow(i);
			for(int k = linha.getFirstCellNum(); k < linha.getPhysicalNumberOfCells();k++) {
				conteudoLinha+=linha.getCell(k).toString()+"§";
			}
			criarMetodo(conteudoLinha);
			conteudoLinha = "";
			}
		
		}
	
	// PASSAR CONTEUDO LIDO DO EXCELL PARA UM OBJETO "METODO"
		
		public void criarMetodo(String linhaLida) {
			String[] argumentosMetodo = linhaLida.split("§");
		//	System.out.println(argumentosMetodo.length);
			int metodoID = (int)Double.parseDouble(argumentosMetodo[0]);
			String metodoPackage = argumentosMetodo[1];
			String metodoClass = argumentosMetodo[2];
			String metodoName = argumentosMetodo[3];
			int LOC = (int)Double.parseDouble(argumentosMetodo[4]);
			int CYCLO = (int)Double.parseDouble(argumentosMetodo[5]);
			int AFTD = (int)Double.parseDouble(argumentosMetodo[6]);
			double LAA =(Double)Double.parseDouble(argumentosMetodo[7]);
			String long_method =argumentosMetodo[8];
			String iPlasma = argumentosMetodo[9];
			String PMD = argumentosMetodo[10];
			String feature_envy = argumentosMetodo[11];
			
			//CRIAR NOVO METODO E GUARDAR NA ARRAYLIST DE METODOS
			Metodo novoMetodo = new Metodo(metodoID,metodoPackage,metodoClass,metodoName,LOC,CYCLO,AFTD,LAA,long_method,iPlasma,PMD,feature_envy);
			metodosExcell.add(novoMetodo);
			
	}

		
		public ArrayList<Metodo> getMetodos(){
			return metodosExcell;
		}
}
