package com.meter;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== ІНФОРМАЦІЙНА СИСТЕМА 'Е-ЛІЧИЛЬНИК' (ПРАКТИЧНА №3) ===\n");

        // 1. Користувач
        User user = new User(1, "Казьмирик Євген", "м. Одеса, вул. Садова 5", "+380991234567", "zhenya@example.com", "ACTIVE");
        System.out.println(user);
        user.updateContactDetails("+380997654321", "zhenya_new@example.com");
        System.out.println();

        // 2. Лічильник
        Meter meter = new Meter(101, "SN-987654", "ELECTRICITY", "Квартира 12", "ACTIVE");
        System.out.println(meter);
        meter.toggleStatus();
        meter.updateLocation("Квартира 12 (Балкон)");
        System.out.println();

        // 3. Показники лічильника та Валідація
        MeterReading reading1 = new MeterReading(1, 101, 1500.5, LocalDateTime.now().minusDays(30), "VALID");
        MeterReading reading2 = new MeterReading(2, 101, 1680.0, LocalDateTime.now(), "PENDING");
        System.out.println(reading2);

        System.out.print("Перевірка нових показників: ");
        reading2.validateReading(reading1.getValue());
        System.out.println();

        // 4. Послуга та Тариф
        UtilityService service = new UtilityService(1, "Електроенергія", "кВт*год", "Постачання світла", true);
        Tariff tariff = new Tariff(1, 1, 4.32, "ACTIVE"); // 4.32 грн за кВт
        System.out.println(service);
        System.out.println(tariff);

        double consumed = reading2.getValue() - reading1.getValue(); // 179.5 кВт
        double totalCost = tariff.calculateCost(consumed);
        System.out.println();

        // 5. Формування та оплата рахунку
        Bill bill = new Bill(501, user.getId(), "Жовтень 2026", totalCost, "UNPAID");
        System.out.println(bill);
        bill.markAsPaid();
        System.out.println(bill);
        System.out.println();

        // 6. Лог / Повідомлення
        Message msg = new Message(1001, "INFO", LocalDateTime.now(), "Показники успішно передано та розраховано рахунок.", false);
        System.out.println(msg);
        msg.markAsRead();
        System.out.println(msg);

        System.out.println("\n=== РОБОТУ ПРОГРАМИ УСПІШНО ЗАВЕРШЕНО ===");
    }
}