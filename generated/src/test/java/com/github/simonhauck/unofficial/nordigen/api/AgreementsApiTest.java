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


package com.github.simonhauck.unofficial.nordigen.api;

import org.openapitools.client.model.EndUserAgreement;
import org.openapitools.client.model.EnduserAcceptanceDetails;
import org.openapitools.client.model.PaginatedEndUserAgreementList;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AgreementsApi
 */
@Ignore
public class AgreementsApiTest {

    private final AgreementsApi api = new AgreementsApi();

    
    /**
     * 
     *
     * Accept an end-user agreement via the API.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void acceptEUATest() {
        UUID id = null;
        EnduserAcceptanceDetails enduserAcceptanceDetails = null;
        EndUserAgreement response = api.acceptEUA(id, enduserAcceptanceDetails);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * API endpoints related to end-user agreements.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createEUATest() {
        EndUserAgreement endUserAgreement = null;
        EndUserAgreement response = api.createEUA(endUserAgreement);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete End User Agreement.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteEUAByIdTest() {
        UUID id = null;
        api.deleteEUAById(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * API endpoints related to end-user agreements.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAllEUAsForAnEndUserTest() {
        String enduserId = null;
        Integer limit = null;
        Integer offset = null;
        PaginatedEndUserAgreementList response = api.retrieveAllEUAsForAnEndUser(enduserId, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * API endpoints related to end-user agreements.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveEUAByIdTest() {
        UUID id = null;
        EndUserAgreement response = api.retrieveEUAById(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Show the text of the end-user agreement.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveEUATextTest() {
        UUID id = null;
        String response = api.retrieveEUAText(id);

        // TODO: test validations
    }
    
}
