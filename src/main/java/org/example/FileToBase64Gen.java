package org.example;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class FileToBase64Gen {
    public static void main(String[] args) {
        try {
            // Replace these paths with the actual paths to your private and public key files
            String privateKeyPath = "/path/to/your/private_key.pem";
            String publicKeyPath = "/path/to/your/public_key.pem";

            // Read the private key file content
            byte[] privateKeyBytes = Files.readAllBytes(Paths.get(privateKeyPath));

            // Convert private key to Base64
            String privateKeyBase64 = Base64.getEncoder().encodeToString(privateKeyBytes);
            System.out.println("Private Key (Base64):");
            System.out.println(privateKeyBase64);

            // Read the public key file content
            byte[] publicKeyBytes = Files.readAllBytes(Paths.get(publicKeyPath));

            // Convert public key to Base64
            String publicKeyBase64 = Base64.getEncoder().encodeToString(publicKeyBytes);
            System.out.println("\nPublic Key (Base64):");
            System.out.println(publicKeyBase64);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
