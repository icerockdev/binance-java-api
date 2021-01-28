package com.binance.api.client.config;

/**
 * Configuration used for Binance operations.
 */
public class BinanceApiConfig {
    public String baseDomain = "binance.com";

    public String apiBaseUrl() {
        return String.format("https://api.%s", baseDomain);
    }

    public String streamApiBaseUrl() {
        return String.format("wss://stream.%s:9443/ws", baseDomain);
    }

    public String assetInfoApiBaseUrl() {
        return String.format("https://%s/", baseDomain);
    }

    public static BinanceApiConfig instance = new BinanceApiConfig();

    /**
     * Get the URL base domain name (e.g., binance.com).
     *
     * @return The base domain for URLs
     */
    public static String getBaseDomain() {
        return instance.baseDomain;
    }

    /**
     * REST API base URL.
     */
    public static String getApiBaseUrl() {
        return instance.apiBaseUrl();
    }

    /**
     * Streaming API base URL.
     */
    public static String getStreamApiBaseUrl() {
        return instance.streamApiBaseUrl();
    }

    /**
     * Asset info base URL.
     */
    public static String getAssetInfoApiBaseUrl() {
        return instance.assetInfoApiBaseUrl();
    }
}
