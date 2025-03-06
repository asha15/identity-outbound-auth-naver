/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.application.authenticator.naver;

/*
 * Constant class for NaverCustomAuthenticator.
 */
public class NaverCustomAuthenticatorConstants {

    public static final String ACCESS_TOKEN_PARAM = "accessToken";
    public static final String AUTHENTICATOR_NAME = "NAVER";
    public static final String AUTHENTICATOR_I18N_KEY = "authenticator.naver";
    public static final String OAUTH2 = "oauth2";
    public static final String OAUTH2_GRANT_TYPE_CODE = "code";
    public static final String OAUTH2_PARAM_STATE = "state";
    public static final String AUTHENTICATOR_MESSAGE = "authenticatorMessage";
    public static final String CALLBACK_URL = "CallbackUrl";
    public static final String CLIENT_ID = "ClientId";
    public static final String CLIENT_ID_PARAM = "clientId";
    public static final String CLIENT_SECRET = "ClientSecret";
    public static final String ID_TOKEN_PARAM = "idToken";
    public static final String IS_BASIC_AUTH_ENABLED = "IsBasicAuthEnabled";
    public static final String IS_API_BASED = "IS_API_BASED";
    public static final String NV_USER_ID = "id";
    public static final String NV_TOKEN_URL = "https://nid.naver.com/oauth2.0/token";
    public static final String NV_USER_INFO_URL = "https://openapi.naver.com/v1/nid/me";
    public static final String NV_AUTH_URL = "https://nid.naver.com/oauth2.0/authorize";
    public static final String REDIRECT_URL_SUFFIX = "_redirect_url";
    public static final String REDIRECT_URL = "REDIRECT_URL";
}
