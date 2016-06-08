package org.bodybuilder.porra;

/**
 * @author Rafael Fantini da Costa
 */
public class BodyBuilder {
    private int age;
    private Trapezio trapezio;
    private Double foodEaten;
    private Body.OnExitJaulaListener onExitJaulaListener;
    private Hora hora;
    private String helpQuote;

    public BodyBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public BodyBuilder setTrapezio(Trapezio trapezio) {
        this.trapezio = trapezio;
        return this;
    }

    public BodyBuilder setFoodEaten(Double foodEaten) {
        this.foodEaten = foodEaten;
        return this;
    }

    public BodyBuilder setOnExitJaulaListener(Body.OnExitJaulaListener onExitJaulaListener) {
        this.onExitJaulaListener = onExitJaulaListener;
        return this;
    }

    public Body buildPORRA() {
        return new Body(age, trapezio, foodEaten, onExitJaulaListener);
    }

    public BodyBuilder setHora(Hora hora) {
        this.hora = hora;
        return this;
    }

    public BodyBuilder setHelpQuote(String helpQuote) {
        this.helpQuote = helpQuote;
        return this;
    }
}