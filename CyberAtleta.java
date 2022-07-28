public class CyberAtleta extends Atleta{

    private int anosDeExperiencia;
	private String rank;
	
	public CyberAtleta (String nome, int idade, int anosDeExperiencia, String rank) {
		super(nome, idade);
		this.anosDeExperiencia = anosDeExperiencia;
		this.rank = rank;
	}
	
	public int getAnosDeExperiencia() {
		return anosDeExperiencia;
	}
	
	public String getRank() {
		return rank;
	}
	
	public void setRank(String rankAtual) {
		this.rank = rankAtual;
	}
	
	public void setAnosDeExperiencia(int anosDeExperiencia) {
		this.anosDeExperiencia = anosDeExperiencia;
	}
}
