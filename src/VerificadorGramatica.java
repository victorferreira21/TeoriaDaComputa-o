public class VerificadorGramatica {
    public static boolean pertenceLinguagem(String cadeia) {
        if (cadeia.isEmpty()) {
            return false;
        }
        return verificaA(cadeia) || verificaB(cadeia);
    }

    private static boolean verificaA(String cadeia) {
        if (cadeia.charAt(0) != 'a') {
            return false;
        }
        for (char c : cadeia.toCharArray()) {
            if (c != 'a') {
                return false;
            }
        }
        return true;
    }

    private static boolean verificaB(String cadeia) {
        if (cadeia.charAt(0) != 'b') {
            return false;
        }
        for (char c : cadeia.toCharArray()) {
            if (c != 'b') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(pertenceLinguagem("aaa"));
        System.out.println(pertenceLinguagem("bbb"));
        System.out.println(pertenceLinguagem("aab"));
    }
}
