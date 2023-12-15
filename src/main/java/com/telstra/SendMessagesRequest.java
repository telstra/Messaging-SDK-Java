/*
 * Messaging API v3.x
 * Send and receive SMS & MMS programmatically, leveraging Australia's leading mobile network. With Telstra's Messaging API, we take out the complexity to allow seamless messaging integration into your app, with just a few lines of code. Our REST API is enterprise grade, allowing you to communicate with engaging SMS & MMS messaging in your web and mobile apps in near real-time on a global scale. 
 *
 * The version of the OpenAPI document: 3.x
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.telstra;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

import java.util.HashSet;


/**
 * SendMessagesRequest
 */

public class SendMessagesRequest {
  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private String to;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_MESSAGE_CONTENT = "messageContent";
  @SerializedName(SERIALIZED_NAME_MESSAGE_CONTENT)
  private String messageContent;

  public static final String SERIALIZED_NAME_MULTIMEDIA = "multimedia";
  @SerializedName(SERIALIZED_NAME_MULTIMEDIA)
  private List<Multimedia> multimedia;

  public static final String SERIALIZED_NAME_RETRY_TIMEOUT = "retryTimeout";
  @SerializedName(SERIALIZED_NAME_RETRY_TIMEOUT)
  private Integer retryTimeout = 10;

