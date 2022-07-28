public class PilotoDeFormula1 extends Atleta{
    
    private double dinheiroNaConta;
	private double reflexo;

	public PilotoDeFormula1(String nome, int idade, double dinheiroNaConta, double relfexo) {
		super(nome, idade);
		this.dinheiroNaConta = dinheiroNaConta;
		this.reflexo = reflexo;
	}
	
	public double getDinheiroNaConta() {
		return this.dinheiroNaConta;
	}
	
	public double getReflexo() {
		return this.reflexo;
	}

	public void setDinheiroNaConta(double dinheiroNaConta) {
		this.dinheiroNaConta = dinheiroNaConta;
	}

	public void setReflexo(double reflexo) {
		this.reflexo = reflexo;
	}
}
