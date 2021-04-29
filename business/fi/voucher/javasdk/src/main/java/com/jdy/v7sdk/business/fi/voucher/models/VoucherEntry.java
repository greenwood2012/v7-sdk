// This file is auto-generated, don't edit it. Thanks.
package com.jdy.v7sdk.business.fi.voucher.models;

import com.aliyun.tea.*;

public class VoucherEntry extends TeaModel {
    @NameInMap("id")
    @Validation(required = true)
    public Number id;

    @NameInMap("dc")
    @Validation(required = true)
    public String dc;

    @NameInMap("explanation")
    @Validation(required = true)
    public String explanation;

    @NameInMap("debitamount")
    @Validation(required = true)
    public String debitamount;

    @NameInMap("creditamount")
    @Validation(required = true)
    public String creditamount;

    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    @NameInMap("account_number")
    public String accountNumber;

    public static VoucherEntry build(java.util.Map<String, ?> map) throws Exception {
        VoucherEntry self = new VoucherEntry();
        return TeaModel.build(map, self);
    }

    public VoucherEntry setId(Number id) {
        this.id = id;
        return this;
    }
    public Number getId() {
        return this.id;
    }

    public VoucherEntry setDc(String dc) {
        this.dc = dc;
        return this;
    }
    public String getDc() {
        return this.dc;
    }

    public VoucherEntry setExplanation(String explanation) {
        this.explanation = explanation;
        return this;
    }
    public String getExplanation() {
        return this.explanation;
    }

    public VoucherEntry setDebitamount(String debitamount) {
        this.debitamount = debitamount;
        return this;
    }
    public String getDebitamount() {
        return this.debitamount;
    }

    public VoucherEntry setCreditamount(String creditamount) {
        this.creditamount = creditamount;
        return this;
    }
    public String getCreditamount() {
        return this.creditamount;
    }

    public VoucherEntry setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public VoucherEntry setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }

}
