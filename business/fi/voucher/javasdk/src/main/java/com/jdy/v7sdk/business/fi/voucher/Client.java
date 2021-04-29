// This file is auto-generated, don't edit it. Thanks.
package com.jdy.v7sdk.business.fi.voucher;

import com.aliyun.tea.*;
import com.jdy.v7sdk.business.fi.voucher.models.*;
import com.jdy.v7sdk.sdkkenerl.*;

public class Client {

    public com.jdy.v7sdk.sdkkenerl.Client _kernel;
    public Client(com.jdy.v7sdk.sdkkenerl.Client kernel) throws Exception {
        this._kernel = kernel;
    }


    public ApiResponse saveVoucher(VoucherSaveRequest request) throws Exception {
        return TeaModel.toModel(_kernel.post("/jdy/gl/voucher_save", request.headers, request.query, request.body), new ApiResponse());
    }
}
