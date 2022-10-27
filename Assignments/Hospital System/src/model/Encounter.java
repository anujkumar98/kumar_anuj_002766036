/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author anujkumar
 */
public class Encounter {
    
    private int id;
    private int patientId;
    private VitalRecord vital;
    private int doctorId;

    public Encounter(int patient, VitalRecord vital, int doctor) {
        this.patientId = patient;
        this.vital = vital;
        this.doctorId = doctor;
    }
    
    
}
