package al.sdacademy.oop;

import al.sdacademy.oop.model.Doctor;
import al.sdacademy.oop.model.Patient;
import al.sdacademy.oop.model.User;
import al.sdacademy.oop.service.AbstractAuthService;
import al.sdacademy.oop.service.AuthService;
import al.sdacademy.oop.service.DoctorAuthService;
import al.sdacademy.oop.service.PatientAuthService;

import javax.print.Doc;

public class Main {
    private static final AuthService DOCTOR_AUTH_SERVICE = new DoctorAuthService();
    public static void main(String[] args) {
        User doctor = new Doctor.Builder()
                              .build();
        User patient = new User.Builder()
                               .build();
        DOCTOR_AUTH_SERVICE.logout();
        System.out.println(doctor.getRoleDescription()); // Prints "This user is a doctor."
        System.out.println(patient.getRoleDescription()); // Prints "This user is a patient."
    }
}
