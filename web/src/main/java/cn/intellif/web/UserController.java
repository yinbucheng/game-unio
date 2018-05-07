package cn.intellif.web;

import cn.intellif.IUserService;
import cn.intellif.domain.User;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    //@Autowired
    @Reference
    private IUserService userService;

    @RequestMapping("/save")
    public Object save(){
        User user=new User();
        user.setAge(20);
        user.setName("yucui");
        return userService.save(user);
    }


    @RequestMapping("/listAll")
    public Object listAll(){
        return userService.listAll();
    }
}
