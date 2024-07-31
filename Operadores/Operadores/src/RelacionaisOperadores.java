public class RelacionaisOperadores {
    public static void main(String[] args) {
        
        String nomeUm = "Hosana";
        String nomeDois = "Hosana";

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois)); //PARA NOMES É MELHOR USAR equals
        
        
        
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 == numero2) {
            System.out.println("a condição é verdadeira");
        } else {
            System.out.println("a condição é falsa");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);
    }
}
