// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;

using Tea;
using Tea.Utils;

using com.jdy.v7sdk.sdkkenerl.Models;

namespace com.jdy.v7sdk.sdkkenerl
{
    public class Client 
    {
        protected string _server_host;
        protected string _protocol;

        /**
         * init the client
         * @param config Config of the config
         */
        public Client(Config config)
        {
            this._server_host = config.Host;
            this._protocol = config.Protocol;
        }

        /**
         * the api use to deal with get request
         * @param pathname pathname of the get api
         * @param query the model of query params 
         * @return result result of the server
         */
        public Dictionary<string, object> _get(string pathname, $Model headers, $Model query)
        {
            headers.Validate();
            query.Validate();
            Dictionary<string, object> runtime_ = new Dictionary<string, object>
            {
                {"connectTimeout", 15000},
                {"readTimeout", 15000},
                {"retry", new Dictionary<string, int?>
                {
                    {"maxAttempts", 0},
                }},
            };

            TeaRequest _lastRequest = null;
            Exception _lastException = null;
            long _now = System.DateTime.Now.Millisecond;
            int _retryTimes = 0;
            while (TeaCore.AllowRetry((IDictionary) runtime_["retry"], _retryTimes, _now))
            {
                if (_retryTimes > 0)
                {
                    int backoffTime = TeaCore.GetBackoffTime((IDictionary)runtime_["backoff"], _retryTimes);
                    if (backoffTime > 0)
                    {
                        TeaCore.Sleep(backoffTime);
                    }
                }
                _retryTimes = _retryTimes + 1;
                try
                {
                    TeaRequest request_ = new TeaRequest();
                    request_.Method = "GET";
                    request_.Protocol = _protocol;
                    request_.Pathname = pathname;
                    request_.Headers = new Dictionary<string, string>
                    {
                        {"host", _server_host},
                    };
                    Dictionary<string, string> headersMap = AlibabaCloud.TeaUtil.Common.StringifyMapValue(query.ToMap());
                    if (!AlibabaCloud.TeaUtil.Common.Empty(headersMap.Get("accountId")))
                    {
                        request_.Headers["accountId"] = headersMap.Get("accountId");
                    }
                    if (!AlibabaCloud.TeaUtil.Common.Empty(headersMap.Get("groupName")))
                    {
                        request_.Headers["groupName"] = headersMap.Get("groupName");
                    }
                    request_.Query = AlibabaCloud.TeaUtil.Common.StringifyMapValue(query.ToMap());
                    _lastRequest = request_;
                    TeaResponse response_ = TeaCore.DoAction(request_, runtime_);

                    return _handle(response_);
                }
                catch (Exception e)
                {
                    if (TeaCore.IsRetryable(e))
                    {
                        _lastException = e;
                        continue;
                    }
                    throw e;
                }
            }

            throw new TeaUnretryableException(_lastRequest, _lastException);
        }

        /**
         * the api use to deal with get request
         * @param pathname pathname of the get api
         * @param query the model of query params 
         * @return result result of the server
         */
        public async Task<Dictionary<string, object>> _getAsync(string pathname, $Model headers, $Model query)
        {
            headers.Validate();
            query.Validate();
            Dictionary<string, object> runtime_ = new Dictionary<string, object>
            {
                {"connectTimeout", 15000},
                {"readTimeout", 15000},
                {"retry", new Dictionary<string, int?>
                {
                    {"maxAttempts", 0},
                }},
            };

            TeaRequest _lastRequest = null;
            Exception _lastException = null;
            long _now = System.DateTime.Now.Millisecond;
            int _retryTimes = 0;
            while (TeaCore.AllowRetry((IDictionary) runtime_["retry"], _retryTimes, _now))
            {
                if (_retryTimes > 0)
                {
                    int backoffTime = TeaCore.GetBackoffTime((IDictionary)runtime_["backoff"], _retryTimes);
                    if (backoffTime > 0)
                    {
                        TeaCore.Sleep(backoffTime);
                    }
                }
                _retryTimes = _retryTimes + 1;
                try
                {
                    TeaRequest request_ = new TeaRequest();
                    request_.Method = "GET";
                    request_.Protocol = _protocol;
                    request_.Pathname = pathname;
                    request_.Headers = new Dictionary<string, string>
                    {
                        {"host", _server_host},
                    };
                    Dictionary<string, string> headersMap = AlibabaCloud.TeaUtil.Common.StringifyMapValue(query.ToMap());
                    if (!AlibabaCloud.TeaUtil.Common.Empty(headersMap.Get("accountId")))
                    {
                        request_.Headers["accountId"] = headersMap.Get("accountId");
                    }
                    if (!AlibabaCloud.TeaUtil.Common.Empty(headersMap.Get("groupName")))
                    {
                        request_.Headers["groupName"] = headersMap.Get("groupName");
                    }
                    request_.Query = AlibabaCloud.TeaUtil.Common.StringifyMapValue(query.ToMap());
                    _lastRequest = request_;
                    TeaResponse response_ = await TeaCore.DoActionAsync(request_, runtime_);

                    return await _handleAsync(response_);
                }
                catch (Exception e)
                {
                    if (TeaCore.IsRetryable(e))
                    {
                        _lastException = e;
                        continue;
                    }
                    throw e;
                }
            }

            throw new TeaUnretryableException(_lastRequest, _lastException);
        }

