/*
 * Telstra Messaging API
 *  The Telstra SMS Messaging API allows your applications to send and receive SMS text messages from Australia's leading network operator.  It also allows your application to track the delivery status of both sent and received SMS messages. 
 *
 * OpenAPI spec version: 2.2.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.telstra.messaging;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SendMmsRequestMMSContent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-09T15:30:54.049+11:00")
public class SendMmsRequestMMSContent {
  @SerializedName("type")
  private String type = null;

  @SerializedName("filename")
  private String filename = null;

  @SerializedName("payload")
  private String payload = null;

  public SendMmsRequestMMSContent type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The following types are supported audio/amr  audio/aac  audio/mp3  audio/mpeg3  audio/mpeg  audio/mpg  audio/wav  audio/3gpp  audio/mp4  image/gif  image/jpeg  image/jpg  image/png  image/bmp  video/mpeg4  video/mp4  video/mpeg  video/3gpp  video/3gp  video/h263  text/plain  text/x-vCard  text/x-vCalendar
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The following types are supported audio/amr  audio/aac  audio/mp3  audio/mpeg3  audio/mpeg  audio/mpg  audio/wav  audio/3gpp  audio/mp4  image/gif  image/jpeg  image/jpg  image/png  image/bmp  video/mpeg4  video/mp4  video/mpeg  video/3gpp  video/3gp  video/h263  text/plain  text/x-vCard  text/x-vCalendar")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SendMmsRequestMMSContent filename(String filename) {
    this.filename = filename;
    return this;
  }

   /**
   * The file name to be associated with the content. Some devices will display this file name with a placeholder for the content.
   * @return filename
  **/
  @ApiModelProperty(required = true, value = "The file name to be associated with the content. Some devices will display this file name with a placeholder for the content.")
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public SendMmsRequestMMSContent payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * 
   * @return payload
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendMmsRequestMMSContent sendMmsRequestMMSContent = (SendMmsRequestMMSContent) o;
    return Objects.equals(this.type, sendMmsRequestMMSContent.type) &&
        Objects.equals(this.filename, sendMmsRequestMMSContent.filename) &&
        Objects.equals(this.payload, sendMmsRequestMMSContent.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, filename, payload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendMmsRequestMMSContent {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

