/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.decoratorpattern.decorator.concreteweapons;

import co.com.decoratorpattern.decorator.warrior.base.AbstractWarrior;
import co.com.decoratorpattern.decorator.weapons.base.AbstractWeapons;

/**
 * Atributos de un arma de Madera
 * 
 * @author JuanC
 */
public class Wood extends AbstractWeapons {
	
	public Wood(AbstractWarrior guerrero) {
		this.warrior = guerrero;
	}
	
	@Override
	public int getDamage() {
		return this.warrior.getDamage() + 5;
	}
	
	@Override
	public String getWeapons() {
		return this.warrior.getWeapons() + " de Madera";
	}
}
