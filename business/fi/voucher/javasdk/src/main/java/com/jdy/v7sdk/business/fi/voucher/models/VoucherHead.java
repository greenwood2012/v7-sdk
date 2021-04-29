// This file is auto-generated, don't edit it. Thanks.
package com.jdy.v7sdk.business.fi.voucher.models;

import com.aliyun.tea.*;

public class VoucherHead extends TeaModel {
    @NameInMap("id")
    @Validation(required = true)
    public Number id;

    @NameInMap("date")
    @Validation(required = true)
    public String date;

    @NameInMap("group_id")
    @Validation(required = true)
    public String groupId;

    @NameInMap("groupid_number")
    @Validation(required = true)
    public String groupNumber;

    @NameInMap("remark")
    @Validation(required = true)
    public String remark;

    @NameInMap("entries")
    @Validation(required = true)
    public java.util.List<VoucherEntry> entries;

    public static VoucherHead build(java.util.Map<String, ?> map) throws Exception {
        VoucherHead self = new VoucherHead();
        return TeaModel.build(map, self);
    }

    public VoucherHead setId(Number id) {
        this.id = id;
        return this;
    }
    public Number getId() {
        return this.id;
    }

    public VoucherHead setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public VoucherHead setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public VoucherHead setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
        return this;
    }
    public String getGroupNumber() {
        return this.groupNumber;
    }

    public VoucherHead setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public VoucherHead setEntries(java.util.List<VoucherEntry> entries) {
        this.entries = entries;
        return this;
    }
    public java.util.List<VoucherEntry> getEntries() {
        return this.entries;
    }

}
