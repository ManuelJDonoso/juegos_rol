/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos.sub_modelos;

import java.util.ArrayList;

/**
 *
 * @author donpe
 */
class clanes {
   private ArrayList<Clan>clanes=new ArrayList<Clan>();
   
   public void addClan(Clan nuevoClan){
       clanes.add(nuevoClan);
   }
   public Clan getClan(int i){
       return clanes.get(i);
   }
}
