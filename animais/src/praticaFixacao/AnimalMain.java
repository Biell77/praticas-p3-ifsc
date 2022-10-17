package praticaFixacao;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {

		ArrayList<Gato> gatinhos = new ArrayList<>();

		Gato Gato1 = new Gato();
		Gato1.setNome("Gato 1");
		Gato1.setNumeroDePatas(4);
		Gato1.setRaça("Persa");
		Gato1.setEcossistema("Quarto");
		Gato1.setCor("Rajado Cinza");
		Gato1.setComprimento(20.0f);

		gatinhos.add(Gato1);

		Gato Gato2 = new Gato();
		Gato2.setNome("Gato 2");
		Gato2.setNumeroDePatas(4);
		Gato2.setRaça("Siamês");
		Gato2.setEcossistema("Lavanderia");
		Gato2.setCor("Rajado Branco");
		Gato2.setComprimento(30.0f);

		gatinhos.add(Gato2);

		Gato Gato3 = new Gato();
		Gato3.setNome("Gato 3");
		Gato3.setNumeroDePatas(4);
		Gato3.setRaça("Ragdoll");
		Gato3.setEcossistema("Sala");
		Gato3.setCor("Rajado Laranja");
		Gato3.setComprimento(10.0f);

		gatinhos.add(Gato3);
		
		ArrayList<Cachorro> cachorrinhos = new ArrayList<>();

		Cachorro Dog1 = new Cachorro();
		Dog1.setNome("Cachorro 1");
		Dog1.setNumeroDePatas(4);
		Dog1.setRaça("Golden");
		Dog1.setEcossistema("Quarto");
		Dog1.setCor("Creme");
		Dog1.setComprimento(40.0f);
		
		cachorrinhos.add(Dog1);
		
		Cachorro Dog2 = new Cachorro();
		Dog2.setNome("Cachorro 2");
		Dog2.setNumeroDePatas(4);
		Dog2.setRaça("pincher");
		Dog2.setEcossistema("Cozinha");
		Dog2.setCor("Caramelo");
		Dog2.setComprimento(10.0f);
		
		cachorrinhos.add(Dog2);
		
		Cachorro Dog3 = new Cachorro();
		Dog3.setNome("Cachorro 3");
		Dog3.setNumeroDePatas(4);
		Dog3.setRaça("Husky ");
		Dog3.setEcossistema("Sofá");
		Dog3.setCor("Preto Com Branco");
		Dog3.setComprimento(30.0f);
		
		cachorrinhos.add(Dog3);
		
		for (Cachorro cachorro : cachorrinhos) {
			System.out.println(cachorro.getNome());
			System.out.println(cachorro.getNumeroDePatas());
			System.out.println(cachorro.getRaça());
			System.out.println(cachorro.getEcossistema());
			System.out.println(cachorro.getCor());
			System.out.println(cachorro.getComprimento());
			cachorro.late();
		}
		
		for (Gato Gato : gatinhos) {
			System.out.println(Gato.getNome());
			System.out.println(Gato.getNumeroDePatas());
			System.out.println(Gato.getRaça());
			System.out.println(Gato.getEcossistema());
			System.out.println(Gato.getCor());
			System.out.println(Gato.getComprimento());
			Gato.mia();
		}

	}

}
