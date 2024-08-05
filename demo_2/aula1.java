public class App {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double primeiraNota = dados.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double segundaNota = dados.nextDouble();

        double media = (primeiraNota + segundaNota)/2;

        System.out.println("Media: ")
    }
}