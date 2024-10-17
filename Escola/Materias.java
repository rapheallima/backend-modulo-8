package Escola;

public class Materias {

	private String nome;
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;

	public Materias(String nome, double nota1, double nota2, double nota3, double nota4) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}

	public double calcularMedia() {
		return (nota1 + nota2 + nota3 + nota4) / 4;
	}

	public void imprimirResultado() {
		System.out.println("Matéria: " + nome);
		System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4);
		System.out.println("Média: " + calcularMedia());
		System.out.println();
	}

	public static void main(String[] args) {
		
		Materias materia1 = new Materias("Matemática", 9.5, 7.0, 9.0, 6.5);
		Materias materia2 = new Materias("Português", 7.5, 8.0, 6.0, 8.5);
		Materias materia3 = new Materias("História", 9.0, 6.0, 7.0, 8.0);
		Materias materia4 = new Materias("Ciências", 8.5, 9.0, 8.0, 7.5);
		
		materia1.imprimirResultado();
		materia2.imprimirResultado();
		materia3.imprimirResultado();
		materia4.imprimirResultado();
	}
	
}