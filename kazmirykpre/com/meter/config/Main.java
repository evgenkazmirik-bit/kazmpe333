package com.meter;

import com.meter.config.SystemConfig;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ІНФОРМАЦІЙНА СИСТЕМА 'Е-ЛІЧИЛЬНИК' (ПРАКТИЧНА №4) ===\n");

        // 1. Демонстрація ієрархії Лічильників (BaseEntity -> Meter -> SmartMeter)
        Meter basicMeter = new Meter(101, "ACTIVE", "SN-1001", "WATER", "Кв. 5");
        SmartMeter smartMeter = new SmartMeter(102, "ACTIVE", "SM-2002", "ELECTRICITY", "Кв. 12", "192.168.1.50", true);

        System.out.println("--- Демонстрація поліморфізму та перевизначених методів ---");
        BaseEntity e1 = basicMeter;
        BaseEntity e2 = smartMeter;

        e1.displaySummaryInfo(); // Викличе метод з Meter
        e2.displaySummaryInfo(); // Викличе перевизначений метод з SmartMeter

        smartMeter.sendDataAutomatically(2450.75);
        System.out.println();

        // 2. Демонстрація ієрархії Користувачів (BaseEntity -> User -> CommercialUser)
        User user = new User(1, "ACTIVE", "Іваненко Іван", "м. Одеса", "+380501112233");
        CommercialUser corpUser = new CommercialUser(2, "ACTIVE", "Петров П.П.", "м. Одеса, вул. Базарна 10", "+380487000000", "ТОВ 'Прогрес'", "12345678");

        user.displaySummaryInfo();
        corpUser.displaySummaryInfo(); // Викличе перевизначений метод з CommercialUser
        System.out.println();

        // 3. Демонстрація Package-Private доступу
        System.out.println("--- Демонстрація роботи з пакетами та доступом ---");
        SystemConfig config = new SystemConfig();
        config.printPublicInfo();

        // Рядки нижче закоментовані, оскільки викликають помилку компіляції через package-private доступ між різними пакетами:
        // System.out.println(config.configVersion); // Помилка: configVersion is not public in com.meter.config
        // config.printInternalConfig();             // Помилка: printInternalConfig() is not public in com.meter.config

        System.out.println("\n=== РОБОТУ ПРОГРАМИ УСПІШНО ЗАВЕРШЕНО ===");
    }
}