  public static final String SERIALIZED_NAME_SCHEDULE_SEND = "scheduleSend";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_SEND)
  private String scheduleSend;

  public static final String SERIALIZED_NAME_DELIVERY_NOTIFICATION = "deliveryNotification";
  @SerializedName(SERIALIZED_NAME_DELIVERY_NOTIFICATION)
  private Boolean deliveryNotification = false;

  public static final String SERIALIZED_NAME_STATUS_CALLBACK_URL = "statusCallbackUrl";
  @SerializedName(SERIALIZED_NAME_STATUS_CALLBACK_URL)
  private String statusCallbackUrl;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags;

  public SendMessagesRequest() {
  }

  public SendMessagesRequest to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  public String getTo() {
    return to;
  }


  public void setTo(String to) {
    this.to = to;
  }


  public SendMessagesRequest from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * When the recipient receives your message, you can choose whether they&#39;ll see a virtualNumber or senderName (paid plans only) in the **from** field.   * 04xxxxxxxx: Use one of the Virtual Numbers associated with your account. You&#39;ll also be able to receive SMS replies to this number.  * senderName: Choose a unique alphanumeric string of up to 11 characters (paid feature). 
   * @return from
  **/
  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public SendMessagesRequest messageContent(String messageContent) {
    
    this.messageContent = messageContent;
    return this;
  }

   /**
   * Use this field to send an SMS. Your text message goes here.     Note: either messageContent or multimedia are required, or you can use both field if you want to send multimedia with text. 
   * @return messageContent
  **/
  public String getMessageContent() {
    return messageContent;
  }


  public void setMessageContent(String messageContent) {
    this.messageContent = messageContent;
  }


  public SendMessagesRequest multimedia(List<Multimedia> multimedia) {
    
    this.multimedia = multimedia;
    return this;
  }

  public SendMessagesRequest addMultimediaItem(Multimedia multimediaItem) {
    if (this.multimedia == null) {
      this.multimedia = new ArrayList<>();
    }
    this.multimedia.add(multimediaItem);
    return this;
  }

   /**
   * Use this field to send an MMS. Add your image, video or audio content here.   Note: either messageContent or multimedia are required, or you can use both field if you want to send multimedia with text.  Include a JSON payload with:  type: the type of multimedia content file you&#39;re sending (image, audio or video) followed by the file type. Use the format \&quot;multimedia type/file type\&quot;, e.g. \&quot;image/PNG\&quot; or \&quot;audio/MP3\&quot;. Supported file types: JPEG, BMP, GIF87a, GIF89a, PNG, MP3, WAV, MPEG, MPG, MP4, 3GP and US-ASCII.  fileName: the name of your multimedia file.  payload: the base64 encoded content. You can use [this online tool] to encode an image, or [Base64 Guru] to encode a video or audio file.
   * @return multimedia
  **/
  public List<Multimedia> getMultimedia() {
    return multimedia;
  }


  public void setMultimedia(List<Multimedia> multimedia) {
    this.multimedia = multimedia;
  }


  public SendMessagesRequest retryTimeout(Integer retryTimeout) {
    
    this.retryTimeout = retryTimeout;
    return this;
  }

   /**
   * If the message is queued or unable to reach the recipient&#39;s device, tell us how many minutes the network should keep trying. Use an integer between 1 and 1440. If you don&#39;t set a value, we&#39;ll try for 10 minutes. 
   * minimum: 1
   * maximum: 1440
   * @return retryTimeout
  **/
  public Integer getRetryTimeout() {
    return retryTimeout;
  }


  public void setRetryTimeout(Integer retryTimeout) {
    this.retryTimeout = retryTimeout;
  }


  public SendMessagesRequest scheduleSend(String scheduleSend) {
    this.scheduleSend = scheduleSend;
    return this;
  }

   /**
   * Don&#39;t want to send the message right away? Tell us what time you want to add it to the queue for sending instead.  Set the time in London Greenwich Mean Time (adjusting for any time difference) and use ISO format, e.g. \&quot;2019-08-24T15:39:00Z\&quot;.  You can schedule a message up to 10 days into the future. If you specify a timestamp outside of this limit, the API will return a FIELD_INVALID error. 
   * @return scheduleSend
  **/
  public String getScheduleSend() {
    return scheduleSend;
  }


  public void setScheduleSend(String scheduleSend) {
    this.scheduleSend = scheduleSend;
  }


  public SendMessagesRequest deliveryNotification(Boolean deliveryNotification) {
    
    this.deliveryNotification = deliveryNotification;
    return this;
  }

   /**
   * To receive a notification when your SMS has been delivered, set this parameter to **true** and make sure you provide a **statusCallbackUrl** (paid feature). 
   * @return deliveryNotification
  **/
  public Boolean getDeliveryNotification() {
    return deliveryNotification;
  }


  public void setDeliveryNotification(Boolean deliveryNotification) {
    this.deliveryNotification = deliveryNotification;
  }


  public SendMessagesRequest statusCallbackUrl(String statusCallbackUrl) {
    
    this.statusCallbackUrl = statusCallbackUrl;
    return this;
  }

   /**
   * Tell us the URL you want the API to call when the status of your SMS updates.   To receive a status update, this field must be provided and deliveryNotification must be set to **true**.   The status will be either:   * **queued** – the message is in the queue for sending (default). * **sent** – your message has been sent from the server. * **expired** – we weren&#39;t able to send the message within the **retryTimeout** timeframe. * **delivered** – the message has successfully reached the recipient&#39;s device. Note that we will only be able to return this status if you set **deliveryNotification** to **true** (paid feature). * **undeliverable** – the delivery of your message failed (paid feature).  Sample callback response:  &lt;pre&gt;&lt;code class&#x3D;\&quot;language-sh\&quot;&gt;{   \&quot;to\&quot;:\&quot;0476543210\&quot;,    \&quot;from\&quot;:\&quot;0401234567\&quot;,     \&quot;timestamp\&quot;:\&quot;2022-11-10T05:06:42.823Z\&quot;,    \&quot;messageId\&quot;:\&quot;1520b774-46b0-4415-a05f-7bcb1c032c59\&quot;,    \&quot;status\&quot;:\&quot;delivered\&quot;  }&lt;/code&gt;&lt;/pre&gt; 
   * @return statusCallbackUrl
  **/
  public String getStatusCallbackUrl() {
    return statusCallbackUrl;
  }


  public void setStatusCallbackUrl(String statusCallbackUrl) {
    this.statusCallbackUrl = statusCallbackUrl;
  }


  public SendMessagesRequest tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public SendMessagesRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Create your own tags and use them to fetch and sort your messages through our other endpoints. You can assign up to 10 tags per message. 
   * @return tags
  **/
  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendMessagesRequest sendMessagesRequest = (SendMessagesRequest) o;
    return Objects.equals(this.to, sendMessagesRequest.to) &&
        Objects.equals(this.from, sendMessagesRequest.from) &&
        Objects.equals(this.messageContent, sendMessagesRequest.messageContent) &&
        Objects.equals(this.multimedia, sendMessagesRequest.multimedia) &&
        Objects.equals(this.retryTimeout, sendMessagesRequest.retryTimeout) &&
        Objects.equals(this.scheduleSend, sendMessagesRequest.scheduleSend) &&
        Objects.equals(this.deliveryNotification, sendMessagesRequest.deliveryNotification) &&
        Objects.equals(this.statusCallbackUrl, sendMessagesRequest.statusCallbackUrl) &&
        Objects.equals(this.tags, sendMessagesRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, from, messageContent, multimedia, retryTimeout, scheduleSend, deliveryNotification, statusCallbackUrl, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    messageContent: ").append(toIndentedString(messageContent)).append("\n");
    sb.append("    multimedia: ").append(toIndentedString(multimedia)).append("\n");
    sb.append("    retryTimeout: ").append(toIndentedString(retryTimeout)).append("\n");
    sb.append("    scheduleSend: ").append(toIndentedString(scheduleSend)).append("\n");
    sb.append("    deliveryNotification: ").append(toIndentedString(deliveryNotification)).append("\n");
    sb.append("    statusCallbackUrl: ").append(toIndentedString(statusCallbackUrl)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("to");
    openapiFields.add("from");
    openapiFields.add("messageContent");
    openapiFields.add("multimedia");
    openapiFields.add("retryTimeout");
    openapiFields.add("scheduleSend");
    openapiFields.add("deliveryNotification");
    openapiFields.add("statusCallbackUrl");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("to");
    openapiRequiredFields.add("from");
  }

}

