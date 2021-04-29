// This file is auto-generated, don't edit it. Thanks.
package com.jdy.v7sdk.auth.models;

import com.aliyun.tea.*;

public class ApiRequest extends TeaModel {
    @NameInMap("query")
    @Validation(required = true)
    public ApiRequestQuery query;

    @NameInMap("body")
    @Validation(required = true)
    public ApiRequestBody body;

    @NameInMap("headers")
    @Validation(required = true)
    public ApiRequestHeaders headers;

    public static ApiRequest build(java.util.Map<String, ?> map) throws Exception {
        ApiRequest self = new ApiRequest();
        return TeaModel.build(map, self);
    }

    public ApiRequest setQuery(ApiRequestQuery query) {
        this.query = query;
        return this;
    }
    public ApiRequestQuery getQuery() {
        return this.query;
    }

    public ApiRequest setBody(ApiRequestBody body) {
        this.body = body;
        return this;
    }
    public ApiRequestBody getBody() {
        return this.body;
    }

    public ApiRequest setHeaders(ApiRequestHeaders headers) {
        this.headers = headers;
        return this;
    }
    public ApiRequestHeaders getHeaders() {
        return this.headers;
    }

    public static class ApiRequestQuery extends TeaModel {
        public static ApiRequestQuery build(java.util.Map<String, ?> map) throws Exception {
            ApiRequestQuery self = new ApiRequestQuery();
            return TeaModel.build(map, self);
        }

    }

    public static class ApiRequestBody extends TeaModel {
        public static ApiRequestBody build(java.util.Map<String, ?> map) throws Exception {
            ApiRequestBody self = new ApiRequestBody();
            return TeaModel.build(map, self);
        }

    }

    public static class ApiRequestHeaders extends TeaModel {
        public static ApiRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            ApiRequestHeaders self = new ApiRequestHeaders();
            return TeaModel.build(map, self);
        }

    }

}
