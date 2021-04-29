// This file is auto-generated, don't edit it. Thanks.
package com.jdy.v7sdk.auth;

import com.aliyun.tea.*;
import com.jdy.v7sdk.auth.models.*;
import com.jdy.v7sdk.sdkkenerl.*;

public class Client {

    public com.jdy.v7sdk.sdkkenerl.Client _kernel;
    public Client(com.jdy.v7sdk.sdkkenerl.Client kernel) throws Exception {
        this._kernel = kernel;
    }


    /**
     * get token function
     * @param request TokenRequest for get TokenResponse 
     * @return result result of the server
     */
    public TokenResponse getToken(TokenRequest request) throws Exception {
        TokenRequest.TokenRequestHeaders headers = new TokenRequest.TokenRequestHeaders();
        return TeaModel.toModel(_kernel.get("/auth/user/access_token", headers, request.query), new TokenResponse());
    }

    public AuthCodeResponse getAuthCode(AuthCodeRequest request) throws Exception {
        AuthCodeRequest.AuthCodeRequestHeaders headers = new AuthCodeRequest.AuthCodeRequestHeaders();
        return TeaModel.toModel(_kernel.get("/auth/user/auth_code", headers, request.query), new AuthCodeResponse());
    }

    public TokenResponse getAccessToken(Auth2Request request) throws Exception {
        Auth2Request.Auth2RequestHeaders headers = new Auth2Request.Auth2RequestHeaders();
        return TeaModel.toModel(_kernel.get("/auth/oauth2/access_token", headers, request.query), new TokenResponse());
    }
}
