package StudentApplication.SpringJPAHibernate.Controllers;

import StudentApplication.SpringJPAHibernate.Model.User;
import StudentApplication.SpringJPAHibernate.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserRepository userRepoObj;
    @PostMapping("/signup")
    public User save(@RequestBody User userObj){
        System.out.println(userObj);
        User userResponse = userRepoObj.save(userObj);

        return userResponse;
    };

    @DeleteMapping("/del")
    public void delete(@RequestBody User userObj1 ) {
        System.out.println(userObj1);

        userRepoObj.delete(userObj1);
    };

    @GetMapping("/find")
    public List<User> findAll() {

        List<User> userResponse = userRepoObj.findAll();
        return  userResponse;
    };

    @GetMapping("/")
    public String index() {
        return "Hello!!!";
    }

}

