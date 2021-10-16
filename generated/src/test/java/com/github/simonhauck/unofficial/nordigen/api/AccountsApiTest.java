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

import org.openapitools.client.model.Account;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountsApi
 */
@Ignore
public class AccountsApiTest {

    private final AccountsApi api = new AccountsApi();

    
    /**
     * 
     *
     * Access account balances.  Balances will be returned in Berlin Group PSD2 format.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAccountBalancesTest() {
        UUID id = null;
        String response = api.retrieveAccountBalances(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Access account details.  Account details will be returned in Berlin Group PSD2 format.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAccountDetailsTest() {
        UUID id = null;
        String response = api.retrieveAccountDetails(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Access account metadata.  Information about the account record, such as the processing status and IBAN.  Account status is recalculated based on the error count in the latest req.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAccountMetadataTest() {
        UUID id = null;
        Account response = api.retrieveAccountMetadata(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Access account transactions.  Transactions will be returned in Berlin Group PSD2 format.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retrieveAccountTransactionsTest() {
        UUID id = null;
        String response = api.retrieveAccountTransactions(id);

        // TODO: test validations
    }
    
}
