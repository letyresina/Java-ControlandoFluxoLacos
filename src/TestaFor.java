
public class TestaFor {
	public static void main(String[] args) {
		//o for tem uma estrutura um pouco diferente 
		//Diferente do while, não precisa declarar o contador fora dele
		//primeira parte, declara um contador
		//segunda parte é a condição para saber se entra dentro do for
		//terceira parte é o que deve ser executado ao final do escopo
		
		for(int i = 0; i <= 10 ; i++) {
			System.out.println(i);
		}
		
		//depois de executar a primeira parte do contador, ele não fica recriando a variavel novamente
	}
}
