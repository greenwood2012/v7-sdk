// This file is auto-generated, don't edit it. Thanks.
package com.jdy.v7sdk.account.models;

import com.aliyun.tea.*;

public class AccountGroupResponse extends TeaModel {
    @NameInMap("data")
    @Validation(required = true)
    public java.util.List<AccountGroupResponseData> data;

    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("errorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("message")
    @Validation(required = true)
    public String message;

    public static AccountGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AccountGroupResponse self = new AccountGroupResponse();
        return TeaModel.build(map, self);
    }

    public AccountGroupResponse setData(java.util.List<AccountGroupResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AccountGroupResponseData> getData() {
        return this.data;
    }

    public AccountGroupResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AccountGroupResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AccountGroupResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public static class AccountGroupResponseDataAccountGroups extends TeaModel {
        @NameInMap("accountName")
        @Validation(required = true)
        public String accountName;

        @NameInMap("accountId")
        @Validation(required = true)
        public String accountId;

        @NameInMap("enable")
        @Validation(required = true)
        public String enable;

        @NameInMap("groupId")
        @Validation(required = true)
        public String groupId;

        @NameInMap("groupName")
        @Validation(required = true)
        public String groupName;

        public static AccountGroupResponseDataAccountGroups build(java.util.Map<String, ?> map) throws Exception {
            AccountGroupResponseDataAccountGroups self = new AccountGroupResponseDataAccountGroups();
            return TeaModel.build(map, self);
        }

        public AccountGroupResponseDataAccountGroups setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public AccountGroupResponseDataAccountGroups setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public AccountGroupResponseDataAccountGroups setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public AccountGroupResponseDataAccountGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public AccountGroupResponseDataAccountGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class AccountGroupResponseData extends TeaModel {
        @NameInMap("serviceId")
        @Validation(required = true)
        public String serviceId;

        @NameInMap("accountGroups")
        @Validation(required = true)
        public java.util.List<AccountGroupResponseDataAccountGroups> accountGroups;

        public static AccountGroupResponseData build(java.util.Map<String, ?> map) throws Exception {
            AccountGroupResponseData self = new AccountGroupResponseData();
            return TeaModel.build(map, self);
        }

        public AccountGroupResponseData setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public AccountGroupResponseData setAccountGroups(java.util.List<AccountGroupResponseDataAccountGroups> accountGroups) {
            this.accountGroups = accountGroups;
            return this;
        }
        public java.util.List<AccountGroupResponseDataAccountGroups> getAccountGroups() {
            return this.accountGroups;
        }

    }

}
