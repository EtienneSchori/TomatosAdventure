/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.home.Tomato.Adventure.Service;

import ch.home.Tomato.Adventure.Buisness.Player;

/**
 *
 * @author etienne.schori
 */
public class Service {
    public Integer LancerDes(Player player, int valueMax){
        int value = 0;
        value = 1 + (int)(Math.random()*valueMax);
        System.out.println(value);
        return value;
    }
}
