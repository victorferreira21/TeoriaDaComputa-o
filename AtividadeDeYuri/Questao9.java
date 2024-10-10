import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Questao9{
    public static void main(String[] args) {
        Estado q0 = new Estado("q0");
        Estado q1 = new Estado("q1");
        Estado q2 = new Estado("q2");

        Set<Estado> estados = new HashSet<>(Arrays.asList(q0, q1, q2));
        Set<Estado> estadosFinais = new HashSet<>(Collections.singletonList(q0));
        Estado estadoInicial = q0;
        Set<Character> alfabeto = new HashSet<>(Arrays.asList('0', '1'));

        AutomatoFinitoDeterministico afd = new AutomatoFinitoDeterministico(estados, alfabeto, estadoInicial, estadosFinais);

        afd.definirTransicoes(q0, '0', q0);
        afd.definirTransicoes(q0, '1', q1);
        afd.definirTransicoes(q1, '0', q0);
        afd.definirTransicoes(q1, '1', q2);
        afd.definirTransicoes(q2, '0', q1);
        afd.definirTransicoes(q2, '1', q2);

        afd.verificarCadeia("10010");
    }
}

