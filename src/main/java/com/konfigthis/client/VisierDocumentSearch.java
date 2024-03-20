package com.konfigthis.client;

import com.konfigthis.client.api.DocumentSearchApi;

public class VisierDocumentSearch {
    private ApiClient apiClient;
    public final DocumentSearchApi documentSearch;

    public VisierDocumentSearch() {
        this(null);
    }

    public VisierDocumentSearch(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.documentSearch = new DocumentSearchApi(this.apiClient);
    }

}
