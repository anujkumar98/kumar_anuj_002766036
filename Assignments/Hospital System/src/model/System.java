/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author anujkumar
 */
public class System {

    PersonDirectory personDirectory = new PersonDirectory();
    PatientDirectory patientDirectory = new PatientDirectory();
    DoctorDirectory doctorDirectory = new DoctorDirectory();
    CommunityAdminDirectory communityAdminDirectory = new CommunityAdminDirectory();
    SysAdminDirectory sysadminDirectory = new SysAdminDirectory();

    HospitalDirectory hospitalDirectory = new HospitalDirectory();
    EncounterRecords encounterRecords = new EncounterRecords();

    public boolean signup(String name, String password, Role role) {
        switch (role) {
            case PATIENT ->
                patientDirectory.addPatient(name);

            case COMMUNITYADMIN ->
                communityAdminDirectory.addAdmin(name);

            case SYSADMIN ->
                sysadminDirectory.addsysAd(name);
        }

        return true;
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

    public boolean signup(String name, String password, Role role, String hospitalName) {

        Hospital hospital = hospitalDirectory.searchHospitalByName(hospitalName);
        
        switch (role) {
            case DOCTOR ->
                doctorDirectory.addDoctor(name, hospital);
        }
        
        return true;
    }

    public boolean signin(String name, String password, Role role) {
        return personDirectory.authenticatePerson(name, password, role);
    }

    public Doctor searchDoctor() {

//        personDirectory
        return null;
    }

    public void createRecord(int patientId, int doctorId) {
//      Add Vital params
        VitalRecord vital = new VitalRecord();

        encounterRecords.createEncounter(vital, patientId, doctorId);
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
