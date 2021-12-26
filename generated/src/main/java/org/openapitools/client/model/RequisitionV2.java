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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Status1c5Enum;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Get requisition by id.
 */
@ApiModel(description = "Get requisition by id.")
@JsonPropertyOrder({
  RequisitionV2.JSON_PROPERTY_ID,
  RequisitionV2.JSON_PROPERTY_CREATED,
  RequisitionV2.JSON_PROPERTY_REDIRECT,
  RequisitionV2.JSON_PROPERTY_STATUS,
  RequisitionV2.JSON_PROPERTY_INSTITUTION_ID,
  RequisitionV2.JSON_PROPERTY_AGREEMENT,
  RequisitionV2.JSON_PROPERTY_REFERENCE,
  RequisitionV2.JSON_PROPERTY_ACCOUNTS,
  RequisitionV2.JSON_PROPERTY_USER_LANGUAGE,
  RequisitionV2.JSON_PROPERTY_LINK,
  RequisitionV2.JSON_PROPERTY_SSN,
  RequisitionV2.JSON_PROPERTY_ACCOUNT_SELECTION
})
@JsonTypeName("RequisitionV2")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-26T15:36:10.643498Z[Etc/UTC]")
public class RequisitionV2 {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CREATED = "created";
  private JsonNullable<String> created = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_REDIRECT = "redirect";
  private String redirect;

  public static final String JSON_PROPERTY_STATUS = "status";
  private JsonNullable<Status1c5Enum> status = JsonNullable.<Status1c5Enum>undefined();

  public static final String JSON_PROPERTY_INSTITUTION_ID = "institution_id";
  private String institutionId;

  public static final String JSON_PROPERTY_AGREEMENT = "agreement";
  private String agreement;

  public static final String JSON_PROPERTY_REFERENCE = "reference";
  private String reference;

  public static final String JSON_PROPERTY_ACCOUNTS = "accounts";
  private List<String> accounts = null;

  public static final String JSON_PROPERTY_USER_LANGUAGE = "user_language";
  private String userLanguage;

  public static final String JSON_PROPERTY_LINK = "link";
  private String link = "https://ob.nordigen.com/psd2/start/3fa85f64-5717-4562-b3fc-2c963f66afa6/some_institution_id";

  public static final String JSON_PROPERTY_SSN = "ssn";
  private String ssn;

  public static final String JSON_PROPERTY_ACCOUNT_SELECTION = "account_selection";
  private Boolean accountSelection = false;

  public RequisitionV2() { 
  }

