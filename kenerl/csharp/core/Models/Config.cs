// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace com.jdy.v7sdk.sdkkenerl.Models
{
    public class Config : TeaModel {
        [NameInMap("host")]
        [Validation(Required=true)]
        public string Host { get; set; }

        [NameInMap("protocol")]
        [Validation(Required=true)]
        public string Protocol { get; set; }

    }

}