        /**
         * the api use to deal with post request
         * @param pathname pathname of the post api
         * @param query the model of body params 
         * @param body the model of body body 
         * @return result result of the server
         */
        public Dictionary<string, object> _post(string pathname, $Model headers, $Model query, $Model body)
        {
            headers.Validate();
            query.Validate();
            body.Validate();
            Dictionary<string, object> runtime_ = new Dictionary<string, object>
            {
                {"connectTimeout", 15000},
                {"readTimeout", 15000},
                {"retry", new Dictionary<string, int?>
                {
                    {"maxAttempts", 0},
                }},
            };

            TeaRequest _lastRequest = null;
            Exception _lastException = null;
            long _now = System.DateTime.Now.Millisecond;
            int _retryTimes = 0;
            while (TeaCore.AllowRetry((IDictionary) runtime_["retry"], _retryTimes, _now))
            {
                if (_retryTimes > 0)
                {
                    int backoffTime = TeaCore.GetBackoffTime((IDictionary)runtime_["backoff"], _retryTimes);
                    if (backoffTime > 0)
                    {
                        TeaCore.Sleep(backoffTime);
                    }
                }
                _retryTimes = _retryTimes + 1;
                try
                {
                    TeaRequest request_ = new TeaRequest();
                    request_.Method = "POST";
                    request_.Protocol = _protocol;
                    request_.Pathname = pathname;
                    request_.Headers = new Dictionary<string, string>
                    {
                        {"host", _server_host},
                        {"content-type", "application/json; charset=utf-8"},
                    };
                    Dictionary<string, string> headersMap = AlibabaCloud.TeaUtil.Common.StringifyMapValue(headers.ToMap());
                    if (!AlibabaCloud.TeaUtil.Common.Empty(headersMap.Get("accountId")))
                    {
                        request_.Headers["accountId"] = headersMap.Get("accountId");
                    }
                    if (!AlibabaCloud.TeaUtil.Common.Empty(headersMap.Get("groupName")))
                    {
                        request_.Headers["groupName"] = headersMap.Get("groupName");
                    }
                    request_.Body = TeaCore.BytesReadable(AlibabaCloud.TeaUtil.Common.ToJSONString(body.ToMap()));
                    request_.Query = AlibabaCloud.TeaUtil.Common.StringifyMapValue(query.ToMap());
                    _lastRequest = request_;
                    TeaResponse response_ = TeaCore.DoAction(request_, runtime_);

                    return _handle(response_);
                }
                catch (Exception e)
                {
                    if (TeaCore.IsRetryable(e))
                    {
                        _lastException = e;
                        continue;
                    }
                    throw e;
                }
            }

            throw new TeaUnretryableException(_lastRequest, _lastException);
        }

