public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 7;

        if (nota >=7)
            System.out.println("Aprovado");
        else if (nota >=5 && nota < 7)
        System.out.println("Prova de recuperação");
    else
        System.out.println("Reprovado");
           
        

        System.out.println();
      // condição ternária

       int nota2 = 3;
       
       String resultado = nota2 >=7 ? "Aprovado" : nota2>=5 &&  nota2 <7 ? "Recuperação" : "Reprovado"; 

       System.out.println(resultado);
      
      

    }
}
