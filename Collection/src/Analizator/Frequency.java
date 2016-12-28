package Analizator;

import java.io.*;
import java.util.*;

public class Frequency {

  public Frequency(javax.swing.JTextArea pt) throws FileNotFoundException, IOException{

        int nextChar;
        char ch;
        String a = pt.getText();
        
        pt.getText();
        
        //int[] count = new int[26];
        
        TreeMap<Character, Integer> count = new TreeMap();
        
        //count.put('c', 4); //count['c']=4;
        //x=count.get('c'); //x=count['c'];
        
        for (int i = 0; i < a.length(); i++){
          ch = a.charAt(i);
          if (count.containsKey(ch)) {
              count.put(ch,count.get(ch)+1);
          } else {
              count.put(ch,1);
          }
        }
        
        String wynik = "";
        int wystapienia = 0;
        for (Map.Entry<Character,Integer> entry : count.entrySet()) {
            if (wystapienia % 6 == 0) wynik += "\n";
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (key != '\n' && key != ' ' && key != '\t') {
                wynik = wynik + key + " = " + value + ", ";
            }
            wystapienia ++;
        }
        if (wynik.length() >= 2) wynik = wynik.substring(0, wynik.length()-2);
        
        javax.swing.JOptionPane.showMessageDialog(null, wynik);
        
}
}
    class MyCustomFilter extends javax.swing.filechooser.FileFilter {
        @Override
        public boolean accept(File file) {
            // Allow only directories, or files with ".txt" extension
            return file.isDirectory() || file.getAbsolutePath().endsWith(".txt");
        }
        @Override
        public String getDescription() {
            // This description will be displayed in the dialog,
            // hard-coded = ugly, should be done via I18N
            return "Text documents (*.txt)";
        }
    } 