        /**
         * the api use to deal with post request
         * @param pathname pathname of the post api
         * @param query the model of body params 
         * @param body the model of body body 
         * @return result result of the server
         */
        public async Task<Dictionary<string, object>> _postAsync(string pathname, $Model headers, $Model query, $Model body)
        {
            headers.Validate();
            query.Validate();
            body.Validate();
            Dictionary<string, object> runtime_ = new Dictionary<string, object>
            {
                {"connectTimeout", 15000},
                {"readTimeout", 15000},
                {"retry", new Dictionary<string, int?>
                {
                    {"maxAttempts", 0},
                }},
            };

            TeaRequest _lastRequest = null;
            Exception _lastException = null;
            long _now = System.DateTime.Now.Millisecond;
            int _retryTimes = 0;
            while (TeaCore.AllowRetry((IDictionary) runtime_["retry"], _retryTimes, _now))
            {
                if (_retryTimes > 0)
                {
                    int backoffTime = TeaCore.GetBackoffTime((IDictionary)runtime_["backoff"], _retryTimes);
                    if (backoffTime > 0)
                    {
                        TeaCore.Sleep(backoffTime);
                    }
                }
                _retryTimes = _retryTimes + 1;
                try
                {
                    TeaRequest request_ = new TeaRequest();
                    request_.Method = "POST";
                    request_.Protocol = _protocol;
                    request_.Pathname = pathname;
                    request_.Headers = new Dictionary<string, string>
                    {
                        {"host", _server_host},
                        {"content-type", "application/json; charset=utf-8"},
                    };
                    Dictionary<string, string> headersMap = AlibabaCloud.TeaUtil.Common.StringifyMapValue(headers.ToMap());
                    if (!AlibabaCloud.TeaUtil.Common.Empty(headersMap.Get("accountId")))
                    {
                        request_.Headers["accountId"] = headersMap.Get("accountId");
                    }
                    if (!AlibabaCloud.TeaUtil.Common.Empty(headersMap.Get("groupName")))
                    {
                        request_.Headers["groupName"] = headersMap.Get("groupName");
                    }
                    request_.Body = TeaCore.BytesReadable(AlibabaCloud.TeaUtil.Common.ToJSONString(body.ToMap()));
                    request_.Query = AlibabaCloud.TeaUtil.Common.StringifyMapValue(query.ToMap());
                    _lastRequest = request_;
                    TeaResponse response_ = await TeaCore.DoActionAsync(request_, runtime_);

                    return await _handleAsync(response_);
                }
                catch (Exception e)
                {
                    if (TeaCore.IsRetryable(e))
                    {
                        _lastException = e;
                        continue;
                    }
                    throw e;
                }
            }

            throw new TeaUnretryableException(_lastRequest, _lastException);
        }

        public Dictionary<string, object> Get(string api, $Model headers, $Model query)
        {
            return _get(api, headers, query);
        }

        public async Task<Dictionary<string, object>> GetAsync(string api, $Model headers, $Model query)
        {
            return await _getAsync(api, headers, query);
        }

        public Dictionary<string, object> Post(string api, $Model headers, $Model query, $Model body)
        {
            return _post(api, headers, query, body);
        }

        public async Task<Dictionary<string, object>> PostAsync(string api, $Model headers, $Model query, $Model body)
        {
            return await _postAsync(api, headers, query, body);
        }

        /**
         * the handler use to deal with the response
         * @param response from tea repository server
         * @return result result of the server
         */
        public Dictionary<string, object> _handle(TeaResponse response)
        {
            Dictionary<string, object> result = AlibabaCloud.TeaUtil.Common.AssertAsMap(AlibabaCloud.TeaUtil.Common.ReadAsJSON(response.Body));
            if (!AlibabaCloud.TeaUtil.Common.EqualNumber(response.StatusCode, 200))
            {
                throw new TeaException(new Dictionary<string, string>
                {
                    {"message", "code: " + response.StatusCode + ", " + result.Get("code") + " reason: " + result.Get("message")},
                    {"code", "" + result.Get("code")},
                });
            }
            return result;
        }

        /**
         * the handler use to deal with the response
         * @param response from tea repository server
         * @return result result of the server
         */
        public async Task<Dictionary<string, object>> _handleAsync(TeaResponse response)
        {
            Dictionary<string, object> result = AlibabaCloud.TeaUtil.Common.AssertAsMap(AlibabaCloud.TeaUtil.Common.ReadAsJSON(response.Body));
            if (!AlibabaCloud.TeaUtil.Common.EqualNumber(response.StatusCode, 200))
            {
                throw new TeaException(new Dictionary<string, string>
                {
                    {"message", "code: " + response.StatusCode + ", " + result.Get("code") + " reason: " + result.Get("message")},
                    {"code", "" + result.Get("code")},
                });
            }
            return result;
        }

    }
}
