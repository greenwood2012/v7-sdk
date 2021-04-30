// This file is auto-generated, don't edit it. Thanks.
package com.jdy.v7sdk.account;

import com.aliyun.tea.*;
import com.jdy.v7sdk.account.models.*;
import com.jdy.v7sdk.*;

public class Client {

    public com.jdy.v7sdk.sdkkenerl _kernel;
    public Client(com.jdy.v7sdk.sdkkenerl kernel) throws Exception {
        this._kernel = kernel;
    }


    /**
     * get accountGroup function
     * @param request AccountGroupRequest for get AccountGroupResponse 
     * @return result result of the server
     */
    public AccountGroupResponse getAccountGroup(AccountGroupRequest request) throws Exception {
        AccountGroupRequest.AccountGroupRequestHeaders headers = new AccountGroupRequest.AccountGroupRequestHeaders();
        AccountGroupRequest.AccountGroupRequestBody body = new AccountGroupRequest.AccountGroupRequestBody();
        return TeaModel.toModel(_kernel.post("/jdy/sys/accountGroup", headers, request.query, body), new AccountGroupResponse());
    }
}
