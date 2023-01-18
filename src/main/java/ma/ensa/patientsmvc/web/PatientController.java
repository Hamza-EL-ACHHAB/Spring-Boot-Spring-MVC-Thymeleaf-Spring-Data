package ma.ensa.patientsmvc.web;

import lombok.AllArgsConstructor;
import ma.ensa.patientsmvc.entities.Patient;
import ma.ensa.patientsmvc.repositories.PatientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor /*Injection des dependances avec constr*/
public class PatientController {
    private PatientRepository patientRepository;
    @GetMapping(path = "/index")
    public String Patients(Model model){
        List<Patient> patientList = patientRepository.findAll();
        model.addAttribute("listPatients",patientList);
        return "patients";
    }

}
