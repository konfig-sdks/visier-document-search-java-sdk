/*
 * Visier Document Search API
 * Visier API for searching for Visier documents
 *
 * The version of the OpenAPI document: 22222222.99201.1200
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.SimpleDocumentHeaderSearchResponseDTO;
import com.konfigthis.client.model.Status;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentSearchApi
 */
@Disabled
public class DocumentSearchApiTest {

    private static DocumentSearchApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new DocumentSearchApi(apiClient);
    }

    /**
     * Perform a simple search for Visier document headers
     *
     * Perform a simple search for Visier document headers, such as analysis titles. Simple search doesn&#39;t support keywords, Boolean expressions, or any other advanced search features.  Example: &#x60;GET /v1alpha/search/simple/document-headers?q&#x3D;My+Query&amp;limit&#x3D;10&#x60; returns the first 10 document headers that best match the query string &#x60;My Query&#x60;.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void simpleSearchDocumentHeadersTest() throws ApiException {
        String q = null;
        Integer limit = null;
        Integer offset = null;
        SimpleDocumentHeaderSearchResponseDTO response = api.simpleSearchDocumentHeaders()
                .q(q)
                .limit(limit)
                .offset(offset)
                .execute();
        // TODO: test validations
    }

}