/*
 * Nordigen Account Information Services API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 2.0 (v2)
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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RequisitionLinkParamsSerializer.
 */
@ApiModel(description = "RequisitionLinkParamsSerializer.")
@JsonPropertyOrder({
  RequisitionLinkParams.JSON_PROPERTY_ASPSP_ID
})
@JsonTypeName("RequisitionLinkParams")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-26T16:06:45.421496Z[Etc/UTC]")
public class RequisitionLinkParams {
  public static final String JSON_PROPERTY_ASPSP_ID = "aspsp_id";
  private String aspspId;

  public RequisitionLinkParams() { 
  }

  public RequisitionLinkParams aspspId(String aspspId) {
    
    this.aspspId = aspspId;
    return this;
  }

   /**
   * ASPSP ID. Should match one used while creating EUA, if it&#39;s linked to this requisition
   * @return aspspId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "ASPSP ID. Should match one used while creating EUA, if it's linked to this requisition")
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
    RequisitionLinkParams requisitionLinkParams = (RequisitionLinkParams) o;
    return Objects.equals(this.aspspId, requisitionLinkParams.aspspId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aspspId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequisitionLinkParams {\n");
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

