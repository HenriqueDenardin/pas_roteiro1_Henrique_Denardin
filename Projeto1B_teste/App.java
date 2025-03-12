package Projeto1B_teste;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("nome do professor?");
        String nome = in.next();
        System.out.println("Quantos anos de experiencia ele tem?");
        int experiencia = in.nextInt();
        Professor p = new Professor(nome, experiencia);
        System.out.println(p.toString());
        System.out.println("Categoria: " + p.classifica());
        //mudança
        //teste de pull
        //teste 2
        in.close();
    }
    
}
