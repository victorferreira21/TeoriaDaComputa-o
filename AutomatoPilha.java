import java.util.Stack;

public class AutomatoPilha {
    public static boolean aceita(String palavra) {
        Stack<Character> pilha = new Stack<>();

        for (char c : palavra.toCharArray()) {
            if (c == '0') {

                pilha.push('0');
            } else if (c == '1') {

                if (pilha.isEmpty() || pilha.pop() != '0') {

                    return false;
                }
            } else {

                return false;
            }
        }

        return pilha.isEmpty();
    }

    public static void main(String[] args) {
        String[] palavras = {"", "01", "0011", "000111", "00011", "00110", "0001111"};
        for (String palavra : palavras) {
            System.out.println("Palavra: " + palavra + " -> " + (aceita(palavra) ? "ACEITA" : "REJEITADA"));
        }
    }
}
