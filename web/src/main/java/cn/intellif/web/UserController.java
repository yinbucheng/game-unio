package cn.intellif.web;

import cn.intellif.service.IUserService;
import cn.intellif.domain.User;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

//    @Autowired
    @Reference
    private IUserService userService;

    @RequestMapping("/save")
    public Object save(){
        User user=new User();
        user.setAge(20);
        user.setName("yucui");
        return userService.save(user);
    }


    @RequestMapping("/findAll")
    public Object listAll(){
        return userService.listAll();
    }
}
