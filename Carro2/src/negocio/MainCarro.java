package negocio;

public class MainCarro {
    static void main() { //"psvm" y tab para crear el main automaticamente

        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.setVelocidad(100);
        c1.setPotencia(5);
        c2.setVelocidad(5);
        c2.setPotencia(5);

        System.out.println("La pontencia del carro 1  es "+c1.getPotencia()+" y la velocidad es "+c1.getVelocidad());
        System.out.println("La pontencia del carro 2  es "+c2.getPotencia()+" y la velocidad es "+c2.getVelocidad());
        c1.acelerar();
        c1.acelerar();
        c1.frenar();

    }
}
