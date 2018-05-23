package cn.intellif.web;

import cn.intellif.base.ServerResult;
import cn.intellif.service.IUserService;
import cn.intellif.domain.User;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference(version = "1.0")
    private IUserService userService;

    @RequestMapping("/save")
    public Object save(){
        User user=new User();
        user.setAge(20);
        user.setName("yucui");
        userService.save(user);
         return ServerResult.success();
    }


    @RequestMapping("/findAll")
    public Object listAll(){
        return ServerResult.success(userService.listAll());
    }

    @RequestMapping("/findWithName")
    public Object findWithName(String name){
        System.out.println("name:"+name);
        return ServerResult.success(userService.findUserWithName(name));
    }
}
