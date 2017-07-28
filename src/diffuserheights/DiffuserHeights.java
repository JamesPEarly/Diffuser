/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diffuserheights;

/**
 *
 * @author jearly
 */
public class DiffuserHeights {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prime modulus
        int pm = 11;
        int qr;
        int height;
        
        // Iterate over each of the three edge sets
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    // quadratic residue determines height of prism
                    qr = ((i*i) + (j*j) + (k*k)) % pm;
                    height = pm - qr;
                    System.out.println("i:" + i + " j:" + j + " k:" + k + " qr:" + qr + " height:" + height);
                }
            }
            
        }
        
    }
    
}
