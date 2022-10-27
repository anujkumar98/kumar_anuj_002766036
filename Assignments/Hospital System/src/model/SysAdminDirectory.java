/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author anujkumar
 */
public class SysAdminDirectory extends PersonDirectory {

    List<Person> sysadminDirectory = new ArrayList<>();

    public SysAdminDirectory() {
        super();

    }

    public List<Person> getSysadminDirectory() {
        return sysadminDirectory;
    }

    public void setSysadminDirectory(List<Person> sysadminDirectory) {
        this.sysadminDirectory = sysadminDirectory;
    }

    public Person addsysAd(String name) {
        Person person  = new Person();
        this.sysadminDirectory.add(person);
        this.addPerson(person);
        return person;
    }

    public void removeSysAd(String username) {
        for (int i = 0; i < this.sysadminDirectory.size(); i++) {
            Person person = this.sysadminDirectory.get(i);
            if (person.getUserName().equals(username)) {
                this.sysadminDirectory.remove(i);
                this.removePerson(username);
                break;
            }
        }
    }

}
