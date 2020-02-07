/*
 * Telstra Messaging API
 * The Telstra Messaging API specification
 *
 * The version of the OpenAPI document: 2.2.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.telstra.messaging;

import com.telstra.ApiCallback;
import com.telstra.ApiClient;
import com.telstra.ApiException;
import com.telstra.ApiResponse;
import com.telstra.Configuration;
import com.telstra.Pair;
import com.telstra.ProgressRequestBody;
import com.telstra.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.telstra.models.DeleteNumberRequest;
import com.telstra.models.GetSubscriptionResponse;
import com.telstra.models.ProvisionNumberRequest;
import com.telstra.models.ProvisionNumberResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProvisioningApi {
    private ApiClient localVarApiClient;

    public ProvisioningApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProvisioningApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for createSubscription
     * @param body A JSON payload containing the required attributes (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid or missing request parameters </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid access token. Please try with a valid token </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization credentials passed and accepted but account does not have permission  SpikeArrest-The API call rate limit has been exceeded </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested URI does not exist  RESOURCE-NOT-FOUND  </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Active Days Max. You can no longer update or add to activeDays because it already exceeds more than 5 years. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Technical error : Unable to route the message to a Target Endpoint : An error has occurred while processing your request, please refer to API Docs for summary on the issue  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An internal error occurred when processing the request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createSubscriptionCall(ProvisionNumberRequest body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/messages/provisioning/subscriptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "auth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createSubscriptionValidateBeforeCall(ProvisionNumberRequest body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createSubscription(Async)");
        }
        

        okhttp3.Call localVarCall = createSubscriptionCall(body, _callback);
        return localVarCall;

    }

    /**
     * Create Subscription
     * Invoke the provisioning API to get a dedicated mobile number for an account or application.  Note that Free Trial apps will have a 30-Day Limit for their provisioned number. If the Provisioning call is made several times within that 30-Day period, it will return the &#x60;expiryDate&#x60; in the Unix format and will not add any activeDays until after that &#x60;expiryDate&#x60;. After the &#x60;expiryDate&#x60;, you may make another Provisioning call to extend the activeDays by another 30-Days.  For paid apps, a provisioned number can be allotted for a maximum of 5 years. If a Provisioning call is made which will result to activeDays &gt; 1825, a 409 &#x60;Active Days Max&#x60; response will be returned to indicate that the provisioned number is already valid for more than 5 years and that no update to activeDays has been made. 
     * @param body A JSON payload containing the required attributes (required)
     * @return ProvisionNumberResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid or missing request parameters </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid access token. Please try with a valid token </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization credentials passed and accepted but account does not have permission  SpikeArrest-The API call rate limit has been exceeded </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested URI does not exist  RESOURCE-NOT-FOUND  </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Active Days Max. You can no longer update or add to activeDays because it already exceeds more than 5 years. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Technical error : Unable to route the message to a Target Endpoint : An error has occurred while processing your request, please refer to API Docs for summary on the issue  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An internal error occurred when processing the request </td><td>  -  </td></tr>
     </table>
     */
    public ProvisionNumberResponse createSubscription(ProvisionNumberRequest body) throws ApiException {
        ApiResponse<ProvisionNumberResponse> localVarResp = createSubscriptionWithHttpInfo(body);
        return localVarResp.getData();
    }

    /**
     * Create Subscription
     * Invoke the provisioning API to get a dedicated mobile number for an account or application.  Note that Free Trial apps will have a 30-Day Limit for their provisioned number. If the Provisioning call is made several times within that 30-Day period, it will return the &#x60;expiryDate&#x60; in the Unix format and will not add any activeDays until after that &#x60;expiryDate&#x60;. After the &#x60;expiryDate&#x60;, you may make another Provisioning call to extend the activeDays by another 30-Days.  For paid apps, a provisioned number can be allotted for a maximum of 5 years. If a Provisioning call is made which will result to activeDays &gt; 1825, a 409 &#x60;Active Days Max&#x60; response will be returned to indicate that the provisioned number is already valid for more than 5 years and that no update to activeDays has been made. 
     * @param body A JSON payload containing the required attributes (required)
     * @return ApiResponse&lt;ProvisionNumberResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid or missing request parameters </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid access token. Please try with a valid token </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization credentials passed and accepted but account does not have permission  SpikeArrest-The API call rate limit has been exceeded </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested URI does not exist  RESOURCE-NOT-FOUND  </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Active Days Max. You can no longer update or add to activeDays because it already exceeds more than 5 years. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Technical error : Unable to route the message to a Target Endpoint : An error has occurred while processing your request, please refer to API Docs for summary on the issue  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An internal error occurred when processing the request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ProvisionNumberResponse> createSubscriptionWithHttpInfo(ProvisionNumberRequest body) throws ApiException {
        okhttp3.Call localVarCall = createSubscriptionValidateBeforeCall(body, null);
        Type localVarReturnType = new TypeToken<ProvisionNumberResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create Subscription (asynchronously)
     * Invoke the provisioning API to get a dedicated mobile number for an account or application.  Note that Free Trial apps will have a 30-Day Limit for their provisioned number. If the Provisioning call is made several times within that 30-Day period, it will return the &#x60;expiryDate&#x60; in the Unix format and will not add any activeDays until after that &#x60;expiryDate&#x60;. After the &#x60;expiryDate&#x60;, you may make another Provisioning call to extend the activeDays by another 30-Days.  For paid apps, a provisioned number can be allotted for a maximum of 5 years. If a Provisioning call is made which will result to activeDays &gt; 1825, a 409 &#x60;Active Days Max&#x60; response will be returned to indicate that the provisioned number is already valid for more than 5 years and that no update to activeDays has been made. 
     * @param body A JSON payload containing the required attributes (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid or missing request parameters </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid access token. Please try with a valid token </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization credentials passed and accepted but account does not have permission  SpikeArrest-The API call rate limit has been exceeded </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested URI does not exist  RESOURCE-NOT-FOUND  </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> Active Days Max. You can no longer update or add to activeDays because it already exceeds more than 5 years. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Technical error : Unable to route the message to a Target Endpoint : An error has occurred while processing your request, please refer to API Docs for summary on the issue  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An internal error occurred when processing the request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createSubscriptionAsync(ProvisionNumberRequest body, final ApiCallback<ProvisionNumberResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createSubscriptionValidateBeforeCall(body, _callback);
        Type localVarReturnType = new TypeToken<ProvisionNumberResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteSubscription
     * @param body EmptyArr (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid or missing request parameters </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid access token. Please try with a valid token </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization credentials passed and accepted but account does not have permission  SpikeArrest-The API call rate limit has been exceeded </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested URI does not exist  RESOURCE-NOT-FOUND </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Technical error : Unable to route the message to a Target Endpoint : An error has occurred while processing your request, please refer to API Docs for summary on the issue </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An internal error occurred when processing the request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteSubscriptionCall(DeleteNumberRequest body, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/messages/provisioning/subscriptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "auth" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteSubscriptionValidateBeforeCall(DeleteNumberRequest body, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling deleteSubscription(Async)");
        }
        

        okhttp3.Call localVarCall = deleteSubscriptionCall(body, _callback);
        return localVarCall;

    }

    /**
     * Delete Subscription
     * Delete a mobile number subscription from an account 
     * @param body EmptyArr (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid or missing request parameters </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid access token. Please try with a valid token </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization credentials passed and accepted but account does not have permission  SpikeArrest-The API call rate limit has been exceeded </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested URI does not exist  RESOURCE-NOT-FOUND </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Technical error : Unable to route the message to a Target Endpoint : An error has occurred while processing your request, please refer to API Docs for summary on the issue </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An internal error occurred when processing the request </td><td>  -  </td></tr>
     </table>
     */
    public void deleteSubscription(DeleteNumberRequest body) throws ApiException {
        deleteSubscriptionWithHttpInfo(body);
    }

    /**
     * Delete Subscription
     * Delete a mobile number subscription from an account 
     * @param body EmptyArr (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid or missing request parameters </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid access token. Please try with a valid token </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization credentials passed and accepted but account does not have permission  SpikeArrest-The API call rate limit has been exceeded </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested URI does not exist  RESOURCE-NOT-FOUND </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Technical error : Unable to route the message to a Target Endpoint : An error has occurred while processing your request, please refer to API Docs for summary on the issue </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An internal error occurred when processing the request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteSubscriptionWithHttpInfo(DeleteNumberRequest body) throws ApiException {
        okhttp3.Call localVarCall = deleteSubscriptionValidateBeforeCall(body, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete Subscription (asynchronously)
     * Delete a mobile number subscription from an account 
     * @param body EmptyArr (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> No Content </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid or missing request parameters </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid access token. Please try with a valid token </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization credentials passed and accepted but account does not have permission  SpikeArrest-The API call rate limit has been exceeded </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested URI does not exist  RESOURCE-NOT-FOUND </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Technical error : Unable to route the message to a Target Endpoint : An error has occurred while processing your request, please refer to API Docs for summary on the issue </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An internal error occurred when processing the request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteSubscriptionAsync(DeleteNumberRequest body, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteSubscriptionValidateBeforeCall(body, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSubscription
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid or missing request parameters </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid access token. Please try with a valid token </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization credentials passed and accepted but account does not have permission  SpikeArrest-The API call rate limit has been exceeded </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested URI does not exist  RESOURCE-NOT-FOUND </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Technical error : Unable to route the message to a Target Endpoint : An error has occurred while processing your request, please refer to API Docs for summary on the issue </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An internal error occurred when processing the request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSubscriptionCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/messages/provisioning/subscriptions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "auth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSubscriptionValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        

        okhttp3.Call localVarCall = getSubscriptionCall(_callback);
        return localVarCall;

    }

    /**
     * Get Subscription
     * Get mobile number subscription for an account 
     * @return GetSubscriptionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid or missing request parameters </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid access token. Please try with a valid token </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization credentials passed and accepted but account does not have permission  SpikeArrest-The API call rate limit has been exceeded </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested URI does not exist  RESOURCE-NOT-FOUND </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Technical error : Unable to route the message to a Target Endpoint : An error has occurred while processing your request, please refer to API Docs for summary on the issue </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An internal error occurred when processing the request </td><td>  -  </td></tr>
     </table>
     */
    public GetSubscriptionResponse getSubscription() throws ApiException {
        ApiResponse<GetSubscriptionResponse> localVarResp = getSubscriptionWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get Subscription
     * Get mobile number subscription for an account 
     * @return ApiResponse&lt;GetSubscriptionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid or missing request parameters </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid access token. Please try with a valid token </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization credentials passed and accepted but account does not have permission  SpikeArrest-The API call rate limit has been exceeded </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested URI does not exist  RESOURCE-NOT-FOUND </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Technical error : Unable to route the message to a Target Endpoint : An error has occurred while processing your request, please refer to API Docs for summary on the issue </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An internal error occurred when processing the request </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetSubscriptionResponse> getSubscriptionWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getSubscriptionValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<GetSubscriptionResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Subscription (asynchronously)
     * Get mobile number subscription for an account 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid or missing request parameters </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Invalid access token. Please try with a valid token </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Authorization credentials passed and accepted but account does not have permission  SpikeArrest-The API call rate limit has been exceeded </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> The requested URI does not exist  RESOURCE-NOT-FOUND </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Technical error : Unable to route the message to a Target Endpoint : An error has occurred while processing your request, please refer to API Docs for summary on the issue </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> An internal error occurred when processing the request </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSubscriptionAsync(final ApiCallback<GetSubscriptionResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSubscriptionValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<GetSubscriptionResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
