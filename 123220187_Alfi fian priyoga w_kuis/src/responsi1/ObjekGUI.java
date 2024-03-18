/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

 class ObjekGUI {
    public static void main(string[] args){
    }
 }
  
    class GUI extends JFrame{
    final JTextField fnama = new JTextField(10);
    JLabel 1jeniskendaraan = new JLabel("jens kendaraan");
    
    JRadioButton rbmotor = new JRadioButton("motor");
    JRadioButton rbmobil = new JRadioButton("mobil");
    
    JLabel 1detailpenyewaan = new JLabel("detail penyewaan");
    
    JRadioButton rbnama = new JRadioButton("nama");
    JRadioButton rbnomortlf = new JRadioButton("nomor telfon");
    
    JLabel 1jeniskendaraan = new JLabel("jenis kendaraan");
    string[] jeniskendaraan = {"motor supra","mobil avanza","sepeda kayuh"};
    JComboBox cmbjeniskendaraan = new JComboBox(jenis kendaraan);
    
    JLabel 1lamasewa = new JLabel("lama sewa");
    JRadioButton rblamasewa = new JRadioButton("lama sewa");
    }



