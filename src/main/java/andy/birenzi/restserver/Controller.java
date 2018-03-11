package andy.birenzi.restserver;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

   private  List<User> allUsers= new ArrayList<User>();

    @RequestMapping("/getAllUsers")
    public @ResponseBody List<User> greeting() {
        return allUsers;
    }
    @PostMapping("/addUser")
    @ResponseBody
    public String addUser(@RequestBody User user) {
        allUsers.add(user);
        return "done";
    }
    @GetMapping("/getuser/{id}")
    public @ResponseBody  User getUser(@PathVariable(value="id") int id) {
        return allUsers.get(id-1);
    }
}
