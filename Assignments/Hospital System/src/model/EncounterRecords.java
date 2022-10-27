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
public class EncounterRecords {
    
    private List<Encounter> encounterRecords = new ArrayList<>();

    public List<Encounter> getEncounterRecords() {
        return encounterRecords;
    }

    public void setEncounterRecords(List<Encounter> encounterRecords) {
        this.encounterRecords = encounterRecords;
    }
    
    public void createEncounter(VitalRecord vital, int patient, int doc){
//        VitalRecord vital = new VitalRecord();
        Encounter encounter = new Encounter(patient, vital, doc);
        
        this.encounterRecords.add(encounter);
//        this.encounterRecords

    }
    
}
