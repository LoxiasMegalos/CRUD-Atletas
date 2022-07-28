import java.util.ArrayList;

public class Teste{
    public static void main(String[] args) {
        System.out.println("Hello World");

        Atleta x = new PilotoDeFormula1("Murillo", 22, 12000000, 0.2);
        Atleta y = new CyberAtleta("Raissa", 22, 5, "Diamante");

        AtletaCRUD crud = new AtletaCRUD();

        crud.adicionar(x);
        crud.adicionar(y);

        ArrayList<Atleta> z = crud.getAtletas();

        for(int i = 0; i < z.size(); i++){
            System.out.println(z.get(i).getNome());
        }

        ArrayList<CyberAtleta> c = crud.getCyber();
        ArrayList<PilotoDeFormula1> p = crud.getPilotos();

        for(int i = 0; i < c.size(); i++){
            System.out.println(c.get(i).getNome());
        }

        for(int i = 0; i < p.size(); i++){
            System.out.println(p.get(i).getNome());
        }

        crud.atualiza("Murillo", "Murillao", 25, 99999999, 0.21);
        crud.atualiza("Raissa", "Raissinha", 23, 5, "Mestre");

        z = crud.getAtletas();

        for(int i = 0; i < z.size(); i++){
            System.out.println(z.get(i).getNome());
            System.out.println(z.get(i).getIdade());
        }

        crud.remove("Sla");
        z = crud.getAtletas();

        for(int i = 0; i < z.size(); i++){
            System.out.println(z.get(i).getNome());
            System.out.println(z.get(i).getIdade());
        }

        System.out.println(z.size());

        crud.remove("Raissinha");
        z = crud.getAtletas();


        for(int i = 0; i < z.size(); i++){
            System.out.println(z.get(i).getNome());
            System.out.println(z.get(i).getIdade());
        }

        c = crud.getCyber();
        for(int i = 0; i < c.size(); i++){
            System.out.println(c.get(i).getNome());
        }
    }

}