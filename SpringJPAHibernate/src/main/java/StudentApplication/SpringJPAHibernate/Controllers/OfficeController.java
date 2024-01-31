package StudentApplication.SpringJPAHibernate.Controllers;

import StudentApplication.SpringJPAHibernate.Model.Office;
import StudentApplication.SpringJPAHibernate.Repository.OfficeRepository;
import StudentApplication.SpringJPAHibernate.Services.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/office")
public class OfficeController {

    @Autowired
    OfficeService officeSerObj;

    @PostMapping("/signup")
    public Office saveOffice(@RequestBody Office obj ){
        Office responseOffice = officeSerObj.saveOffice(obj);
        return responseOffice;
    }

    @PostMapping("/deleteByid/{id}")
    public void deleteOffice(@PathVariable("id") int id ) {
        officeSerObj.deleteOffice(id);
    }

    @PutMapping("/updatebyid/{id}")
    public Optional<Office> updateOffice(@PathVariable("id") int id) {
        Optional<Office> obj = officeSerObj.updateOffice(id);
        return obj;
    }
}
