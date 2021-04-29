// This file is auto-generated, don't edit it. Thanks.
package com.jdy.v7sdk.auth.models;

import com.aliyun.tea.*;

/**
* auth api response，used to get accesstoken
*/
public class TokenResponse extends TeaModel {
    @NameInMap("errcode")
    @Validation(required = true)
    public Number errcode;

    @NameInMap("description")
    @Validation(required = true)
    public String description;

    @NameInMap("data")
    @Validation(required = true)
    public TokenResponseData data;

    public static TokenResponse build(java.util.Map<String, ?> map) throws Exception {
        TokenResponse self = new TokenResponse();
        return TeaModel.build(map, self);
    }

    public TokenResponse setErrcode(Number errcode) {
        this.errcode = errcode;
        return this;
    }
    public Number getErrcode() {
        return this.errcode;
    }

    public TokenResponse setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public TokenResponse setData(TokenResponseData data) {
        this.data = data;
        return this;
    }
    public TokenResponseData getData() {
        return this.data;
    }

    public static class TokenResponseData extends TeaModel {
        @NameInMap("access_token")
        @Validation(required = true)
        public String accessToken;

        @NameInMap("avatar")
        @Validation(required = true)
        public String avatar;

        @NameInMap("expires")
        @Validation(required = true)
        public Number expires;

        @NameInMap("expires_in")
        @Validation(required = true)
        public Number expiresIn;

        @NameInMap("gender")
        @Validation(required = true)
        public Number gender;

        @NameInMap("nickname")
        @Validation(required = true)
        public String nickname;

        @NameInMap("uid")
        @Validation(required = true)
        public Number uid;

        public static TokenResponseData build(java.util.Map<String, ?> map) throws Exception {
            TokenResponseData self = new TokenResponseData();
            return TeaModel.build(map, self);
        }

        public TokenResponseData setAccessToken(String accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public String getAccessToken() {
            return this.accessToken;
        }

        public TokenResponseData setAvatar(String avatar) {
            this.avatar = avatar;
            return this;
        }
        public String getAvatar() {
            return this.avatar;
        }

        public TokenResponseData setExpires(Number expires) {
            this.expires = expires;
            return this;
        }
        public Number getExpires() {
            return this.expires;
        }

        public TokenResponseData setExpiresIn(Number expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }
        public Number getExpiresIn() {
            return this.expiresIn;
        }

        public TokenResponseData setGender(Number gender) {
            this.gender = gender;
            return this;
        }
        public Number getGender() {
            return this.gender;
        }

        public TokenResponseData setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }
        public String getNickname() {
            return this.nickname;
        }

        public TokenResponseData setUid(Number uid) {
            this.uid = uid;
            return this;
        }
        public Number getUid() {
            return this.uid;
        }

    }

}
