/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;
import java.util.*;
/**
 *
 * @author anujkumar
 */

public class PersonRegistry {
    ArrayList <Person> personRecord;
    public PersonRegistry() {
        this.personRecord=new ArrayList <> ();
        
    }

    public ArrayList<Person> getPersonRecord() {
        return personRecord;
    }

    public void setPersonRecord(ArrayList<Person> personRecord) {
        this.personRecord = personRecord;
    }
    
    public void addNewPerson(Person person){
        personRecord.add(person);
    }
    public void deletePerson(int index){
        personRecord.remove(index);
    }
    public Person fetchPerson(int index){
        return personRecord.get(index);
    }

    public void updatePerson(String uniqueID,Person personUpdatedDetails) {
        //Function to update the person 
        for (Person p:personRecord){
            if (p.getEmployeeId().equals(uniqueID)){
                p.setName(personUpdatedDetails.getName());
                p.setAge(personUpdatedDetails.getAge());
                p.setEmployeeId(personUpdatedDetails.getEmployeeId());
                p.setPositionTitle(personUpdatedDetails.getPositionTitle());
                p.setLevel(personUpdatedDetails.getLevel());
                p.setTeamInfo(personUpdatedDetails.getTeamInfo());
                p.setCellPhoneNumber(personUpdatedDetails.getCellPhoneNumber());
            }
        }
    }
    public ArrayList<Person> searchPerson(Person person){
        //Function to search the person based on the filters
        ArrayList<Person> filteredPerson=new ArrayList <> ();
        String name=person.getName();
        String gender=person.getGender();
        String employeeId=person.getEmployeeId();
        int age=person.getAge();
        String startDate=person.getStartDate().toString();
        String emailAddress=person.getEmailAddress();
        ArrayList <String> searchParameter=new ArrayList <> ();
        if(!name.isEmpty() || !name.isBlank()){
            searchParameter.add("name");
        }
        if(!employeeId.isEmpty() || !employeeId.isBlank()){
            searchParameter.add("employeeId");
        }
        if(!gender.equals("")){
            searchParameter.add("gender");
        }
        if(age != 0){
            searchParameter.add("age");
        }
        if(!(startDate.equals("1900-01-01"))){
            System.out.println(startDate);
            searchParameter.add("startDate");
        }
        if(!emailAddress.isEmpty() || !emailAddress.isBlank()){
            searchParameter.add("emailAddress");
        }
        if (personRecord.isEmpty() || searchParameter.isEmpty()){
            return null;
        }
        for (Person p: personRecord){
            int matched=1;
            for (String searchParameter1 : searchParameter) {
                switch (searchParameter1){
                        case "name":
                            if(!p.getName().toLowerCase().contains(name.toLowerCase())){
                                matched=0;
                            }       
                            break;
                        case "employeeId":
                            if(!p.getEmployeeId().toLowerCase().contains(employeeId.toLowerCase())){
                                matched=0;
                            }       
                            break;
                        case "age":
                            if(p.getAge()!=age){
                                matched=0;
                            }       
                            break;
                        case "startDate":
                            if(!p.getStartDate().toString().equals(startDate)){
                                matched=0;
                            }       
                            break;
                        case "emailAddress":
                            if(!p.getEmailAddress().toLowerCase().contains(emailAddress.toLowerCase())){
                                matched=0;
                            }       
                            break;
                        case "gender":
                            if(!p.getGender().toLowerCase().equals(gender.toLowerCase())){
                                matched=0;
                            }       
                            break;
                }
            }
            if (matched==1){
                filteredPerson.add(p);
            }
        }
        return filteredPerson;
    }
    
}
