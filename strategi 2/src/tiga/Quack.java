package tiga;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Quack implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Can make a quack");
    }
}
