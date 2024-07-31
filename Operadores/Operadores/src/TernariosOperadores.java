public class TernariosOperadores {
    public static void main(String[] args) {
        int a, b;

        a = 5;
        b = 6;

        String resultado = "";

        //Exemplo de condicional utilizando IF/ELSE

        if (a==b) {
            resultado = "verdadeiro";
        } else {
            resultado = "falso";
        }

        System.out.println(resultado);

        int c, d;

        c = 7;
        d = 8;

        int resultadO = c==d ? 1 : 2;

        System.out.println(resultadO);

        int e, f;

        e = 1;
        f = 1;

        String result = e==f ?"verdadeiro" : "falso";

        System.out.println(result);
    }
}
