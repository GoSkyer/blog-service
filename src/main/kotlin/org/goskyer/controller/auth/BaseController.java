package org.goskyer.controller.auth;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Created by zohar on 2017/4/10.
 * desc:
 */
public class BaseController {

    protected UserDetails getUser(){
        return ((UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }


}
