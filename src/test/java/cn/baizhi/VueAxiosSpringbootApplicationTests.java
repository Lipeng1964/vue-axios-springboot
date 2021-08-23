package cn.baizhi;

import cn.baizhi.entity.User;
import cn.baizhi.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
class VueAxiosSpringbootApplicationTests {

    @Autowired
    private UserServiceImpl userService;

    @Test
    void contextLoads() {
        List<User> list = userService.selectAll();
        for (User user : list) {
            System.out.println(user);
        }
    }

    @Test
    void delete(){
        userService.delete("c77d09d6-c535-4bf2-90a4-5028f5a0d3c7");
    }

    @Test
    void one(){
        User user = userService.selectBy("0b05c8e8-8df6-4529-a7e0-d1c6ce1bc478");
        System.out.println(user);
    }

}
