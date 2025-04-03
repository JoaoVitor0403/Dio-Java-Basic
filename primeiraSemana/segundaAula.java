package primeiraSemana;

public class segundaAula {
// Exercicio de variaveis e concatenação.
    public static <str> void main (String [] args ){
        String nome = "Joao Vitor";
        String sobreNome = "de Souza Ferreira";
        String nomeCompleto = nomeCompleto (nome, sobreNome);

        System.out.println (nomeCompleto);

    }
    public static String nomeCompleto(String nome, String sobreNome){
        return "\nNome completo: " + nome + (" ") + (sobreNome);
    }
}
                            //int anoNascimento = 24;
                            //boolean verdadeiro = True;
                            //double numero = 1.90;