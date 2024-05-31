package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class FileManager {
    private static final String RECEIPTS_FOLDER_PATH = "src/main/resources/Receipts/receipts";

    public static void saveOrder(String receipt) {
        String fileName = generateFileName();
        String filePath = RECEIPTS_FOLDER_PATH + fileName;

        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(receipt);
            System.out.println("Order details saved to: " + filePath);
        } catch (IOException e) {
            System.out.println("Error occurred while saving order details: " + e.getMessage());
        }
    }

    private static String generateFileName() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        return formatter.format(now) + ".txt";
    }
}
