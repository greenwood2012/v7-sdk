// This file is auto-generated, don't edit it. Thanks.
package com.jdy.v7sdk.auth.models;

import com.aliyun.tea.*;

public class Auth2Request extends TeaModel {
    @NameInMap("query")
    @Validation(required = true)
    public Auth2RequestQuery query;

    @NameInMap("body")
    @Validation(required = true)
    public Auth2RequestBody body;

    @NameInMap("headers")
    @Validation(required = true)
    public Auth2RequestHeaders headers;

    public static Auth2Request build(java.util.Map<String, ?> map) throws Exception {
        Auth2Request self = new Auth2Request();
        return TeaModel.build(map, self);
    }

    public Auth2Request setQuery(Auth2RequestQuery query) {
        this.query = query;
        return this;
    }
    public Auth2RequestQuery getQuery() {
        return this.query;
    }

    public Auth2Request setBody(Auth2RequestBody body) {
        this.body = body;
        return this;
    }
    public Auth2RequestBody getBody() {
        return this.body;
    }

    public Auth2Request setHeaders(Auth2RequestHeaders headers) {
        this.headers = headers;
        return this;
    }
    public Auth2RequestHeaders getHeaders() {
        return this.headers;
    }

    public static class Auth2RequestQuery extends TeaModel {
        @NameInMap("client_id")
        @Validation(required = true)
        public String clientId;

        @NameInMap("client_secret")
        @Validation(required = true)
        public String clientSecret;

        @NameInMap("code")
        @Validation(required = true)
        public String code;

        @NameInMap("grant_type")
        @Validation(required = true)
        public String granttype;

        @NameInMap("redirect_uri")
        @Validation(required = true)
        public String redirecturi;

        public static Auth2RequestQuery build(java.util.Map<String, ?> map) throws Exception {
            Auth2RequestQuery self = new Auth2RequestQuery();
            return TeaModel.build(map, self);
        }

        public Auth2RequestQuery setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public Auth2RequestQuery setClientSecret(String clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public String getClientSecret() {
            return this.clientSecret;
        }

        public Auth2RequestQuery setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public Auth2RequestQuery setGranttype(String granttype) {
            this.granttype = granttype;
            return this;
        }
        public String getGranttype() {
            return this.granttype;
        }

        public Auth2RequestQuery setRedirecturi(String redirecturi) {
            this.redirecturi = redirecturi;
            return this;
        }
        public String getRedirecturi() {
            return this.redirecturi;
        }

    }

    public static class Auth2RequestBody extends TeaModel {
        public static Auth2RequestBody build(java.util.Map<String, ?> map) throws Exception {
            Auth2RequestBody self = new Auth2RequestBody();
            return TeaModel.build(map, self);
        }

    }

    public static class Auth2RequestHeaders extends TeaModel {
        public static Auth2RequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            Auth2RequestHeaders self = new Auth2RequestHeaders();
            return TeaModel.build(map, self);
        }

    }

}
