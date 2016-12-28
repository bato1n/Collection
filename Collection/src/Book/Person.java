package Book;

import java.util.*;

public class Person implements Comparable<Person> {
     
    private String name;
    private String surname;
    private int nr;
    private String city;
    private String street;
    
        public Person(String name, String surname, int nr, String city, String street) {
        this.name = name;
        this.surname = surname;
        this.nr = nr;
        this.city = city;
        this.street = street;
    }
    @Override
        public String toString() {
        return surname + " " + name + " " + nr + " " + city + " " + street;
    }
        
        public int compareTo(Person o) {
        int porownaneNazwiska = surname.compareTo(o.surname);
 
        if(porownaneNazwiska == 0) {
            return name.compareTo(o.name);
        }
        else {
            return porownaneNazwiska;
        }
        }
}