/*
 * Messaging API v3.1.0
 * Send and receive SMS & MMS programmatically, leveraging Australia's leading mobile network. With Telstra's Messaging API, we take out the complexity to allow seamless messaging integration into your app, with just a few lines of code. Our REST API is enterprise grade, allowing you to communicate with engaging SMS & MMS messaging in your web and mobile apps in near real-time on a global scale. 
 *
 * OpenAPI spec version: 3.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.telstra.messaging;
import com.telstra.*;
import java.util.UUID;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static com.telstra.messaging.AuthenticationApi.getAuthToken;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneOffset;

/**
 * API tests for MessagesApi
 */

public class MessagesApiTest {
    private ApiClient defaultClient;

    //@Before
    public void setUp() {

        defaultClient = new ApiClient();

        String clientId = "YOUR CLIENT ID";
        String clientSecret = "YOUR CLIENT SECRET";
        String grantType = "client_credentials";
        String scope = "free-trial-numbers:read free-trial-numbers:write messages:read messages:write virtual-numbers:read virtual-numbers:write reports:read reports:write";

        defaultClient.setAccessSecret(clientId, clientSecret, grantType, scope);
        defaultClient.setBasePath("https://products.api.telstra.com/v2");
        System.out.println("Setting up before each test...");
    }

    /**
     * delete a message
     * Use this endpoint to delete a message that&#x27;s been scheduled for sending, but hasn&#x27;t yet sent. 
     *
     */
    @Ignore
    public void deleteMessageByIdTest() {

        try{
            ApiClient apiClient = getAuthToken(defaultClient);
            MessagesApi messagesApi = new MessagesApi(apiClient);
            UUID messageId = UUID.fromString("e15795c1-593f-11ef-be6c-ad62561304a2");

            messagesApi.deleteMessageById(messageId);

        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
    /**
     * fetch a specific message
     * Use the **messageId** to fetch a message that&#x27;s been sent from/to your account within the last 30 days. 
     *
     */
    @Ignore
    public void getMessageByIdTest() {
        try{
            ApiClient apiClient = getAuthToken(defaultClient);
            MessagesApi messagesApi = new MessagesApi(apiClient);
            UUID messageId = UUID.fromString("b6980a40-53b8-11ef-8c15-dfa116f49bba");

            MessageGet response = messagesApi.getMessageById(messageId);
            System.out.println(response);
            assertNotNull(response.getMessageId());
        

        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
    /**
     * fetch all sent/received messages
     * Fetch messages that have been sent from/to your account in the last 30 days.
     *
     */
    @Ignore
    public void getMessagesTest() {

        try{
            ApiClient apiClient = getAuthToken(defaultClient);
            MessagesApi messagesApi = new MessagesApi(apiClient);
            Integer limit = null;
            Integer offset = null;
            String direction = null;
            String status = null;
            String filter = null;

            GetMessages200Response response = messagesApi.getMessages(limit, offset, direction, status, filter);
            System.out.println(response);
            assertNotNull(response.getMessages());

        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
    /**
     * send messages
     * Send an SMS/MMS to a mobile number, or to multiple mobile numbers.  Free Trial users can message to up to 10 unique recipient numbers for free. The first five recipients will be automatically added to your Free Trial Numbers list. Need more? Just use the POST /free-trial-numbers call to add another five.
     *          if the Api call fails
     */
    //@Test
    @Ignore
    public void sendMessagesTest() {

        try{
            ApiClient apiClient = getAuthToken(defaultClient);
            MessagesApi messagesApi = new MessagesApi(apiClient);

            List<String> toList = new ArrayList<>();
            toList.add("0400000001");
            toList.add("0400000002");
            String from = "0400000001";
            String messageContent = "Hello customer, this is from CBA to confirme your offer!";

            Multimedia multimedia = new Multimedia();
            String type = "image/jpeg";
            String fileName = "image/jpeg";
            String payload =  "iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAAHElEQVQI12P4//8/w38GIAXDIBKE0DHxgljNBAAO9TXL0Y4OHwAAAABJRU5ErkJggg==";
            multimedia.setType(type);
            multimedia.setFileName(fileName);
            multimedia.setPayload(payload);
            List<Multimedia> multimediaList = new ArrayList<>();
            multimediaList.add(multimedia);

            Integer retryTimeout = 10;

            ZonedDateTime zdt = ZonedDateTime.now(ZoneOffset.UTC);
            ZonedDateTime zdtPlusTwoDays = zdt.plusDays(2);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX");
            String scheduleSend = zdtPlusTwoDays.format(formatter);

            Boolean deliveryNotification = false;
            String statusCallbackUrl = "http://www.example.com";
            List<String> tagsList = new ArrayList<>();
            tagsList.add("laborum");
            tagsList.add("esse");
            tagsList.add("irure Lorem");
            tagsList.add("dolore aliqu");
            tagsList.add("pariatur do proident magna ut");
            tagsList.add("id sunt");
            tagsList.add("u");
            tagsList.add("tempor velit minim");
            tagsList.add("sit dolo");
            tagsList.add("laborum qui");

            SendMessagesRequest sendMessagesRequest = new SendMessagesRequest()
                    .to(toList)
                    .from(from)
                    .messageContent(messageContent)
                    .multimedia(multimediaList)
                    .retryTimeout(retryTimeout)
                    .scheduleSend(scheduleSend)
                    .deliveryNotification(deliveryNotification)
                    .statusCallbackUrl(statusCallbackUrl)
                    .tags(tagsList);


            MessageSent response = messagesApi.sendMessages(sendMessagesRequest);
            System.out.println(response);
            assertNotNull(response.getMessageId());


        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }

    /**
     * update a message
     * Need to update a message that&#x27;s scheduled for sending? You can change any of the below parameters, as long as the message hasn&#x27;t been sent yet. This request body will override the original POST/ messages call. 
     *
     */
    @Ignore
    public void updateMessageByIdTest() {

        try{
            ApiClient apiClient = getAuthToken(defaultClient);
            MessagesApi messagesApi = new MessagesApi(apiClient);
            UUID messageId = UUID.fromString("88ed8550-59cd-11ef-be6b-3de6ec7e1aaa");

            String to = "0400000001";
            String from = "0400000001";
            String messageContent = "Ut veniam in ipsum exercitation";

            Multimedia multimedia = new Multimedia();
            String type = "image/jpeg";
            String fileName = "image/jpeg";
            String payload =  "iVBORw0KGgoAAAANSUhEUgAAAAUAAAAFCAYAAACNbyblAAAAHElEQVQI12P4//8/w38GIAXDIBKE0DHxgljNBAAO9TXL0Y4OHwAAAABJRU5ErkJggg==";
            multimedia.setType(type);
            multimedia.setFileName(fileName);
            multimedia.setPayload(payload);
            List<Multimedia> multimediaList = new ArrayList<>();
            multimediaList.add(multimedia);

            Integer retryTimeout = 10;

            ZonedDateTime zdt = ZonedDateTime.now(ZoneOffset.UTC);
            ZonedDateTime zdtPlusTwoDays = zdt.plusDays(2);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSX");
            String scheduleSend = zdtPlusTwoDays.format(formatter);

            Boolean deliveryNotification = false;
            String statusCallbackUrl = "http://www.example.com";
            List<String> tagsList = new ArrayList<>();
            tagsList.add("laborum");
            tagsList.add("esse");
            tagsList.add("irure Lorem");
            tagsList.add("dolore aliqu");
            tagsList.add("pariatur do proident magna ut");
            tagsList.add("id sunt");
            tagsList.add("u");
            tagsList.add("tempor velit minim");
            tagsList.add("sit dolo");
            tagsList.add("laborum qui");

            UpdateMessageByIdRequest updateMessageByIdRequest = new UpdateMessageByIdRequest()
                    .to(to)
                    .from(from)
                    .messageContent(messageContent)
                    .multimedia(multimediaList)
                    .retryTimeout(retryTimeout)
                    .scheduleSend(scheduleSend)
                    .deliveryNotification(deliveryNotification)
                    .statusCallbackUrl(statusCallbackUrl)
                    .tags(tagsList);

            MessageUpdate response = messagesApi.updateMessageById(updateMessageByIdRequest, messageId);
            System.out.println(response);
            assertEquals(messageId, response.getMessageId());

        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }


    /**
     * update message tags
     * Use the **messageId** to update the tag(s) assigned to a message. You can use this endpoint any time, even after your message has been delivered.
     *
     */
    @Ignore
    public void updateMessageTagsTest() {

        try{
            ApiClient apiClient = getAuthToken(defaultClient);
            MessagesApi messagesApi = new MessagesApi(apiClient);
            UUID messageId = UUID.fromString("88ed8550-59cd-11ef-be6b-3de6ec7e1aaa");

            UpdateMessageTagsRequest updateMessageTagsRequest = new UpdateMessageTagsRequest();
            updateMessageTagsRequest.addTagsItem("marketing");
            updateMessageTagsRequest.addTagsItem("SMS");

            messagesApi.updateMessageTags(updateMessageTagsRequest, messageId);

        } catch (ApiException e) {
            System.err.println("Exception when calling MessagesApi");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
