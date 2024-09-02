
public class Main
{
	public static void main(String[] args) {
		
		for (int pessoas =0; pessoas <= 20; pessoas++){
		    System.out.println("Contando pessoas: " + pessoas);
		}
		
		System.out.println();
		
		// Usando o for em Array
		String [] alunos = {"ARTHUR", "FERNANDO", "JOAO","JUBILEU"};
		for (int i=0; i < alunos.length ; i++){
		    System.out.println("Alunos: " + alunos[i]);
		}
		System.out.println();
		// USANDO while
		
		int x=10;
		int cont = 0;
		int resultado;
		while (cont<= 10 ){
		    resultado = cont *x;
		    System.out.println(cont + " x " + x + " = " + resultado );
		    cont ++;
		}
		
		//USANDO DO - WHILE
		    System.out.println();
			
		int i=5;
		int cont2 = 0;
		int resultado2;
		
		do {
		    resultado2 = cont2 *i;
		    System.out.println(cont2 + " x " + i + " = " + resultado2 );
		    cont2 ++;
		} while (cont2<= 10 );
			    

		
	}
}
