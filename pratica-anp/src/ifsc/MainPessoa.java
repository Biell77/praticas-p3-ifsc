package ifsc;

public class MainPessoa {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		aluno.setNome("Gabriel");
		aluno.setCpf("777.222.333-11");
		aluno.setMatricula(472895213);

		Professor professor = new Professor();

		professor.setNome("Ronaldo");
		professor.setCpf("456.789.234-10");
		professor.setSiape(67142379);

		System.out.println("O Nome do Aluno é: " + aluno.getNome());
		System.out.println("O CPF do Aluno é: " + aluno.getCpf());
		System.out.println("A Matrícula do Aluno é: " + aluno.getMatricula());

		System.out.println("O nome do Professor é: " + professor.getNome());
		System.out.println("O Cpf do Professor é: " + professor.getCpf());
		System.out.println("O siape do Professor é: " + professor.getSiape());

	}

}
