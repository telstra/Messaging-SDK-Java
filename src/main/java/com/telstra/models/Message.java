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


package com.telstra.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Message
 */

public class Message {
  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_DELIVERY_STATUS = "deliveryStatus";
  @SerializedName(SERIALIZED_NAME_DELIVERY_STATUS)
  private String deliveryStatus;

  public static final String SERIALIZED_NAME_MESSAGE_ID = "messageId";
  @SerializedName(SERIALIZED_NAME_MESSAGE_ID)
  private String messageId;

  public static final String SERIALIZED_NAME_MESSAGE_STATUS_U_R_L = "messageStatusURL";
  @SerializedName(SERIALIZED_NAME_MESSAGE_STATUS_U_R_L)
  private String messageStatusURL;


  public Message to(String to) {
    
    this.to = to;
    return this;
  }

   /**
   * Just a copy of the number the message is sent to.
   * @return to
  **/
  @ApiModelProperty(example = "+61412345678", required = true, value = "Just a copy of the number the message is sent to.")

  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public Message deliveryStatus(String deliveryStatus) {
    
    this.deliveryStatus = deliveryStatus;
    return this;
  }

   /**
   * Gives an indication if the message has been accepted for delivery. The description field contains information on why a message may have been rejected. 
   * @return deliveryStatus
  **/
  @ApiModelProperty(example = "MessageWaiting", required = true, value = "Gives an indication if the message has been accepted for delivery. The description field contains information on why a message may have been rejected. ")

  public String getDeliveryStatus() {
    return deliveryStatus;
  }


  public void setDeliveryStatus(String deliveryStatus) {
    this.deliveryStatus = deliveryStatus;
  }


  public Message messageId(String messageId) {
    
    this.messageId = messageId;
    return this;
  }

   /**
   * For an accepted message, ths will be a unique reference that can be used to check the messages status. Please refer to the Delivery Notification section.  Note that &#x60;messageId&#x60; will be different for each number that the message was sent to. 
   * @return messageId
  **/
  @ApiModelProperty(example = "d997474900097a1f0000000008d7e18102cc0901-1261412345678", required = true, value = "For an accepted message, ths will be a unique reference that can be used to check the messages status. Please refer to the Delivery Notification section.  Note that `messageId` will be different for each number that the message was sent to. ")

  public String getMessageId() {
    return messageId;
  }


  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }


  public Message messageStatusURL(String messageStatusURL) {
    
    this.messageStatusURL = messageStatusURL;
    return this;
  }

   /**
   * For an accepted message, ths will be the URL that can be used to check the messages status. Please refer to the Delivery Notification section. 
   * @return messageStatusURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://tapi.telstra.com/v2/messages/sms/d997474900097a1f0000000008d7e18102cc0901-1261412345678/status ", value = "For an accepted message, ths will be the URL that can be used to check the messages status. Please refer to the Delivery Notification section. ")

  public String getMessageStatusURL() {
    return messageStatusURL;
  }


  public void setMessageStatusURL(String messageStatusURL) {
    this.messageStatusURL = messageStatusURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Message message = (Message) o;
    return Objects.equals(this.to, message.to) &&
        Objects.equals(this.deliveryStatus, message.deliveryStatus) &&
        Objects.equals(this.messageId, message.messageId) &&
        Objects.equals(this.messageStatusURL, message.messageStatusURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, deliveryStatus, messageId, messageStatusURL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Message {\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    deliveryStatus: ").append(toIndentedString(deliveryStatus)).append("\n");
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    messageStatusURL: ").append(toIndentedString(messageStatusURL)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
