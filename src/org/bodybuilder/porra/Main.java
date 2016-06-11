package org.bodybuilder.porra;

/**
 * @author Rafael Fantini da Costa
 */
public class Main {
    public static void main(String[] args) {
        Body monstro;
        do {
            monstro = new BodyBuilder()
                    .setHelpQuote("Ajuda o maluco que tá doente!")
                    .setHora(Hora.DO_SHOW)
                    .setAge(37)
                    .setFoodEaten(Double.POSITIVE_INFINITY)
                    .setTrapezio(Trapezio.DESCENDENTE)
                    .setOnExitJaulaListener(new Body.OnExitJaulaListener() {
                        @Override
                        public void onExitJaula() {
                            System.out.println("Eita porra, tá saindo da jaula o MONSTRO");
                        }
                    })
                    .buildPORRA();
            monstro.bEEEWWWW();
        } while (monstro.getSizeTrapezio() <= 13);

    }
}
