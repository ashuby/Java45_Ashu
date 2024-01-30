package StudentApplication.SpringJPAHibernate.Controllers;

import StudentApplication.SpringJPAHibernate.Model.User;
import StudentApplication.SpringJPAHibernate.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    };

    @GetMapping("/findbyId/{id}")
    public User findByUserId(@PathVariable int id) {
        //Optional class for null pointer exception
        Optional<User> tempObj = userRepoObj.findById(id);
        if(tempObj.isEmpty()) {
            System.out.println("User Id is not found : " + id);
        }
        return userRepoObj.findById(id).get();
    };

    @GetMapping("/deletebyid/{id}")
    public void deletebyid(@PathVariable int id) {
        System.out.println("User having id : " + id + " is deleted.");
        userRepoObj.deleteById(id);
    }
    @GetMapping("/existbyid/{id}")
    public boolean existsId(@PathVariable int id) {
        boolean result = userRepoObj.existsById(id);
        if(result) {
            System.out.println("User with id : " + id + " is existing.");
        }
        else{
            System.out.println("User with id : " + id + " is not existing.");
        }
        return result;
    };


}

