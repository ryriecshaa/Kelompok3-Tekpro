package tiga;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class MuteQuack implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Cant't Quack");
    }
}


