package org.example;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;

public class KeyGeneratorClass {
	
	public static void main(String[] args) {
        try {
            // Generate an RSA key pair
            KeyPair keyPair = generateRSAKeyPair();

            // Get the private and public keys from the key pair
            PrivateKey privateKey = keyPair.getPrivate();
            PublicKey publicKey = keyPair.getPublic();

            // Convert private and public keys to Base64-encoded strings
            String privateKeyBase64 = KeyUtils.toBase64(privateKey.getEncoded());
            String publicKeyBase64 = KeyUtils.toBase64(publicKey.getEncoded());

            // Print the keys (you can store them securely)
            System.out.println("Private Key: " + privateKeyBase64);
            System.out.println("Public Key: " + publicKeyBase64);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static KeyPair generateRSAKeyPair() throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048); // You can adjust the key size based on your security requirements
        return keyPairGenerator.generateKeyPair();
    }
}




