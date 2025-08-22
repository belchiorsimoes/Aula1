package Model;

/**
 *
 * @author Belchior
 */
public class Pessoa {
    // declaracao de variaveis - atributos
    String nome; // para textos
    double altura; // para valores decimais
    int idade; //numeros inteiros
    boolean estudante; // valores logicos - true para verdadeiro e false para falso
    String residencia;
    String estadocivil; 
    boolean trabalhador; 
    int numerofilhos; 

    public Pessoa() {
    }

    public Pessoa(String nome, double altura, int idade, boolean estudante) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.estudante = estudante;
    }
    
    public Pessoa(boolean trabalhador, String estadocivil, int numerofilhos, String residencia) {
        this.trabalhador = trabalhador;
        this.estadocivil = estadocivil;
        this.numerofilhos = numerofilhos;
        this.residencia = residencia;
    }
    

    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public void exibirDados(){
        System.out.println(this.nome);
    }
    
    //
    public void exibirDados2(){
        System.out.println(this.nome);
        System.out.println(this.altura);
        System.out.println(this.idade);
        System.out.println(this.estudante);
    }
    
    public void exibirDados3(){
        System.out.println(this.trabalhador);
        System.out.println(this.estadocivil);
        System.out.println(this.numerofilhos);
        System.out.println(this.residencia);
    }
    // void - retorna qualquer coisa
    public void exibirAltura(double altura){
        // execucao
        altura = altura * 2;
        System.out.println("O dobro da altura insirida e : "+ altura);
    }
    
    // retorna um numero inteiro
    public int exibirIdade(){
        return idade;
    }
    
    
    
}
