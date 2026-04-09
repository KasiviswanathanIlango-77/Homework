/*
Task:
Create a class named PatientRecord.
The class should contain the following fields:
patientName
age
disease
doctorName
roomType
billAmount
Inside the PatientRecord class, create a static inner class named Builder.
In the Builder class:
Provide setter methods for each field
Each setter method should return the Builder object (method chaining)
Implement a build() method to return the final PatientRecord object

 Requirements:
Use Builder Design Pattern
Do not use constructor directly for object creation
Implement method chaining
Create a method like displayDetails() to show patient information
*/
package builderdesign;


public class HospitalBuiderPattern {
    public static void main(String[] args) {
        System.out.println("Patient Record System using Builder Design Pattern");
        PatientRecordSystem pr1;
        pr1 = new PatientRecordSystem.PrsBuilder("Amalraj",54).setDisease("HeartSurgery").
                  setDoctorname("Kumaran").setRoomtype("Critical Ward").setBillamount(170000l).build();
        pr1.showDetails();
    }
}
