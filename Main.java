public class Main {
    public static void main(String[] args) {
      
        Cachorro meuCachorro = new Cachorro("Rex", 25.5, "Labrador");
        Gato meuGato = new Gato("Luna", 4.2, "Branca");

        System.out.println("--- Informações do Cachorro ---");
        meuCachorro.mostrarAnimal();

        System.out.println("\n--- Informações do Gato ---");
        meuGato.mostrarAnimal();
    }
}
