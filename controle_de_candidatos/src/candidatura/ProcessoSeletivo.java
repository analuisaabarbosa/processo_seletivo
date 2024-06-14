package candidatura;
import java.util.concurrent.ThreadLocalRandom;;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecionarCandidato();
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato.");
        }else if(salarioBase==salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta.");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos.");
        }
    }

    static void selecionarCandidato(){
        String [] candidatos = {"João", "Marcela", "Joana", "Reginaldo", "Elias", "Josiane", "Glória", "Estefan", "Lucia", "Paula"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5) {
            String canditado = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + canditado + " solicitou o salário no valor de: " + salarioPretendido);
            if (salarioBase > salarioPretendido) {
                System.out.println("O candidato selecionado para a vaga foi: " + canditado);
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void imprimindoSelecionados(){
        String [] candidatos = {"João", "Marcela", "Joana", "Reginaldo", "Elias"};

        System.out.println("Imprimindo a lista de candidatos informando o índice.");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de número " + (indice+1) + " é " + candidatos[indice]);
        }

        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi: " + candidato);
        }
    }
}
