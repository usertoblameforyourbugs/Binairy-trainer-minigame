/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binairy.trainer;

import javax.swing.DefaultListModel;

/**
 *
 * @author Tycho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    private static DefaultListModel listModel;
    public static void main(String[] args) {
        listModel = new DefaultListModel();
        Yayframe frame = new Yayframe();
        frame.setVisible(true);
    }
    
    public static void addLogEntry(String NewEntry){
        listModel.addElement(NewEntry);
    }
    
    public static DefaultListModel getLog(){
        return listModel;
    }
    
}
