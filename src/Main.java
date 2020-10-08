
import java.time.LocalDate;
import java.time.Month;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author orrub
 */
public class Main {
    
    public static void main(String[] args){
        
        
        Person person = new Person("Luis Hernandez", LocalDate.of(1978, Month.MARCH, 20));
        System.out.print(person.getName() + " " + person.getAge());
    }
}
