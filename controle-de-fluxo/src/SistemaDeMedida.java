public class SistemaDeMedida {
    public static void main(String[] args) {
        
        String sigla = "M";

       if (sigla == "P")
       System.out.println("PEQUENO");
       else if (sigla == "M")
       System.out.println("MEDIO");
       else if(sigla == "G")
       System.out.println("GRANDE");
       else 
       System.out.println("INDEFINIDO");

       //Usando o "switch case"
       System.out.println();

       String sigla2= "M";
       switch (sigla2) {
        case "P":{
            System.out.println("PEQUENO");
            break;
       }
       case "M":{
       System.out.println("MEDIO");
       break;
       }
       case "G":{
        System.out.println("GRANDE");
        break;
       }
        default:
            System.out.println("INDEFINIDO");
       }


    }
}
