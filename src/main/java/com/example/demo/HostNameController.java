package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

@Controller
public class HostNameController {
    @ResponseBody
    @RequestMapping("/")
    public String say() {
        String res = "";
        try {
            InetAddress ia = InetAddress.getLocalHost();
            res = ia.getHostName() + "-->" + ia.getHostAddress()+", time: " + new Date().getTime();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return res;
    }
}
