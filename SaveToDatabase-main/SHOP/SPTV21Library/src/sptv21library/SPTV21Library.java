/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21library;

/**
 *
 * @author user
 */
public class SPTV21Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length > 0 && "base".equals(args[0])){
            App.saveToBase = true;
        }else{
            App.saveToBase = false;
        }
        App app = new App();
        app.run();
    }
    
}
x