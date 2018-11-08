package task.manager.task.manager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import task.manager.task.manager.logic.handler.StudentHandler;
import task.manager.task.manager.model.Student;

import javax.validation.Valid;

@Controller

public class HelloController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    String getView1(Model model) {
        return "index";
    }
    @RequestMapping(value = "/displayTasks", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("Student")Student Student,
                         BindingResult result, ModelMap model) {
        StudentHandler.getInstance().addStudent(Student);
        model.addAttribute("studentId",Student.getId());
        model.addAttribute("studentsGrades", Student.getStudentGrades());
        return null;
    }
}
