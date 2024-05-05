package colecoes;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class Exercicioss {

	public static void main(String[] args) {
		
		        Set<Integer> numeros = new HashSet<>();

		        
		        Scanner leia = new Scanner(System.in);
		        System.out.println("Digite 10 valores inteiros não repetidos:");
		        for (int i = 0; i < 10; i++) {
		            int valor = leia.nextInt();
		            numeros.add(valor);
		        }

		       
		        System.out.println("Elementos do Set:");
		        Iterator<Integer> iterator = numeros.iterator();
		        while (iterator.hasNext()) {
		            System.out.println(iterator.next());
		        }
		    }
		}