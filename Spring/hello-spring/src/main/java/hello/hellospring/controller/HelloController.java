package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    /**
     * ViewName 반환
     * 
     * @param model
     *
     * @return "hello"
     */
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "spring!!");

        // 리소스 이름을 찾아서 실행 됨 (viewName - hello)
        // viewResolver : resources:template/ + {viewName} (hello) + .html
        return "hello";
    }

    /**
     * MVC와 템플릿 엔진 : 랜더링 된 HTML 반환
     *
     * @param name
     * @param model
     *
     * @return "hello-template"
     */
    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    /**
     * API 방식 : 문자열 반환 (랜더링 된 HTML X)
     * - 잘 사용되지 않음
     *
     * @param name
     *
     * @return "hello " + name
     */
    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name;
    }

    /**
     * API 방식 : 객체 반환(JSON)
     * - HTTP의 Body에 넣어서 반환 됨
     *
     * @param name
     *
     * @return Hello
     */
    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);

        return hello; // @ResponseBody 사용 시 객체를 리턴 하면 JSON 방식으로 리턴
    }

    // 내부 클래스
    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
