public class Questao3 {
    public static void main(String[] args) {
        int indice = 12;
        int soma = 0;
        int k = 1;

        while(k<indice){
            k++;
            soma += k;
            System.out.println(soma);
        }

        System.out.println("\nO valor da variável soma é " + soma);
    }
}
