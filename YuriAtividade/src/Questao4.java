import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Questao4 {
    public static void main(String[] args) {
        Estado q0 = new Estado("q0");

        Set<Estado> estados = new HashSet<>(Collections.singletonList(q0));
        Set<Estado> estadosFinais = new HashSet<>();
        Estado estadoInicial = q0;
        Set<Character> alfabeto = new HashSet<>(Arrays.asList('0', '1'));

        AutomatoFinitoDeterministico afd = new AutomatoFinitoDeterministico(estados, alfabeto, estadoInicial, estadosFinais);

        afd.definirTransicoes(q0, '0', q0);
        afd.definirTransicoes(q0, '1', q0);

        afd.verificarCadeia("1010");
    }
}

