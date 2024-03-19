public class Main {
        public static void main(String[] args) {
            ListaCarros<Carro> listaCarros = new ListaCarros<>();

            listaCarros.adicionarCarro(new Honda());
            listaCarros.adicionarCarro(new Toyota());

            listaCarros.mostrarCarros();
        }
}
