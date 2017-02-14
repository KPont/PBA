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
        JOptionPane.showMessageDialog(null, test1());
    }
    public static String test1(){
        String result = "";
        boolean run = true;
        String xs = "";
        String ys = "";
        String zs = "";
        
        while(run){
            xs = JOptionPane.showInputDialog("Enter first (x) value");
            if(xs.matches("^-?\\d+$") && !xs.isEmpty() && Integer.parseInt(xs) > 0){
                run = false;
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid input! Must be a whole number above 0");
            }
        }
        run = true;
        while(run){
            ys = JOptionPane.showInputDialog("Enter second (y) value");
            if(ys.matches("^-?\\d+$") && !ys.isEmpty() && Integer.parseInt(ys) > 0){
                run = false;
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid input! Must be a whole number above 0");
            }
        }
        run = true;
        while(run){
            zs = JOptionPane.showInputDialog("Enter third (z) value");
            if(zs.matches("^-?\\d+$") && !zs.isEmpty() && Integer.parseInt(zs) > 0){
                run = false;
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid input! Must be a whole number above 0");
            }
        }
        
        int x = Integer.parseInt(xs);
        int y = Integer.parseInt(ys);
        int z = Integer.parseInt(zs);

        if (x + y > z && x + z > y && y + z > x){
        if(x == y && y == z){
            result = "equilateral";
        }
        else if(x == y || x == z || y == z){
            result = "isosceles";
        }
        else{
            result = "scalene";
        }   
        }
        else{
            result = "Inputs are not a valid triangle";
        }
        return result;
    }
    
}
