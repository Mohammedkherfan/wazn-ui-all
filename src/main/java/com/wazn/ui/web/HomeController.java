package com.wazn.ui.web;

import com.wazn.ui.model.*;
import com.wazn.ui.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

import static java.util.Objects.isNull;

@Controller
public class HomeController {

    private HomeService service;

    @Autowired
    public HomeController(HomeService service) {
        this.service = service;
    }

    @Value( "${videoUrl}" )
    private String videoUrl;

    @GetMapping("/")
    public ModelAndView root() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @GetMapping("/user")
    public ModelAndView userIndex() {
        ModelAndView modelAndView = new ModelAndView();
        List<GetAllDataResponse> all = service.getAll();
        modelAndView.addObject("all",all);
        modelAndView.setViewName("user/index");
        return modelAndView;
    }

    @RequestMapping("/addAdmin")
    public ModelAndView addAdminUser(@Valid @ModelAttribute("request")AddUserRequest request, BindingResult result, ModelMap model) {
        ModelAndView modelAndView = new ModelAndView();
        AddUserResponse addUserResponse = service.addAdminUser(request);
        if (isNull(addUserResponse))
            modelAndView.setViewName("/error/access-denied");
        else {
            List<ListUserResponse> all = service.listUser();
            modelAndView.addObject("all",all);
            modelAndView.setViewName("user/admin");
        }
        return modelAndView;
    }

    @RequestMapping("/editAdmin")
    public ModelAndView editAdminUser(@Valid @ModelAttribute("updateUserRequest") UpdateUserRequest updateUserRequest, BindingResult result, ModelMap model) {
        ModelAndView modelAndView = new ModelAndView();
        service.editAdminUser(updateUserRequest);
        List<ListUserResponse> all = service.listUser();
        modelAndView.addObject("all",all);
        modelAndView.setViewName("user/admin");
        return modelAndView;
    }

    @GetMapping("/admin/addAdmin")
    public ModelAndView addAdmin() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/addAdmin");
        return modelAndView;
    }


    @GetMapping("/admin")
    public ModelAndView listAdmin() {
        ModelAndView modelAndView = new ModelAndView();
        List<ListUserResponse> all = service.listUser();
        modelAndView.addObject("all",all);
        modelAndView.setViewName("user/admin");
        return modelAndView;
    }

    @GetMapping("/meeting")
    public ModelAndView meeting() {
        ModelAndView modelAndView = new ModelAndView();
        List<GetAllDataResponse> all = service.getAll();
        modelAndView.addObject("all",all);
        modelAndView.addObject("videoUrl", videoUrl);
        modelAndView.setViewName("user/meeting");
        return modelAndView;
    }

    @GetMapping("/admin/{userName}")
    public ModelAndView editAdmin(@PathVariable String userName) {
        ModelAndView modelAndView = new ModelAndView();
        List<ListUserResponse> all = service.listUser();
        for (ListUserResponse userResponse : all) {
            if (userResponse.getUserName().equals(userName))
                modelAndView.addObject("all",userResponse);
        }
        modelAndView.setViewName("user/editAdmin");
        return modelAndView;
    }

    @GetMapping("/user/{mobile}")
    public ModelAndView userByIdIndex(@PathVariable String mobile) {
        ModelAndView modelAndView = new ModelAndView();
        GetAllDataResponse all = service.getAllById(mobile);
        modelAndView.addObject("all",all);
        modelAndView.setViewName("user/index");
        return modelAndView;
    }

    @RequestMapping("/save")
    public ModelAndView save(@Valid @ModelAttribute("save") SaveComment save, BindingResult result, ModelMap model) {
        ModelAndView modelAndView = new ModelAndView();
        service.save(save.getMobile(), save.getHelpDeskComment());
        GetAllDataResponse all = service.getAllById(save.getMobile());
        modelAndView.addObject("all",all);
        modelAndView.setViewName("user/index");
        return modelAndView;
    }

    @GetMapping("/status/{mobile}/{status}")
    public ModelAndView status(@PathVariable String mobile, @PathVariable String status) {
        ModelAndView modelAndView = new ModelAndView();
        service.status(mobile, status);
        List<GetAllDataResponse> all = service.getAll();
        modelAndView.addObject("all",all);
        modelAndView.setViewName("user/index");
        return modelAndView;
    }

    @GetMapping("/details/{mobile}")
    public ModelAndView details(@PathVariable String mobile) {
        ModelAndView modelAndView = new ModelAndView();
        GetAllDataResponse all = service.getAllById(mobile);
        modelAndView.addObject("all",all);
        modelAndView.setViewName("user/details");
        return modelAndView;
    }

    @GetMapping("/checkMeeting/{mobile}")
    public ModelAndView checkMeeting(@PathVariable String mobile) {
        ModelAndView modelAndView = new ModelAndView();
        Boolean checkMeeting = service.checkMeeting(mobile);
        if (checkMeeting) {
            modelAndView.addObject("videoUrl", videoUrl);
            modelAndView.setViewName("user/startMeeting");
        }else {
            modelAndView.setViewName("/error/access-denied-meeting");
        }
        return modelAndView;
    }

    @GetMapping("/meetingStart/{mobile}")
    public ModelAndView meetingStart(@PathVariable String mobile) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/cam");
        return modelAndView;
    }

    @GetMapping("/login")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        return modelAndView;
    }

    @GetMapping("/review")
    public ModelAndView review() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("review");
        return modelAndView;
    }

    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("home");
        return modelAndView;
    }

    @GetMapping("/access-denied")
    public ModelAndView accessDenied() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/error/access-denied");
        return modelAndView;
    }

}
