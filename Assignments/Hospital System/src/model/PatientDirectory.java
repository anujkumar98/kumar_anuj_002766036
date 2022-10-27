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
public class PatientDirectory extends PersonDirectory{

    private List<Patient> patientDirectory = new ArrayList();

    public List<Patient> getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(List<Patient> patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public Patient addPatient(String name) {
        Patient patient = new Patient();
        this.patientDirectory.add(patient);
        this.addPerson(patient);
        return patient;
    }

    public void removePatient(String username) {
        for (int i = 0; i < this.patientDirectory.size(); i++) {
            Patient patient = this.patientDirectory.get(i);
            if (patient.getUserName().equals(username)) {
                this.patientDirectory.remove(i);
                this.removePerson(username);
                break;
            }
        }
    }

}
