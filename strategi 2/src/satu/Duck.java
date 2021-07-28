package satu;

import dua.IFlyBehaviour;
import tiga.IQuackBehaviour;
import empat.ISwimBehaviour;

public abstract class Duck {
    private IFlyBehaviour flyBehaviour;
    private IQuackBehaviour quackBehaviour;
    private ISwimBehaviour swimBehaviour;

    public Duck() { }

    public void setFlyBehaviour(IFlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(IQuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setSwimBehaviour(ISwimBehaviour swimBehaviour) {
        this.swimBehaviour = swimBehaviour;
    }
    public void performQuack() {
        this.quackBehaviour.quack();
    }

    public void performFly() {
        this.flyBehaviour.fly();
    }

    public void performSwim() {
        this.swimBehaviour.swim();
    }

    public abstract void display();
}