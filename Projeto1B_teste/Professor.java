package Projeto1B_teste;
//bug resolvido
public class Professor {
    private String nome;
    private int anosExperiencia;

    public Professor(String nome, int anosExperiencia){
        this.nome = nome;
        this.anosExperiencia = anosExperiencia;
    }
    public String getNome(){
        return nome;
    }
    public int getAnosExperiencia(){
        return anosExperiencia;
    }

    public String classifica(){
        return switch(anosExperiencia){
            case 0,1,2,3,4,5 -> "Assistente";
            case 6,7,8,9,10 -> "Adjunto";
            default -> "Titular";
        };
    }
    @Override
    public String toString(){
        return "Professor: " + nome + ", anos de experiencia: " + anosExperiencia;
    }
    //comentario
    //comentario branch
    //alteracao branch
    //correcao
    //pos branch

}
