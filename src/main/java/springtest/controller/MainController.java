package springtest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/test")
public class MainController {




    @RequestMapping("/main")
   public ModelAndView main(){
       ModelAndView view = new ModelAndView("/main");
       return view;
   }

   @RequestMapping("someString")
   public String someString(){
        return "hello";
   }
}
