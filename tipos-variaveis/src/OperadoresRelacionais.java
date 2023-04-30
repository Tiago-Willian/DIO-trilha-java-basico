public class OperadoresRelacionais {
   
    public static void main(String[] args) {

        String nome1 = "Tiago";
        String nome2 = new String ("Tiago");
    

        System.out.println(nome1.equals(nome2));


        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("a nossa condiçã é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("numeroUm é menor que numeroDois? " + simNao);

    }
}
