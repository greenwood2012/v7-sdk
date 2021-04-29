// This file is auto-generated, don't edit it. Thanks.
package com.jdy.v7sdk.auth.models;

import com.aliyun.tea.*;

public class TokenRequest extends TeaModel {
    @NameInMap("query")
    @Validation(required = true)
    public TokenRequestQuery query;

    @NameInMap("body")
    @Validation(required = true)
    public TokenRequestBody body;

    @NameInMap("headers")
    @Validation(required = true)
    public TokenRequestHeaders headers;

    public static TokenRequest build(java.util.Map<String, ?> map) throws Exception {
        TokenRequest self = new TokenRequest();
        return TeaModel.build(map, self);
    }

    public TokenRequest setQuery(TokenRequestQuery query) {
        this.query = query;
        return this;
    }
    public TokenRequestQuery getQuery() {
        return this.query;
    }

    public TokenRequest setBody(TokenRequestBody body) {
        this.body = body;
        return this;
    }
    public TokenRequestBody getBody() {
        return this.body;
    }

    public TokenRequest setHeaders(TokenRequestHeaders headers) {
        this.headers = headers;
        return this;
    }
    public TokenRequestHeaders getHeaders() {
        return this.headers;
    }

    public static class TokenRequestQuery extends TeaModel {
        @NameInMap("client_id")
        @Validation(required = true)
        public String clientId;

        @NameInMap("client_secret")
        @Validation(required = true)
        public String clientSecret;

        @NameInMap("username")
        @Validation(required = true)
        public String username;

        @NameInMap("password")
        @Validation(required = true)
        public String password;

        public static TokenRequestQuery build(java.util.Map<String, ?> map) throws Exception {
            TokenRequestQuery self = new TokenRequestQuery();
            return TeaModel.build(map, self);
        }

        public TokenRequestQuery setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public TokenRequestQuery setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

        public TokenRequestQuery setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

        public TokenRequestQuery setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

    }

    public static class TokenRequestBody extends TeaModel {
        public static TokenRequestBody build(java.util.Map<String, ?> map) throws Exception {
            TokenRequestBody self = new TokenRequestBody();
            return TeaModel.build(map, self);
        }

    }

    public static class TokenRequestHeaders extends TeaModel {
        public static TokenRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            TokenRequestHeaders self = new TokenRequestHeaders();
            return TeaModel.build(map, self);
        }

    }

}
