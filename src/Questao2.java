public class Questao2 {
    public static void main(String[] args) {
        int qtd = 0;
        String string = "PalavrA";
        char[] arrayDeChar = string.toLowerCase().toCharArray();

        for (int i = 0; i < string.length(); i++) {
            String letra = String.valueOf(arrayDeChar[i]);
            if (letra.equals("a")) {
                qtd++;
            }
        }

        if (qtd == 0) {
            System.out.println("A palavra "+string+" não contém a letra 'a'!");
        } else {
            System.out.println("A palavra '"+string+"' contém "+qtd+" letra(s) 'a'!");
        }
    }
}
