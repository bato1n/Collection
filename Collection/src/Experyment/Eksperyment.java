package Experyment;

import java.util.*;

public class Eksperyment {

    public static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList();
        LinkedList<Integer> lista2 = new LinkedList();
        
        long before;
        
        before = System.currentTimeMillis();
        for(int i = 0; i < 50000; i++)
        {
            lista1.add(0,1);
        }
        System.out.println("ArrayList - dodawanie na początek: " + (System.currentTimeMillis()-before));
        
        before = System.currentTimeMillis();
        
        for(int i = 0; i < 50000; i++)
        {
            lista2.addFirst(1);
        }
         System.out.println("LinkedList - dodawanie na początek: " + (System.currentTimeMillis()-before));
         
         ////////////////////////
         
                 before = System.currentTimeMillis();
        for(int i = 0; i < 50000; i++)
        {
            lista1.add(25000,1);
        }
        System.out.println("ArrayList - dodawanie do środka: " + (System.currentTimeMillis()-before));
        
        before = System.currentTimeMillis();
        
        for(int i = 0; i < 50000; i++)
        {
            lista2.add(25000,1);
        }
         System.out.println("LinkedList - dodawanie do środka: " + (System.currentTimeMillis()-before));
         
         ///////////////////////
         
                 before = System.currentTimeMillis();
        for(int i = 0; i < 50000; i++)
        {
            lista1.add(lista1.size()-1,1);
        }
        System.out.println("ArrayList - dodawanie na koniec: " + (System.currentTimeMillis()-before));
        
        before = System.currentTimeMillis();
        
        for(int i = 0; i < 50000; i++)
        {
            lista2.addLast(1);
        }
         System.out.println("LinkedList - dodawanie na koniec: " + (System.currentTimeMillis()-before));
         
         ////////////////////////////////////////////////////////////////////////////////////////
         
                  before = System.currentTimeMillis();
        for(int i = 0; i < 500000; i++)
        {
            lista1.get(0);
        }
        System.out.println("ArrayList - zwracanie wartości z początku: " + (System.currentTimeMillis()-before));
        
        before = System.currentTimeMillis();
        
        for(int i = 0; i < 500000; i++)
        {
            lista2.getFirst();
        }
         System.out.println("LinkedList - zwracanie wartości z początku: " + (System.currentTimeMillis()-before));
         
         ////////////////////////
         
                 before = System.currentTimeMillis();
        for(int i = 0; i < 500000; i++)
        {
            lista1.get(25000);
        }
        System.out.println("ArrayList - zwracanie wartości ze środka: " + (System.currentTimeMillis()-before));
        
        before = System.currentTimeMillis();
        
        for(int i = 0; i < 500000; i++)
        {
            lista2.get(25000);
        }
         System.out.println("LinkedList - zwracanie wartości ze środka: " + (System.currentTimeMillis()-before));
         
         ///////////////////////
         
                 before = System.currentTimeMillis();
        for(int i = 0; i < 500000; i++)
        {
            lista1.get(lista1.size()-1);
        }
        System.out.println("ArrayList - zwracanie wartości z końca: " + (System.currentTimeMillis()-before));
        
        before = System.currentTimeMillis();
        
        for(int i = 0; i < 500000; i++)
        {
            lista2.getLast();
        }
         System.out.println("LinkedList - zwracanie wartości z końca: " + (System.currentTimeMillis()-before));
         
         ////////////////////////////////////////////////////////////////////////////////////////
         
         before = System.currentTimeMillis();
        for(int i = 0; i < 50000; i++)
        {
            lista1.remove(0);
        }
        System.out.println("ArrayList - usuwanie z początku: " + (System.currentTimeMillis()-before));
        
        before = System.currentTimeMillis();
        
        for(int i = 0; i < 50000; i++)
        {
            lista2.removeFirst();
        }
         System.out.println("LinkedList - usuwanie z początku: " + (System.currentTimeMillis()-before));
         
         ////////////////////////
         
                 before = System.currentTimeMillis();
        for(int i = 0; i < 50000; i++)
        {
            lista1.remove(25000);
        }
        System.out.println("ArrayList - usuwanie ze środka: " + (System.currentTimeMillis()-before));
        
        before = System.currentTimeMillis();
        
        for(int i = 0; i < 50000; i++)
        {
            lista2.remove(25000);
        }
         System.out.println("LinkedList - usuwanie ze środka: " + (System.currentTimeMillis()-before));
         
         ///////////////////////
         
                 before = System.currentTimeMillis();
        for(int i = 0; i < 50000; i++)
        {
            lista1.remove(lista1.size()-1);
        }
        System.out.println("ArrayList - usuwanie z końca: " + (System.currentTimeMillis()-before));
        
        before = System.currentTimeMillis();
        
        for(int i = 0; i < 50000; i++)
        {
            lista2.removeLast();
        }
         System.out.println("LinkedList - usuwanie z końca: " + (System.currentTimeMillis()-before));
            
    }
    
}
