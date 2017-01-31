/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author Kasper
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(test1(6, 5, 4));
    }
    
    public static String test1(int x, int y, int z){
        String result;

        if(x == y && y == z && x == z){
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