  @JsonCreator
  public RequisitionV2(
    @JsonProperty(JSON_PROPERTY_ID) String id, 
    @JsonProperty(JSON_PROPERTY_CREATED) String created, 
    @JsonProperty(JSON_PROPERTY_STATUS) Status1c5Enum status, 
    @JsonProperty(JSON_PROPERTY_ACCOUNTS) List<String> accounts, 
    @JsonProperty(JSON_PROPERTY_LINK) String link
  ) {
    this();
    this.id = id;
    this.created = created;
    this.status = status;
    this.accounts = accounts;
    this.link = link;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




   /**
   * The date &amp; time at which the requisition was created.
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date & time at which the requisition was created.")
  @JsonIgnore

  public String getCreated() {
    
    if (created == null) {
      created = JsonNullable.<String>undefined();
    }
    return created.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCreated_JsonNullable() {
    return created;
  }
  
  @JsonProperty(JSON_PROPERTY_CREATED)
  private void setCreated_JsonNullable(JsonNullable<String> created) {
    this.created = created;
  }



  public RequisitionV2 redirect(String redirect) {
    
    this.redirect = redirect;
    return this;
  }

   /**
   * redirect URL to your application after end-user authorization with ASPSP
   * @return redirect
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "redirect URL to your application after end-user authorization with ASPSP")
  @JsonProperty(JSON_PROPERTY_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRedirect() {
    return redirect;
  }


  @JsonProperty(JSON_PROPERTY_REDIRECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRedirect(String redirect) {
    this.redirect = redirect;
  }


   /**
   * status of this requisition
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "status of this requisition")
  @JsonIgnore

  public Status1c5Enum getStatus() {
    
    if (status == null) {
      status = JsonNullable.<Status1c5Enum>undefined();
    }
    return status.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Status1c5Enum> getStatus_JsonNullable() {
    return status;
  }
  
  @JsonProperty(JSON_PROPERTY_STATUS)
  private void setStatus_JsonNullable(JsonNullable<Status1c5Enum> status) {
    this.status = status;
  }



  public RequisitionV2 institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * an Institution ID for this Requisition
   * @return institutionId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "an Institution ID for this Requisition")
  @JsonProperty(JSON_PROPERTY_INSTITUTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInstitutionId() {
    return institutionId;
  }


  @JsonProperty(JSON_PROPERTY_INSTITUTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public RequisitionV2 agreement(String agreement) {
    
    this.agreement = agreement;
    return this;
  }

   /**
   * EUA associated with this requisition
   * @return agreement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "EUA associated with this requisition")
  @JsonProperty(JSON_PROPERTY_AGREEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAgreement() {
    return agreement;
  }


  @JsonProperty(JSON_PROPERTY_AGREEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAgreement(String agreement) {
    this.agreement = agreement;
  }


  public RequisitionV2 reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * additional ID to identify the end user
   * @return reference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "additional ID to identify the end user")
  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReference() {
    return reference;
  }


  @JsonProperty(JSON_PROPERTY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReference(String reference) {
    this.reference = reference;
  }


   /**
   * array of account IDs retrieved within a scope of this requisition
   * @return accounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "array of account IDs retrieved within a scope of this requisition")
  @JsonProperty(JSON_PROPERTY_ACCOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAccounts() {
    return accounts;
  }




  public RequisitionV2 userLanguage(String userLanguage) {
    
    this.userLanguage = userLanguage;
    return this;
  }

   /**
   * A two-letter country code (ISO 639-1)
   * @return userLanguage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A two-letter country code (ISO 639-1)")
  @JsonProperty(JSON_PROPERTY_USER_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserLanguage() {
    return userLanguage;
  }


  @JsonProperty(JSON_PROPERTY_USER_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserLanguage(String userLanguage) {
    this.userLanguage = userLanguage;
  }


   /**
   * link to initiate authorization with Institution
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "link to initiate authorization with Institution")
  @JsonProperty(JSON_PROPERTY_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLink() {
    return link;
  }




  public RequisitionV2 ssn(String ssn) {
    
    this.ssn = ssn;
    return this;
  }

   /**
   * optional SSN field to verify ownership of the account
   * @return ssn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "optional SSN field to verify ownership of the account")
  @JsonProperty(JSON_PROPERTY_SSN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSsn() {
    return ssn;
  }


  @JsonProperty(JSON_PROPERTY_SSN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSsn(String ssn) {
    this.ssn = ssn;
  }


  public RequisitionV2 accountSelection(Boolean accountSelection) {
    
    this.accountSelection = accountSelection;
    return this;
  }

   /**
   * option to enable account selection view for the end user
   * @return accountSelection
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "option to enable account selection view for the end user")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_SELECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAccountSelection() {
    return accountSelection;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_SELECTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountSelection(Boolean accountSelection) {
    this.accountSelection = accountSelection;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequisitionV2 requisitionV2 = (RequisitionV2) o;
    return Objects.equals(this.id, requisitionV2.id) &&
        equalsNullable(this.created, requisitionV2.created) &&
        Objects.equals(this.redirect, requisitionV2.redirect) &&
        equalsNullable(this.status, requisitionV2.status) &&
        Objects.equals(this.institutionId, requisitionV2.institutionId) &&
        Objects.equals(this.agreement, requisitionV2.agreement) &&
        Objects.equals(this.reference, requisitionV2.reference) &&
        Objects.equals(this.accounts, requisitionV2.accounts) &&
        Objects.equals(this.userLanguage, requisitionV2.userLanguage) &&
        Objects.equals(this.link, requisitionV2.link) &&
        Objects.equals(this.ssn, requisitionV2.ssn) &&
        Objects.equals(this.accountSelection, requisitionV2.accountSelection);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, hashCodeNullable(created), redirect, hashCodeNullable(status), institutionId, agreement, reference, accounts, userLanguage, link, ssn, accountSelection);
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
    sb.append("class RequisitionV2 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    redirect: ").append(toIndentedString(redirect)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    userLanguage: ").append(toIndentedString(userLanguage)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    accountSelection: ").append(toIndentedString(accountSelection)).append("\n");
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

