// This file is auto-generated, don't edit it. Thanks.
package com.jdy.v7sdk.business.fi.voucher.models;

import com.aliyun.tea.*;

public class ApiResponse extends TeaModel {
    @NameInMap("errorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("message")
    @Validation(required = true)
    public String message;

    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("data")
    @Validation(required = true)
    public Object data;

    public static ApiResponse build(java.util.Map<String, ?> map) throws Exception {
        ApiResponse self = new ApiResponse();
        return TeaModel.build(map, self);
    }

    public ApiResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ApiResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApiResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ApiResponse setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

}
