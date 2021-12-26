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
import org.openapitools.client.model.AccountV2StatusEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AccountV2Serializer.
 */
@ApiModel(description = "AccountV2Serializer.")
@JsonPropertyOrder({
  AccountV2.JSON_PROPERTY_ID,
  AccountV2.JSON_PROPERTY_CREATED,
  AccountV2.JSON_PROPERTY_LAST_ACCESSED,
  AccountV2.JSON_PROPERTY_IBAN,
  AccountV2.JSON_PROPERTY_INSTITUTION_ID,
  AccountV2.JSON_PROPERTY_STATUS
})
@JsonTypeName("AccountV2")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-26T15:36:10.643498Z[Etc/UTC]")
public class AccountV2 {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CREATED = "created";
  private String created;

  public static final String JSON_PROPERTY_LAST_ACCESSED = "last_accessed";
  private JsonNullable<String> lastAccessed = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IBAN = "iban";
  private String iban;

  public static final String JSON_PROPERTY_INSTITUTION_ID = "institution_id";
  private String institutionId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private JsonNullable<AccountV2StatusEnum> status = JsonNullable.<AccountV2StatusEnum>undefined();

  public AccountV2() { 
  }

  @JsonCreator
  public AccountV2(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_CREATED) String created, 
    @JsonProperty(JSON_PROPERTY_LAST_ACCESSED) String lastAccessed, 
    @JsonProperty(JSON_PROPERTY_IBAN) String iban, 
    @JsonProperty(JSON_PROPERTY_INSTITUTION_ID) String institutionId, 
    @JsonProperty(JSON_PROPERTY_STATUS) AccountV2StatusEnum status
  ) {
    this();
    this.id = id;
    this.created = created;
    this.lastAccessed = lastAccessed;
    this.iban = iban;
    this.institutionId = institutionId;
    this.status = status;
  }

   /**
   * The ID of this Account, used to refer to this account in other API calls.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of this Account, used to refer to this account in other API calls.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




   /**
   * The date &amp; time at which the account object was created.
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date & time at which the account object was created.")
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreated() {
    return created;
  }




   /**
   * The date &amp; time at which the account object was last accessed.
   * @return lastAccessed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date & time at which the account object was last accessed.")
  @JsonIgnore

  public String getLastAccessed() {
    
    if (lastAccessed == null) {
      lastAccessed = JsonNullable.<String>undefined();
    }
    return lastAccessed.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_ACCESSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLastAccessed_JsonNullable() {
    return lastAccessed;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_ACCESSED)
  private void setLastAccessed_JsonNullable(JsonNullable<String> lastAccessed) {
    this.lastAccessed = lastAccessed;
  }



   /**
   * The Account IBAN
   * @return iban
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Account IBAN")
  @JsonProperty(JSON_PROPERTY_IBAN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIban() {
    return iban;
  }




   /**
   * The ASPSP associated with this account.
   * @return institutionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ASPSP associated with this account.")
  @JsonProperty(JSON_PROPERTY_INSTITUTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstitutionId() {
    return institutionId;
  }




   /**
   * The processing status of this account.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The processing status of this account.")
  @JsonIgnore

  public AccountV2StatusEnum getStatus() {
    
    if (status == null) {
      status = JsonNullable.<AccountV2StatusEnum>undefined();
    }
    return status.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<AccountV2StatusEnum> getStatus_JsonNullable() {
    return status;
  }
  
  @JsonProperty(JSON_PROPERTY_STATUS)
  private void setStatus_JsonNullable(JsonNullable<AccountV2StatusEnum> status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountV2 accountV2 = (AccountV2) o;
    return Objects.equals(this.id, accountV2.id) &&
        Objects.equals(this.created, accountV2.created) &&
        equalsNullable(this.lastAccessed, accountV2.lastAccessed) &&
        Objects.equals(this.iban, accountV2.iban) &&
        Objects.equals(this.institutionId, accountV2.institutionId) &&
        equalsNullable(this.status, accountV2.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, hashCodeNullable(lastAccessed), iban, institutionId, hashCodeNullable(status));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountV2 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastAccessed: ").append(toIndentedString(lastAccessed)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

