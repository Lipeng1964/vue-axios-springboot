package cn.baizhi.controller;

import cn.baizhi.entity.User;
import cn.baizhi.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController  //相当于@Controller+@ResponseBody
/*@Controller
@ResponseBody*/
@CrossOrigin//跨域接受
public class UserController {

    @Autowired
    private UserServiceImpl us;
    //查所有
    @RequestMapping("findAll")
    public List<User> findAll(){   //收参
        //调用业务 返回
        return us.selectAll();
    }

    //删除
    @RequestMapping("delete")
    public String delete(String id){
        us.delete(id);
        return null;
    }
    //添加
    @RequestMapping("add")
    public String add(@RequestBody User user){
        us.insert(user);
        return null;
    }
    //查一个
    @RequestMapping("findOne")
    public User findOne(String id){
        return us.selectBy(id);
    }

    //修改
    @RequestMapping("update")
    public String update(@RequestBody User user){
        us.update(user);
        return null;
    }
}
