package org.bodybuilder.porra;

/**
 * @author Rafael Fantini da Costa
 */
public class Body {
    private final int age;
    private final Trapezio trapezio;
    private final Double foodEaten;
    private final OnExitJaulaListener onExitJaulaListener;

    public Body(int age, Trapezio trapezio, Double foodEaten, OnExitJaulaListener onExitJaulaListener) {
        this.age = age;
        this.trapezio = trapezio;
        this.foodEaten = foodEaten;
        this.onExitJaulaListener = onExitJaulaListener;
    }

    public int getAge() {
        return age;
    }

    public Trapezio getTrapezio() {
        return trapezio;
    }

    public Double getFoodEaten() {
        return foodEaten;
    }

    public OnExitJaulaListener getOnExitJaulaListener() {
        return onExitJaulaListener;
    }

    public interface OnExitJaulaListener {
        void onExitJaula();
    }
}
