/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Administrator
 */
public class PatientCase {
    private int patientID;
    private String illnessCase;
    private String patientSolve;

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getIllnessCase() {
        return illnessCase;
    }

    public void setIllnessCase(String illnessCase) {
        this.illnessCase = illnessCase;
    }

    public String getPatientSolve() {
        return patientSolve;
    }

    public void setPatientSolve(String patientSolve) {
        this.patientSolve = patientSolve;
    }
}
