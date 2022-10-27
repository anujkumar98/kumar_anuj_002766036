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
public class PersonDirectory {

    private List<Person> personDirectory = new ArrayList();

//    public DoctorDirectory doctorDirectory = new DoctorDirectory();
//    public PatientDirectory patientDirectory = new PatientDirectory();
//    public CommunityAdminDirectory communityadminDirectory = new CommunityAdminDirectory();
//    
    public List<Person> getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(List<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }

    public void addPerson(Person person) {

//        Person person = new Person();
        this.personDirectory.add(person);

    }

    public boolean authenticatePerson(String username, String password, Role role) {

        for (Person p : this.personDirectory) {
            if (p.getuserName().equals(username) && p.getPassword().equals(password) && p.getRole().equals(role) && p.getStatus() == true);
            {
                return true;
            }
        }

        return false;
    }

//    public void removeUser(String userName, Role role){
//        switch(role){
//            case DOCTOR -> doctorDirectory.removeDoctor(userName);
//            
//            case PATIENT -> patientDirectory.removePatient(userName);
//                
//            case COMMUNITYADMIN -> communityadminDirectory.removeAdmin(userName);
//            
//        }
//    }
    public void removePerson(String username) {

        for (int i = 0; i < this.personDirectory.size(); i++) {
            Person person = this.personDirectory.get(i);

            if (person.getUserName().equals(username)) {
                person.setStatus(false);
//                removeUser(person.getUserName(), person.getRole());
            }
        }
    }

}
