package com.lxy.newsshow.Controllers;

import com.lxy.newsshow.Mappers.EmployeeDao;
import com.lxy.newsshow.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class FriendsController {
    @Autowired
    EmployeeDao employeeDao;
    @GetMapping(value = "/friends")
    public String All(Model model){
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("friends", employees);
        return "User/list";
    }
   @GetMapping(value = "/addFriend")
    public String toAddFriendPage(){
        return "User/addFriend";
    }

}
