import java.util.ArrayList;
import java.util.List;

public class GeradorCadeias {
    public static List<String> gerarCadeias(int n) {
        List<String> cadeias = new ArrayList<>();
        gerarCadeiasHelper("a", n - 1, cadeias);
        gerarCadeiasHelper("b", n - 1, cadeias);
        if (n == 1) {
            cadeias.add("c");
        }
        return cadeias;
    }

    private static void gerarCadeiasHelper(String prefixo, int restante, List<String> cadeias) {
        if (restante == 0) {
            cadeias.add(prefixo);
            return;
        }
        gerarCadeiasHelper(prefixo + "a", restante - 1, cadeias);
        gerarCadeiasHelper(prefixo + "b", restante - 1, cadeias);
    }

    public static void main(String[] args) {
        System.out.println(gerarCadeias(3));
    }
}
