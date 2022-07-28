import java.util.ArrayList;

public class AtletaCRUD {
    
    private ArrayList<Atleta> atletas;
    private ArrayList<PilotoDeFormula1> pilotos;
    private ArrayList<CyberAtleta> cyber;

    public AtletaCRUD(){
        atletas = new ArrayList<Atleta>();
        pilotos = new ArrayList<PilotoDeFormula1>();
        cyber = new ArrayList<CyberAtleta>();
    }

    public void adicionar(Atleta atleta){
        atletas.add(atleta);
        if(atleta instanceof PilotoDeFormula1){
            pilotos.add((PilotoDeFormula1) atleta);
            return;
        }
        cyber.add((CyberAtleta) atleta);
    }

    public void remove(String nome){

        for(int i = 0; i < atletas.size(); i++){
            if(atletas.get(i).getNome() == nome){
                if(atletas.get(i) instanceof CyberAtleta){
                    remoteCyber(nome);
                }
                else{
                    remotePiloto(nome);
                }
                atletas.remove(i);
                break;
            }
        }
        
    }

    private void remotePiloto(String nome){
        for(int i = 0; i < pilotos.size(); i++){
            if(pilotos.get(i).getNome() == nome){
                pilotos.remove(i);
            }
        }
    }

    private void remoteCyber(String nome){
        for(int i = 0; i < cyber.size(); i++){
            if(cyber.get(i).getNome() == nome){
                cyber.remove(i);
            }
        }
    }
   

    public ArrayList<Atleta> getAtletas() {
        return atletas;
    }

    public ArrayList<PilotoDeFormula1> getPilotos() {
        return pilotos;
    }

    public ArrayList<CyberAtleta> getCyber() {
        return cyber;
    }

    public void atualiza(String nome, String novoNome, int novaIdade, int novosAnosDeExperiencia, String novoRank){
        for(int i = 0; i < cyber.size(); i++){
            if(cyber.get(i).getNome() == nome){
                cyber.get(i).setNome(novoNome);
                cyber.get(i).setIdade(novaIdade);
                cyber.get(i).setAnosDeExperiencia(novosAnosDeExperiencia);
                cyber.get(i).setRank(novoRank);
                break;
            }
        }
    }

    public void atualiza(String nome, String novoNome, int novaIdade, double novoDinheiroNaConta, double novoReflexo){
        for(int i = 0; i<pilotos.size(); i++){
            if(pilotos.get(i).getNome() == nome){
                pilotos.get(i).setNome(novoNome);
                pilotos.get(i).setIdade(novaIdade);
                pilotos.get(i).setDinheiroNaConta(novoDinheiroNaConta);
                pilotos.get(i).setReflexo(novoReflexo);
                break;
            }
        }
    }

}
