// This file is auto-generated, don't edit it. Thanks.
package com.jdy.v7sdk.business.fi.voucher.models;

import com.aliyun.tea.*;

public class VoucherSaveRequest extends TeaModel {
    @NameInMap("query")
    @Validation(required = true)
    public VoucherSaveRequestQuery query;

    @NameInMap("body")
    @Validation(required = true)
    public VoucherSaveRequestBody body;

    @NameInMap("headers")
    @Validation(required = true)
    public VoucherSaveRequestHeaders headers;

    public static VoucherSaveRequest build(java.util.Map<String, ?> map) throws Exception {
        VoucherSaveRequest self = new VoucherSaveRequest();
        return TeaModel.build(map, self);
    }

    public VoucherSaveRequest setQuery(VoucherSaveRequestQuery query) {
        this.query = query;
        return this;
    }
    public VoucherSaveRequestQuery getQuery() {
        return this.query;
    }

    public VoucherSaveRequest setBody(VoucherSaveRequestBody body) {
        this.body = body;
        return this;
    }
    public VoucherSaveRequestBody getBody() {
        return this.body;
    }

    public VoucherSaveRequest setHeaders(VoucherSaveRequestHeaders headers) {
        this.headers = headers;
        return this;
    }
    public VoucherSaveRequestHeaders getHeaders() {
        return this.headers;
    }

    public static class VoucherSaveRequestQuery extends TeaModel {
        @NameInMap("access_token")
        @Validation(required = true)
        public String accessToken;

        public static VoucherSaveRequestQuery build(java.util.Map<String, ?> map) throws Exception {
            VoucherSaveRequestQuery self = new VoucherSaveRequestQuery();
            return TeaModel.build(map, self);
        }

        public VoucherSaveRequestQuery setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

    }

    public static class VoucherSaveRequestBody extends TeaModel {
        @NameInMap("items")
        @Validation(required = true)
        public java.util.List<VoucherHead> items;

        public static VoucherSaveRequestBody build(java.util.Map<String, ?> map) throws Exception {
            VoucherSaveRequestBody self = new VoucherSaveRequestBody();
            return TeaModel.build(map, self);
        }

        public VoucherSaveRequestBody setItems(java.util.List<VoucherHead> items) {
            this.items = items;
            return this;
        }
        public java.util.List<VoucherHead> getItems() {
            return this.items;
        }

    }

    public static class VoucherSaveRequestHeaders extends TeaModel {
        @NameInMap("groupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("accountId")
        @Validation(required = true)
        public String accountId;

        public static VoucherSaveRequestHeaders build(java.util.Map<String, ?> map) throws Exception {
            VoucherSaveRequestHeaders self = new VoucherSaveRequestHeaders();
            return TeaModel.build(map, self);
        }

        public VoucherSaveRequestHeaders setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public VoucherSaveRequestHeaders setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

    }

}
