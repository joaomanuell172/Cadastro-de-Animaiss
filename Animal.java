public class Animal {
    protected String nome;
    protected double peso;

    public Animal(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public void mostrarAnimal() {
        System.out.println("Nome: " + nome + " | Peso: " + peso + "kg");
    }
}
