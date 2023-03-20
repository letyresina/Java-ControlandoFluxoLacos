
public class TestaEncadeado2 {
	public static void main(String[] args) {
		for(int linha = 1; linha < 10; linha++) {
			//duas formas que pode utilizar o break
			for(int coluna = 0; coluna <= linha; coluna++) {
//				if (coluna > linha) {
//					//break = sai do laço que ele está!
//					break;
//				}
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
