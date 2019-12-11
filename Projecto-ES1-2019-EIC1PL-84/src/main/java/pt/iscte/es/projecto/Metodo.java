package pt.iscte.es.projecto;



//PARA CADA LINHA LIDA NO EXCEL CRIAR UMA INSTANCIA DE METODO COM ESTES ATRIBUTOS
public class Metodo {
	private int metodoID;
	private String metodoPackage;
	private String metodoClass;
	private String metodoName;
	private int LOC;
	private int CYCLO;
	private int AFTD;
	private double LAA;
	private String  is_long_method;
	private String iPlasma;
	private String PMD;
	private String is_feature_envy;
	
	
	
	public Metodo(int MetodoID, String metodoPackage, String metodoClass,String metodoNome,int LOC, int CYCLO,int AFTD,double LAA,String is_long_method,String iPlasma, String PMD,String is_feature_Envy) {
		this.metodoID = MetodoID;
		this.metodoPackage = metodoPackage;
		this.metodoName = metodoNome;
		this.LOC = LOC;
		this.CYCLO = CYCLO;
		this.AFTD = AFTD;
		this.LAA = LAA;
		this.is_long_method = is_long_method;
		this.iPlasma  = iPlasma;
		this.PMD = PMD;
		this.is_feature_envy = is_feature_Envy;
		}
	
	//Getter e Setters
	public int getMetodoID() {
		return metodoID;
	}
	
	public String getMetodoPackage() {
		return metodoPackage;
	}
	public String getMetodoClass() {
		return metodoClass;
	}
	
	public String getMetodoNome() {
		return metodoName;
	}
	public int getLOC() {
		return LOC;
	}
	public int getCYCLO() {
		return CYCLO;
	}
	public int getAFTD() {
		return AFTD;
	}
	public double getLAA() {
		return LAA;
	}
	public String is_feature_envy() {
		return is_feature_envy;
	}
	public String  is_long_method() {
		return is_long_method;
	}
	
	public void setMetodoID(int metodoID) {
		this.metodoID = metodoID;
	}

	public void setMetodoPackage(String metodoPackage) {
		this.metodoPackage = metodoPackage;
	}

	public void setMetodoClass(String metodoClass) {
		this.metodoClass = metodoClass;
	}

	public void setMetodoName(String metodoName) {
		this.metodoName = metodoName;
	}

	public void setLOC(int lOC) {
		LOC = lOC;
	}

	public void setCYCLO(int cYCLO) {
		CYCLO = cYCLO;
	}

	public void setAFTD(int aFTD) {
		AFTD = aFTD;
	}

	public void setLAA(int lAA) {
		LAA = lAA;
	}

	public void setIs_long_method(String is_long_method) {
		this.is_long_method = is_long_method;
	}

	public void setiPlasma(String iPlasma) {
		this.iPlasma = iPlasma;
	}

	public void setPMD(String pMD) {
		PMD = pMD;
	}

	public void setIs_feature_envy(String is_feature_envy) {
		this.is_feature_envy = is_feature_envy;
	}

	public String isPMD() {
		return PMD;
	}
	
	public String isIPlasmas() {
		return iPlasma;
	}
	

}

