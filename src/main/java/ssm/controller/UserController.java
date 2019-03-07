package ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.service.UserBiz;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
private UserBiz userBiz;

    @RequestMapping("/list")
    @ResponseBody
    public Object getAll(){
        System.out.println("111122222222123123");
        System.out.println("111122222222dev");
        return  userBiz.getAll();

    }
}
