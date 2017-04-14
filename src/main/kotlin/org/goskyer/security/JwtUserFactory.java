package org.goskyer.security;


import org.goskyer.domain.JwtUser;
import org.goskyer.domain.User;

public final class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(User user) {
        return new JwtUser(
                user.getUserEmail(),
                user.getPassword(),
                user.getRole()
        );
    }
}