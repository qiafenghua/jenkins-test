package cn.ikarts.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ikart
 * @date 2022年10月30日9:58
 */
@RestController
public class ResponseController {

    @RequestMapping("/msg")
    public String response() {
        return "hello jenkins";
    }
}
