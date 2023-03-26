package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 제목
 */
@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "spring!!");

        // 리소스 이름을 찾아서 실행 됨 (viewName - hello)
        // viewResolver : resources:template/ + {viewName} (hello) + .html
        return "hello";
    }
}
