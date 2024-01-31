package StudentApplication.SpringJPAHibernate.Services;

import StudentApplication.SpringJPAHibernate.Model.Office;
import StudentApplication.SpringJPAHibernate.Repository.OfficeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;
@Service
public class OfficeService {

    @Autowired
    OfficeRepository officeRepoObj;
    public Office saveOffice(Office obj ){
        Office responseOffice = officeRepoObj.save(obj);
        return responseOffice;
    }


    public void deleteOffice(int id ) {
        officeRepoObj.deleteById(id);
    }

    public Optional<Office> updateOffice(int id) {
        Optional<Office> obj = officeRepoObj.findById(id);
        if(obj.isEmpty()) {
            System.out.println("User with the given id : " + id + " is not found");
        }else {
            System.out.println(officeRepoObj.findById(id).get());
        }
        return obj;
    }
}
