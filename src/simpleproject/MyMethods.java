/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleproject;

/**
 *
 * @author DBA
 */
public class MyMethods {
    
    
    
    public boolean isPrime(int number){
        
        boolean flag = true;
            for (int i = 2; i <= number/2; i++) {
                if (number%i == 0) {
                    
                    flag = false;
                }
            }
        return flag;
    
    }
    
    public boolean isPerfect(int number){
        
        int sum =0;
        for (int i = 1; i <= number/2; i++) {
            if (number%i==0) {
                sum = sum+i;
                
            }
        }
        
        if (number == sum) {
            return true;
            
        } else {
            return false;
        }
        
        
        
    }
    
    public float add(float numberOne, float numberTwo){
        
        return numberOne+numberTwo;
    
    }
    
    
    
}
