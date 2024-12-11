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
 * ProvisionNumberRequest
 */

public class ProvisionNumberRequest {
  public static final String SERIALIZED_NAME_ACTIVE_DAYS = "activeDays";
  @SerializedName(SERIALIZED_NAME_ACTIVE_DAYS)
  private Integer activeDays;

  public static final String SERIALIZED_NAME_NOTIFY_U_R_L = "notifyURL";
  @SerializedName(SERIALIZED_NAME_NOTIFY_U_R_L)
  private String notifyURL;


  public ProvisionNumberRequest activeDays(Integer activeDays) {
    
    this.activeDays = activeDays;
    return this;
  }

   /**
   * The number of days before for which this number is provisioned. 
   * @return activeDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "The number of days before for which this number is provisioned. ")

  public Integer getActiveDays() {
    return activeDays;
  }


  public void setActiveDays(Integer activeDays) {
    this.activeDays = activeDays;
  }


  public ProvisionNumberRequest notifyURL(String notifyURL) {
    
    this.notifyURL = notifyURL;
    return this;
  }

   /**
   * A notification URL that will be POSTed to whenever a new message (i.e. a reply to a message sent) arrives at this destination address.  If this is not provided then you can use the Get /sms or /mms API to poll for reply messages.  If you are using a domain URL you must include the forward slash at the end of the URL (e.g. http://www.example.com/).  *Please note that the notification URLs and the Get /sms or /mms call are exclusive. If a notification URL has been set then the GET call will not provide any useful information.* 
   * @return notifyURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://wwww.example.com/", value = "A notification URL that will be POSTed to whenever a new message (i.e. a reply to a message sent) arrives at this destination address.  If this is not provided then you can use the Get /sms or /mms API to poll for reply messages.  If you are using a domain URL you must include the forward slash at the end of the URL (e.g. http://www.example.com/).  *Please note that the notification URLs and the Get /sms or /mms call are exclusive. If a notification URL has been set then the GET call will not provide any useful information.* ")

  public String getNotifyURL() {
    return notifyURL;
  }


  public void setNotifyURL(String notifyURL) {
    this.notifyURL = notifyURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvisionNumberRequest provisionNumberRequest = (ProvisionNumberRequest) o;
    return Objects.equals(this.activeDays, provisionNumberRequest.activeDays) &&
        Objects.equals(this.notifyURL, provisionNumberRequest.notifyURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeDays, notifyURL);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvisionNumberRequest {\n");
    sb.append("    activeDays: ").append(toIndentedString(activeDays)).append("\n");
    sb.append("    notifyURL: ").append(toIndentedString(notifyURL)).append("\n");
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
