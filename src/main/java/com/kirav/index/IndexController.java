package com.kirav.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by kirav on 14. 6. 6.
 */
@Controller
public class IndexController {
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }
}
