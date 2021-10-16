/*
 * Nordigen Account Information Services API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents an end-user agreement.
 */
@ApiModel(description = "Represents an end-user agreement.")
@JsonPropertyOrder({
  EndUserAgreement.JSON_PROPERTY_ID,
  EndUserAgreement.JSON_PROPERTY_CREATED,
  EndUserAgreement.JSON_PROPERTY_MAX_HISTORICAL_DAYS,
  EndUserAgreement.JSON_PROPERTY_ACCESS_VALID_FOR_DAYS,
  EndUserAgreement.JSON_PROPERTY_ACCESS_SCOPE,
  EndUserAgreement.JSON_PROPERTY_ACCEPTED,
  EndUserAgreement.JSON_PROPERTY_ENDUSER_ID,
  EndUserAgreement.JSON_PROPERTY_ASPSP_ID
})
@JsonTypeName("EndUserAgreement")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-16T21:28:46.044233Z[Etc/UTC]")
public class EndUserAgreement {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_MAX_HISTORICAL_DAYS = "max_historical_days";
  private Integer maxHistoricalDays = 90;

  public static final String JSON_PROPERTY_ACCESS_VALID_FOR_DAYS = "access_valid_for_days";
  private Integer accessValidForDays = 90;

  public static final String JSON_PROPERTY_ACCESS_SCOPE = "access_scope";
  private List<String> accessScope = null;

  public static final String JSON_PROPERTY_ACCEPTED = "accepted";
  private OffsetDateTime accepted;

  public static final String JSON_PROPERTY_ENDUSER_ID = "enduser_id";
  private String enduserId;

  public static final String JSON_PROPERTY_ASPSP_ID = "aspsp_id";
  private String aspspId;


   /**
   * The ID of this End User Agreement, used to refer to this end user agreement in other API calls.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of this End User Agreement, used to refer to this end user agreement in other API calls.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getId() {
    return id;
  }




   /**
   * The date &amp; time at which the end user agreement was created.
   * @return created
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The date & time at which the end user agreement was created.")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getCreated() {
    return created;
  }




  public EndUserAgreement maxHistoricalDays(Integer maxHistoricalDays) {
    
    this.maxHistoricalDays = maxHistoricalDays;
    return this;
  }

   /**
   * Maximum number of days of transaction data to retrieve.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return maxHistoricalDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of days of transaction data to retrieve.")
  @JsonProperty(JSON_PROPERTY_MAX_HISTORICAL_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxHistoricalDays() {
    return maxHistoricalDays;
  }


  @JsonProperty(JSON_PROPERTY_MAX_HISTORICAL_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxHistoricalDays(Integer maxHistoricalDays) {
    this.maxHistoricalDays = maxHistoricalDays;
  }


   /**
   * Number of days from acceptance that the access can be used.
   * minimum: -2147483648
   * maximum: 2147483647
   * @return accessValidForDays
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of days from acceptance that the access can be used.")
  @JsonProperty(JSON_PROPERTY_ACCESS_VALID_FOR_DAYS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAccessValidForDays() {
    return accessValidForDays;
  }




  public EndUserAgreement accessScope(List<String> accessScope) {
    
    this.accessScope = accessScope;
    return this;
  }

  public EndUserAgreement addAccessScopeItem(String accessScopeItem) {
    if (this.accessScope == null) {
      this.accessScope = new ArrayList<String>();
    }
    this.accessScope.add(accessScopeItem);
    return this;
  }

   /**
   * Array containing one or several values of [&#39;balances&#39;, &#39;details&#39;, &#39;transactions&#39;]
   * @return accessScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array containing one or several values of ['balances', 'details', 'transactions']")
  @JsonProperty(JSON_PROPERTY_ACCESS_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAccessScope() {
    return accessScope;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessScope(List<String> accessScope) {
    this.accessScope = accessScope;
  }


   /**
   * The date &amp; time at which the end user accepted the agreement.
   * @return accepted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The date & time at which the end user accepted the agreement.")
  @JsonProperty(JSON_PROPERTY_ACCEPTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OffsetDateTime getAccepted() {
    return accepted;
  }




  public EndUserAgreement enduserId(String enduserId) {
    
    this.enduserId = enduserId;
    return this;
  }

   /**
   * A unique ID that identifies this user in your system. For data protection purposes, it must be possible to identify your users using this value. Data protection related requests may quote this value to identify data subjects.
   * @return enduserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "A unique ID that identifies this user in your system. For data protection purposes, it must be possible to identify your users using this value. Data protection related requests may quote this value to identify data subjects.")
  @JsonProperty(JSON_PROPERTY_ENDUSER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEnduserId() {
    return enduserId;
  }


  @JsonProperty(JSON_PROPERTY_ENDUSER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnduserId(String enduserId) {
    this.enduserId = enduserId;
  }


  public EndUserAgreement aspspId(String aspspId) {
    
    this.aspspId = aspspId;
    return this;
  }

   /**
   * an ASPSP ID for this EUA
   * @return aspspId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "an ASPSP ID for this EUA")
  @JsonProperty(JSON_PROPERTY_ASPSP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAspspId() {
    return aspspId;
  }


  @JsonProperty(JSON_PROPERTY_ASPSP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAspspId(String aspspId) {
    this.aspspId = aspspId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndUserAgreement endUserAgreement = (EndUserAgreement) o;
    return Objects.equals(this.id, endUserAgreement.id) &&
        Objects.equals(this.created, endUserAgreement.created) &&
        Objects.equals(this.maxHistoricalDays, endUserAgreement.maxHistoricalDays) &&
        Objects.equals(this.accessValidForDays, endUserAgreement.accessValidForDays) &&
        Objects.equals(this.accessScope, endUserAgreement.accessScope) &&
        Objects.equals(this.accepted, endUserAgreement.accepted) &&
        Objects.equals(this.enduserId, endUserAgreement.enduserId) &&
        Objects.equals(this.aspspId, endUserAgreement.aspspId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, maxHistoricalDays, accessValidForDays, accessScope, accepted, enduserId, aspspId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndUserAgreement {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    maxHistoricalDays: ").append(toIndentedString(maxHistoricalDays)).append("\n");
    sb.append("    accessValidForDays: ").append(toIndentedString(accessValidForDays)).append("\n");
    sb.append("    accessScope: ").append(toIndentedString(accessScope)).append("\n");
    sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
    sb.append("    enduserId: ").append(toIndentedString(enduserId)).append("\n");
    sb.append("    aspspId: ").append(toIndentedString(aspspId)).append("\n");
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

}

