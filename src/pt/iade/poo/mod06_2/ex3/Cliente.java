package pt.iade.poo.mod06_2.ex3;

public class Cliente {
	public static void main(String[] args) {
		// Criar arquivos individuais
		Arquivo arquivo1 = new Arquivo("Documento1.txt", 1.5);
		Arquivo arquivo2 = new Arquivo("Foto1.jpg", 2.0);
		Arquivo arquivo3 = new Arquivo("Musica1.mp3", 5.0);
		
		// Criar pastas e adicionar arquivos a elas
		Pasta pasta1 = new Pasta("Meus Documentos");
		pasta1.adicionar(arquivo1);
		
		Pasta pasta2 = new Pasta("Minhas Fotos");
		pasta2.adicionar(arquivo2);
		
		Pasta pasta3 = new Pasta("Minhas Musicas");
		pasta3.adicionar(arquivo3);

		// Criar uma pasta principal e adicionar outras pastas a ela
		Pasta pastaPrincipal = new Pasta("Raiz");
		pastaPrincipal.adicionar(pasta1);
		pastaPrincipal.adicionar(pasta2);
		pastaPrincipal.adicionar(pasta3);
		
		// Mostrar detalhes da pasta principal (estrutura completa)
		pastaPrincipal.mostrarDetalhes();
	}
}