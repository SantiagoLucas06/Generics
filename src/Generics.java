import java.util.ArrayList;
import java.util.List;

abstract class Carro {
    protected String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public abstract void acelerar();
    public abstract void frear();
}

class Honda extends Carro {
    public Honda() {
        super("Honda");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando o Honda...");
    }

    @Override
    public void frear() {
        System.out.println("Freando o Honda...");
    }
}

class Toyota extends Carro {
    public Toyota() {
        super("Toyota");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando o Toyota...");
    }

    @Override
    public void frear() {
        System.out.println("Freando o Toyota...");
    }
}

class ListaCarros<T extends Carro> {
    private List<T> carros;

    public ListaCarros() {
        carros = new ArrayList<>();
    }

    public void adicionarCarro(T carro) {
        carros.add(carro);
    }

    public void mostrarCarros() {
        for (T carro : carros) {
            System.out.println(carro.getMarca());
            carro.acelerar();
            carro.frear();
            System.out.println();
        }
    }
}