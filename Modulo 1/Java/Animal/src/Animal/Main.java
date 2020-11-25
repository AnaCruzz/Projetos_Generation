package Animal;

public class Main {
	public static void main (String[] args) {
		Preguica preguica = new Preguica("Preguiça", 8, "zZzZzZzZz");
		System.out.println(preguica.getNome() + " " + preguica.getIdade() + " Anos " + preguica.emitirSom());
		
		Cavalo cavalo = new Cavalo("Cavalo",10,"Hiin in in");
		System.out.println(cavalo.getNome() + " " + cavalo.getIdade() + " Anos " + cavalo.emitirSom());
		
		Cachorro doguinho = new Cachorro("Doguinho", 4,"Au Au Au");
		System.out.println(doguinho.getNome() + " " + doguinho.getIdade() + " Anos " + doguinho.emitirSom());
				
		
		}
}

