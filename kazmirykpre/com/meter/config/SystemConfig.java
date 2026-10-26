package com.meter.config;

public class SystemConfig {
    // Package-private поле (видиме тільки в пакеті com.meter.config)
    String configVersion = "v4.0.1";

    // Public метод
    public void printPublicInfo() {
        System.out.println("[Config] Загальні налаштування системи активні.");
    }

    // Package-private метод
    void printInternalConfig() {
        System.out.println("[Config Internal] Конфігурація: " + configVersion);
    }
}