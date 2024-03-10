package com.xhpolaris.meowpick.common.authorize;

import com.xhpolaris.meowpick.common.consts.Consts;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.authentication.RememberMeAuthenticationToken;

import java.util.Collections;

@Getter
@Setter
public class MeowRememberMeAuthenticationToken extends RememberMeAuthenticationToken {
    private MeowUser user;

    public MeowRememberMeAuthenticationToken() {
        super(Consts.Authorize.KEY, "MeowRememberMeAuthenticationToken", Collections.emptyList());
    }

    public static MeowRememberMeAuthenticationToken authorized(MeowUser user) {
        MeowRememberMeAuthenticationToken token = new MeowRememberMeAuthenticationToken();

        token.user = user;

        return token;
    }
}
