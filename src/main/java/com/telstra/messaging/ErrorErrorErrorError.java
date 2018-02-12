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
 * Returns error status code and message
 */
@ApiModel(description = "Returns error status code and message")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-08T22:00:21.379+11:00")
public class ErrorErrorErrorError {
  @SerializedName("status")
  private Integer status = null;

  @SerializedName("message")
  private String message = null;

  public ErrorErrorErrorError status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * The status code.
   * @return status
  **/
  @ApiModelProperty(value = "The status code.")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public ErrorErrorErrorError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Message describing the error.
   * @return message
  **/
  @ApiModelProperty(value = "Message describing the error.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorErrorErrorError errorErrorErrorError = (ErrorErrorErrorError) o;
    return Objects.equals(this.status, errorErrorErrorError.status) &&
        Objects.equals(this.message, errorErrorErrorError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorErrorErrorError {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

