/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author anujkumar
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

        this.initializeHospital();
        this.initializePatient();
        this.intializeDoctor();
        this.initializeEncounter();

//        }
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void initializeHospital() {
        this.createHospital("Well Being Hospital", "Jackson Square", "Boston");
        this.createHospital("Fortis Hospital", "Jackson Square", "Boston");
        this.createHospital("ABR Hospital", "Fenway", "Somerville");
        this.createHospital("Ram Hospital", "Roxbury", "Boston");
        this.createHospital("Vedanta Hospital", "Brigton", "Cambridge");
        this.createHospital("Viran Hospital", "Fenway", "Somerville");
    }

    public void initializePatient() {

        Person per = this.patientDirectory.addPatient("Anuj", 25, "Anuj", "anuj", Role.PATIENT, "Walnut Avenue", "1", "Roxbury", "Boston");
        this.personDirectory.addPerson(per);
        Person per1 = this.patientDirectory.addPatient("Akash", 37, "Akash", "akash", Role.PATIENT, "Hudington Avenue", "2", "Jackson Square", "Boston");
        this.personDirectory.addPerson(per1);
        Person per2 = this.patientDirectory.addPatient("Ram", 30, "Ram", "ram", Role.PATIENT, "Heits Avenue", "6", "Fenway", "Somerville");
        this.personDirectory.addPerson(per2);
        Person per3 = this.patientDirectory.addPatient("Kashyab", 37, "Kashyab", "kashyab", Role.COMMUNITYADMIN, "JP", "7", "Brigton", "Cambridge");
        this.personDirectory.addPerson(per3);
        Person per4 = this.patientDirectory.addPatient("Vishal", 30, "Vishal", "vishal", Role.SYSADMIN, "PAS Avenue", "8", "Jackson Square", "Boston");
        this.personDirectory.addPerson(per4);

    }

    public void intializeDoctor() {

        Hospital hospital = hospitalDirectory.searchHospitalByName("Well Being Hospital");
        Person doc = this.doctorDirectory.addDoctor("Kunal", 25, "Kunal", "kunal", Role.DOCTOR, "Walnut", "7", "Jackson Square", "Boston", hospital);
        this.personDirectory.addPerson(doc);

        Hospital hospital1 = hospitalDirectory.searchHospitalByName("Fortis Hospital");
        Person per1 = this.doctorDirectory.addDoctor("Anni", 37, "Anni", "anni", Role.DOCTOR, "JP", "9", "Jackson Square", "Boston", hospital1);
        this.personDirectory.addPerson(per1);

        Hospital hospital2 = hospitalDirectory.searchHospitalByName("Vedanta Hospital");
        Person per2 = this.doctorDirectory.addDoctor("Kash", 37, "Kash", "kash", Role.DOCTOR, "address1", "A", "Fenway", "Somerville", hospital2);
        this.personDirectory.addPerson(per2);

    }

    public void initializeEncounter() {
        this.createEncounter("Akash", "Kunal", 80, 98, "Healthy", "None");
        this.createEncounter("Akash", "Anni", 66, 97, "Healthy", "Pollen");
        this.createEncounter("Ram", "Kash", 70, 96, "Cold", "Dogs");
        this.createEncounter("Anuj", "Kash", 87, 102, "Fever", "Dust");
        this.createEncounter("Anuj", "Kash", 70, 103, "High Fever", "Pollen");
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
        //System.out.println(userName);
        Person person = null;
        switch (role) {
            case PATIENT ->
                person = patientDirectory.addPatient(name, age, userName, password, role, address, aptNo, communityName, cityName);

            case COMMUNITYADMIN ->
                person = communityAdminDirectory.addAdmin(name, age, userName, password, role, address, aptNo, communityName, cityName);

            case SYSADMIN ->
                person = sysadminDirectory.addsysAd(name, age, userName, password, role, address, aptNo, communityName, cityName);
            case DOCTOR -> {
                Hospital hospital = hospitalDirectory.searchHospitalByName(hospitalName);
                person = doctorDirectory.addDoctor(name, age, userName, password, role, address, aptNo, communityName, cityName, hospital);
            }
        }

        this.personDirectory.addPerson(person);

        //System.out.println("Print");
        for (Person p : this.personDirectory.getPersonDirectory()) {
            //System.out.println(p.getuserName() + "=" + p.getPassword());
        }
        return true;
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
        //System.out.println(name + "" + password + "" + role);
        return personDirectory.authenticatePerson(name, password, role);
    }

    public List<Encounter> searchEncountersByDoctor(String doctorName) {

        List<Encounter> encounterResult = new ArrayList<>();

        for (Encounter e : encounterRecords.getEncounterRecords()) {
            if (e.getDoctorUsername().equals(doctorName)) {
                encounterResult.add(e);
            }
        }

        return encounterResult;
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

    public void createHospital(String name, String community, String city) {
        hospitalDirectory.addHospital(name, community, city);
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

}
