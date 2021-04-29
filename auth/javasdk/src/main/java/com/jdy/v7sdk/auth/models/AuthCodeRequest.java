// This file is auto-generated, don't edit it. Thanks.
package com.jdy.v7sdk.auth.models;

import com.aliyun.tea.*;

public class AuthCodeRequest extends TeaModel {
    @NameInMap("query")
    @Validation(required = true)
    public AuthCodeRequestQuery query;

    @NameInMap("body")
    @Validation(required = true)
    public AuthCodeRequestBody body;

    @NameInMap("headers")
    @Validation(required = true)
    public AuthCodeRequestHeaders headers;

    public static AuthCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthCodeRequest self = new AuthCodeRequest();
        return TeaModel.build(map, self);
    }

    public AuthCodeRequest setQuery(AuthCodeRequestQuery query) {
        this.query = query;
        return this;
    }
    public AuthCodeRequestQuery getQuery() {
        return this.query;
    }

    public AuthCodeRequest setBody(AuthCodeRequestBody body) {
        this.body = body;
        return this;
    }
    public AuthCodeRequestBody getBody() {
        return this.body;
    }

    public AuthCodeRequest setHeaders(AuthCodeRequestHeaders headers) {
        this.headers = headers;
        return this;
    }
    public AuthCodeRequestHeaders getHeaders() {
        return this.headers;
    }

    public static class AuthCodeRequestQuery extends TeaModel {
        @NameInMap("access_token")
        @Validation(required = true)
        public String accessToken;

        @NameInMap("target_id")
        @Validation(required = true)
        public String clientId;

        public static AuthCodeRequestQuery build(java.util.Map<String, ?> map) throws Exception {
            AuthCodeRequestQuery self = new AuthCodeRequestQuery();
            return TeaModel.build(map, self);
        }

        public AuthCodeRequestQuery setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public AuthCodeRequestQuery setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

    }

    public static class AuthCodeRequestBody extends TeaModel {
        public static AuthCodeRequestBody build(java.util.Map<String, ?> map) throws Exception {
            AuthCodeRequestBody self = new AuthCodeRequestBody();
            return TeaModel.build(map, self);
        }

    }

    public static class AuthCodeRequestHeaders extends TeaModel {
        public static AuthCodeRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            AuthCodeRequestHeaders self = new AuthCodeRequestHeaders();
            return TeaModel.build(map, self);
        }

    }

}
