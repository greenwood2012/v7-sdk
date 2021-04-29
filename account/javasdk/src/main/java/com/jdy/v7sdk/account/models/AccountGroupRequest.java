// This file is auto-generated, don't edit it. Thanks.
package com.jdy.v7sdk.account.models;

import com.aliyun.tea.*;

public class AccountGroupRequest extends TeaModel {
    @NameInMap("query")
    @Validation(required = true)
    public AccountGroupRequestQuery query;

    @NameInMap("body")
    @Validation(required = true)
    public AccountGroupRequestBody body;

    @NameInMap("headers")
    @Validation(required = true)
    public AccountGroupRequestHeaders headers;

    public static AccountGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AccountGroupRequest self = new AccountGroupRequest();
        return TeaModel.build(map, self);
    }

    public AccountGroupRequest setQuery(AccountGroupRequestQuery query) {
        this.query = query;
        return this;
    }
    public AccountGroupRequestQuery getQuery() {
        return this.query;
    }

    public AccountGroupRequest setBody(AccountGroupRequestBody body) {
        this.body = body;
        return this;
    }
    public AccountGroupRequestBody getBody() {
        return this.body;
    }

    public AccountGroupRequest setHeaders(AccountGroupRequestHeaders headers) {
        this.headers = headers;
        return this;
    }
    public AccountGroupRequestHeaders getHeaders() {
        return this.headers;
    }

    public static class AccountGroupRequestQuery extends TeaModel {
        @NameInMap("access_token")
        @Validation(required = true)
        public String accessToken;

        public static AccountGroupRequestQuery build(java.util.Map<String, ?> map) throws Exception {
            AccountGroupRequestQuery self = new AccountGroupRequestQuery();
            return TeaModel.build(map, self);
        }

        public AccountGroupRequestQuery setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

    }

    public static class AccountGroupRequestBody extends TeaModel {
        public static AccountGroupRequestBody build(java.util.Map<String, ?> map) throws Exception {
            AccountGroupRequestBody self = new AccountGroupRequestBody();
            return TeaModel.build(map, self);
        }

    }

    public static class AccountGroupRequestHeaders extends TeaModel {
        public static AccountGroupRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            AccountGroupRequestHeaders self = new AccountGroupRequestHeaders();
            return TeaModel.build(map, self);
        }

    }

}
