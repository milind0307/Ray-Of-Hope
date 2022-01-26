/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mandardeshmukh
 */
public class PersonDirectory {
    
    List<Person> PersonList;
    private static PersonDirectory Persondirectory;

    public static PersonDirectory getInstance() {
        if (Persondirectory == null) {
            Persondirectory = new PersonDirectory();
        }
        return Persondirectory;
    }
    
        public List<Person> getPersonList() {
        return PersonList;
    }

    public void setPersonList(List<Person> PersonList) {
        this.PersonList = PersonList;
    }

    public PersonDirectory() {
        PersonList = new ArrayList<Person>();
    }

    public Person addPerson() {
        Person p = new Person();
        PersonList.add(p);
        return p;
    }

    public void removePerson(Person ch) {
        PersonList.remove(ch);
    }
    
}
