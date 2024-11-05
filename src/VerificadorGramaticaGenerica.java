import java.util.Map;

public class VerificadorGramaticaGenerica {
    public static boolean verificaCadeia(Map<Character, String[]> gramatica, String cadeia) {
        return verificaCadeiaHelper(gramatica, 'S', cadeia, 0) == cadeia.length();
    }

    private static int verificaCadeiaHelper(Map<Character, String[]> gramatica, char simbolo, String cadeia, int posicao) {
        if (posicao >= cadeia.length()) {
            return -1;
        }
        for (String producao : gramatica.get(simbolo)) {
            int novaPosicao = posicao;
            for (char s : producao.toCharArray()) {
                if (s == 'ε') {
                    return novaPosicao;
                }
                if (Character.isLowerCase(s)) {
                    if (novaPosicao < cadeia.length() && cadeia.charAt(novaPosicao) == s) {
                        novaPosicao++;
                    } else {
                        novaPosicao = -1;
                        break;
                    }
                } else {
                    novaPosicao = verificaCadeiaHelper(gramatica, s, cadeia, novaPosicao);
                    if (novaPosicao == -1) break;
                }
            }
            if (novaPosicao != -1) return novaPosicao;
        }
        return -1;
    }

    public static void main(String[] args) {
        Map<Character, String[]> gramatica = Map.of(
                'S', new String[]{"aA", "bB"},
                'A', new String[]{"aA", "ε"},
                'B', new String[]{"bB", "ε"}
        );
        System.out.println(verificaCadeia(gramatica, "aaa"));
        System.out.println(verificaCadeia(gramatica, "bb"));
        System.out.println(verificaCadeia(gramatica, "ab"));
    }
}
