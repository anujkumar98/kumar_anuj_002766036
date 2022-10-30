/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author visha_wb3uzfg
 */
public class Controller {

    PersonDirectory personDirectory = new PersonDirectory();
    PatientDirectory patientDirectory = new PatientDirectory();
    DoctorDirectory doctorDirectory = new DoctorDirectory();
    CommunityAdminDirectory communityAdminDirectory = new CommunityAdminDirectory();
    SysAdminDirectory sysadminDirectory = new SysAdminDirectory();

    HospitalDirectory hospitalDirectory = new HospitalDirectory();
    EncounterRecords encounterRecords = new EncounterRecords();
    
     public Controller() {
       
//        for (int i = 0; i < 5; i++) {
        this.createHospital("xyz", "abc", "qwe");
        this.createHospital("abc", "mkl", "rte");
        this.createHospital("rtyr", "gh", "tyut");
        Person per = this.patientDirectory.addPatient("asd", 10, "asd", "asd", Role.PATIENT, "wet", "tyr", "qweq", "yui");
        this.personDirectory.addPerson(per);
        
        Person per1 = this.patientDirectory.addPatient("anuj", 10, "anuj", "asd", Role.PATIENT, "wet", "tyr", "qweq", "yui");
        this.personDirectory.addPerson(per1);
       
        Person com = this.communityAdminDirectory.addAdmin("asd", 10, "com", "asd", Role.COMMUNITYADMIN, "wet", "tyr", "qweq", "yui");
        this.personDirectory.addPerson(com);
       
       
        Hospital hospital = hospitalDirectory.searchHospitalByName("xyz");
        Person doc = this.doctorDirectory.addDoctor("doc", 10, "doc", "doc", Role.DOCTOR, "wet", "tyr", "qweq", "yui", hospital);
        this.personDirectory.addPerson(doc);
       
        Person sysad = this.doctorDirectory.addDoctor("doc", 10, "sys", "admin", Role.SYSADMIN, "wet", "tyr", "qweq", "yui", hospital);
        this.personDirectory.addPerson(sysad);
        this.createEncounter("asd", "doc", 20, 98, "", "");
       
       
//        }

    }
    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public CommunityAdminDirectory getCommunityAdminDirectory() {
        return communityAdminDirectory;
    }

    public void setCommunityAdminDirectory(CommunityAdminDirectory communityAdminDirectory) {
        this.communityAdminDirectory = communityAdminDirectory;
    }

    public SysAdminDirectory getSysadminDirectory() {
        return sysadminDirectory;
    }

    public void setSysadminDirectory(SysAdminDirectory sysadminDirectory) {
        this.sysadminDirectory = sysadminDirectory;
    }

    public HospitalDirectory getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(HospitalDirectory hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }

    public EncounterRecords getEncounterRecords() {
        return encounterRecords;
    }

    public void setEncounterRecords(EncounterRecords encounterRecords) {
        this.encounterRecords = encounterRecords;
    }
    
    

    public boolean signup(String name, int age, String userName, String password, Role role, String address, String aptNo, String communityName, String cityName, String hospitalName) {
//        name, age, password, role, address, aptNo, cityName
        System.out.println(userName);
        Person person = null;
        switch (role) {
            case PATIENT ->
                person = patientDirectory.addPatient(name, age, userName, password, role, address, aptNo, communityName, cityName);

            case COMMUNITYADMIN ->
                person = communityAdminDirectory.addAdmin(name, age, userName, password, role, address, aptNo, communityName, cityName);

            case SYSADMIN ->
                person = sysadminDirectory.addsysAd(name, age, userName, password, role, address, aptNo, communityName, cityName);
            case DOCTOR ->{
                Hospital hospital = hospitalDirectory.searchHospitalByName(hospitalName);
                person = doctorDirectory.addDoctor(name, age, userName, password, role, address, aptNo, communityName, cityName, hospital);
            }
        }
        
        this.personDirectory.addPerson(person);
        
        System.out.println("Print");
        for (Person p: this.personDirectory.getPersonDirectory()){
            System.out.println(p.getuserName()+"="+p.getPassword());
        }
        return true;
    }
    
    public List<Hospital> searchHospital(String communityName, String cityName) {

        List<Hospital> hospitalResult = new ArrayList<>();
        if (cityName != null) {
            if (communityName != null) {
                return hospitalDirectory.searchHospitalByAll(communityName, cityName);
            }
        }

        if (cityName == null) {
            return hospitalDirectory.searchHospitalByComunity(communityName);
        }

        if (communityName == null) {
            return hospitalDirectory.searchHospitalByCity(cityName);
        }

        return hospitalResult;
    }
    
//
//    public boolean signup(String name, int age, String userName, String password, Role role, String address, String aptNo, String communityName, String cityName, String hospitalName) {
//
//        Hospital hospital = hospitalDirectory.searchHospitalByName(hospitalName);
//
//        switch (role) {
//            case DOCTOR ->
//                doctorDirectory.addDoctor(name, age, userName, password, role, address, aptNo, communityName, cityName, hospital) ;
//        }
//
//        return true;
//    }

    public Person signin(String name, String password, Role role) {
        System.out.println(name+""+password+""+role);
        return personDirectory.authenticatePerson(name, password, role);
    }
    public void createHospital(String name, String community, String city){
        hospitalDirectory.addHospital(name, community, city);
    }
    
    public List<Encounter> searchEncountersByDoctor(String doctorName){
        
        List<Encounter> encounterResult = new ArrayList<>();
        
        for (Encounter e: encounterRecords.getEncounterRecords()){
            if (e.getDoctorUsername().equals(doctorName)){
                encounterResult.add(e);
            }
        }
        
        return encounterResult;
        
    }
    
//    public 
    
//    public Doctor searchDoctor() {
//        
////        personDirectory
//        return null;
//    }

    public void createEncounter(String patientUsername, String doctorUsername, int heartrate, float temperature, String remarks, String allergies) {
//      Add Vital params
        VitalRecord vital = new VitalRecord(heartrate, temperature, remarks, allergies);

        encounterRecords.createEncounter(vital, patientUsername, doctorUsername);
    }
    public List<Encounter> searchEncountersByPatient(String doctorName, String patientName) {

        List<Encounter> encounterResult = new ArrayList<>();

        for (Encounter e : encounterRecords.getEncounterRecords()) {
            if (e.getPatientUsername().equals(patientName)) {
                if (doctorName != null) {
                    if (e.getDoctorUsername().equals(doctorName)) {
                        encounterResult.add(e);
                    }
                } else {
                    encounterResult.add(e);
                }
            }
        }
        return encounterResult;
    }

    public void addHospital(String name, String city, String communityName) {
//        Add hospital parameters

        hospitalDirectory.addHospital(name, city, communityName);
    }

    public void removeHospital(String name) {
        hospitalDirectory.removeHospital(name);
    }

    public void removeHospital(int id) {
        hospitalDirectory.removeHospital(id);
    }

}
