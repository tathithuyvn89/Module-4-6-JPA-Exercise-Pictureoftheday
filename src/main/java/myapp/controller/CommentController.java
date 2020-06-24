package myapp.controller;

import myapp.model.ImageComment;
import myapp.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CommentController {
    @Autowired
    private  CommentService commentService;
    @ModelAttribute("comments")
    private List<ImageComment> showList(){
        return commentService.findAll();
    }
    @GetMapping("/home")
    private ModelAndView showHome(){
        ModelAndView modelAndView = new ModelAndView("comment");
        modelAndView.addObject("comment",new ImageComment());
        return modelAndView;
    }
    @PostMapping("/home")
    private ModelAndView saveComment(@ModelAttribute("comment") ImageComment comment){
        ModelAndView modelAndView = new ModelAndView("redirect:/home");
       commentService.save(comment);
       return modelAndView;
    }

}
