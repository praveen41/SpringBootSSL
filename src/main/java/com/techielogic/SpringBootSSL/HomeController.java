/**
 * 
 */
package com.techielogic.SpringBootSSL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Praveen
 *
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public String welcome(){
        return "This Application is Secured!!!!";
    }
}