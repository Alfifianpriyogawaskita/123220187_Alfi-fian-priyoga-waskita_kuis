/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi1;

import javax.swing.JFrame;

class kendaraan extends JFrame{

 public kendaraan (string penyewaan){
     setTitle(penyewaan);
     setSize(300,200);
     setDefaultCloseOperation(3);
     setVisible(true);
 }
}
public class panggilkendaraan{
public static void main (string [] args){
kendaraan f;
    f = new kendaraan ("ini kendaraan");
}
}
