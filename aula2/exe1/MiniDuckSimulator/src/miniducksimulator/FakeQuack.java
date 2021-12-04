/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniducksimulator;

/**
 *
 * @author junio
 */
public class FakeQuack implements QuackBehavior{
    public void quack() {
		System.out.println("Qwak");
	}
}
