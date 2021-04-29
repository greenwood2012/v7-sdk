// This file is auto-generated, don't edit it. Thanks.
package com.jdy.v7sdk.auth.models;

import com.aliyun.tea.*;

public class AuthCodeResponse extends TeaModel {
    @NameInMap("errcode")
    @Validation(required = true)
    public Number errcode;

    @NameInMap("description")
    @Validation(required = true)
    public String description;

    @NameInMap("data")
    @Validation(required = true)
    public AuthCodeResponseData data;

    public static AuthCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthCodeResponse self = new AuthCodeResponse();
        return TeaModel.build(map, self);
    }

    public AuthCodeResponse setErrcode(Number errcode) {
        this.errcode = errcode;
        return this;
    }
    public Number getErrcode() {
        return this.errcode;
    }

    public AuthCodeResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AuthCodeResponse setData(AuthCodeResponseData data) {
        this.data = data;
        return this;
    }
    public AuthCodeResponseData getData() {
        return this.data;
    }

    public static class AuthCodeResponseData extends TeaModel {
        @NameInMap("auth_code")
        @Validation(required = true)
        public String authCode;

        public static AuthCodeResponseData build(java.util.Map<String, ?> map) throws Exception {
            AuthCodeResponseData self = new AuthCodeResponseData();
            return TeaModel.build(map, self);
        }

        public AuthCodeResponseData setAuthCode(String authCode) {
            this.authCode = authCode;
            return this;
        }
        public String getAuthCode() {
            return this.authCode;
        }

    }

}
