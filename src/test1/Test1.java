/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import javax.swing.JOptionPane;

/**
 *
 * @author Kasper
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, test1(Integer.parseInt(JOptionPane.showInputDialog("Enter first (x) value")), Integer.parseInt(JOptionPane.showInputDialog("Enter second (y) value")), Integer.parseInt(JOptionPane.showInputDialog("Enter third (z) value"))));
    }
    
    public static String test1(int x, int y, int z){
        String result;

        if(x == y && y == z){
            result = "equilateral";
        }
        else if(x == y || x == z || y == z){
            result = "isosceles";
        }
        else{
            result = "scalene";
        }   
        return result;
    }
    
}
