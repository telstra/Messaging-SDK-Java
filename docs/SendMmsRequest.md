

# SendMmsRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**to** | **String** | This is the destination address. Can be an array of strings if sending to multiple numbers: \&quot;to\&quot;:[\&quot;+61412345678\&quot;, \&quot;+61418765432\&quot;]  | 
**from** | **String** | This will be the source address that will be displayed on the receiving device. You can set an Alphanumeric sender ID of up to 11 characters that the MMS was sent from. Phone numbers in the &#x60;from&#x60; attribute will be blocked (400-error) to prevent number spoofing.  Most standard ASCII characters are accepted in the alphanumeric &#x60;from&#x60; attribute, however there are some limitations. The following limitations and characters are allowed in the alphanumeric &#x60;from&#x60; attribute; any alphabetic character (e.g. &#x60;abc&#x60;), any number mixed with alphabetic characters (e.g. &#x60;123abc&#x60;), uppercase and lowercase characters (e.g. &#x60;aBc&#x60;), any of the following special characters mixed with alphabetic characters are allowed; &#x60;~!@#$%^&amp;*()~_~+-&#x3D;{}|[];&#39;?,./&#x60; (e.g. &#x60;abc~!@&#x60;), any combination of lowercase, uppercase, numeric or allowed special characters (e.g. &#x60;abc@#123DE&#x60;). All other characters, including spaces and extended ASCII characters, are not allowed (e.g. &#x60;&lt;&gt;:\&quot;\\&#x60;).  If attribute is not present, the service will use the mobile number associated with the application (in E.164 format).  If &#x60;replyRequest&#x60; is set to true, this field should not be present.  This feature is only available on Telstra Account paid plans, not through Free Trials or credit card paid plans.   *Please note:*  *- Alphanumeric sender ID works for domestic, i.e. Australian, destinations only.*  *- When Alphanumeric sender ID is used in sending MMS, Delivery Reports will NOT be returned.*  |  [optional]
**subject** | **String** | The subject that will be used in an MMS message. Subject is limited to maximum of 64 characters.  Some special characters need to be encoded if used in the &#x60;subject&#x60; field (e.g. &amp;amp;amp; for &amp; and &amp;amp;lt; for &lt;).  |  [optional]
**replyRequest** | **Boolean** | If set to true, the reply message functionality will be implemented. The &#x60;from&#x60; field should not be present.  |  [optional]
**notifyURL** | **String** | Contains a URL that will be called once your message has been processed. The status may be delivered, expired, deleted, etc. Please refer to the Delivery Status section for more information.  If you are using a domain URL you must include the forward slash at the end of the URL (e.g. http://www.example.com/).  |  [optional]
**mmSContent** | [**List&lt;MMSContent&gt;**](MMSContent.md) | An array of content that will be sent in an MMS message. If this array is present it will cause the &#x60;body&#x60; element to be ignored, and the message will be sent as an MMS.  | 


