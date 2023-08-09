import java.util.Scanner;

// Decoder.java

public class Decoder {
    // Main
    public static void main(String[] args) {
        // Scanner For User Input
        Scanner input = new Scanner(System.in);

        // Decoded String
        String decoded = "";

        // Input Encoded Information From The User
        System.out.println("Enter Here The Encoded Information:");
        String encoded = input.nextLine();

        // Empty Line
        System.out.println();

        // Input Decoder From The User
        System.out.println("Choose The Decoder Method (ASCII, Binary, Hex, Octal):");
        String decoder = input.nextLine().trim().toUpperCase();

        // Empty Line
        System.out.println();

        // Check Decoder And Execute Appropriate Decoder
        switch(decoder) {
            case "ASCII":
                decoded = decodeAscii(encoded);
                break;
            case "BINARY":
                decoded = decodeBinary(encoded);
                break;
            case "HEX":
                decoded = decodeHex(encoded);
                break;
            case "OCTAL":
                decoded = decodeOctal(encoded);
                break;
            default:
                System.out.println("Invalid Decoder.");
        }

        if (decoded.length() > 0) {
            System.out.println("Here is Your Decoded Information Relative To Your Choice:");
            System.out.println(decoded);
        }
        
        // Empty Line
        System.out.println();

        // Clean Up
        input.close();
    }


    // Hex Decoder
    private static String decodeHex(String encoded) {
        String decoded = "";
        // Convert Each Character Of Encoded String To It's Hex Value
        for (int i = 0; i < encoded.length(); i++) {
            // Get Ascii Value Of Current Character
            int ascii = encoded.charAt(i);
            // Convert Ascii Value To Hex String And Append It To Decoded String
            decoded += String.format("%X ", ascii);
        }
        // Return Decoded String
        return decoded.strip();
    }

    // Octal Decoder
    private static String decodeOctal(String encoded) {
        String decoded = "";
        // Convert Each Character Of Encoded String To It's Octal Value
        for (int i = 0; i < encoded.length(); i++) {
            // Get Ascii Value Of Current Character
            int ascii = encoded.charAt(i);
            // Convert Ascii Value To Binary String And Append It To Decoded String
            decoded += Integer.toOctalString(ascii) + " ";
        }
        // Return Decoded String
        return decoded.strip();
    }

    // Binary Decoder
    private static String decodeBinary(String encoded) {
        String decoded = "";
        // Convert Each Character Of Encoded String To It's Binary Value
        for (int i = 0; i < encoded.length(); i++) {
            // Get Ascii Value Of Current Character
            int ascii = encoded.charAt(i);
            // Convert Ascii Value To Binary String And Append It To Decoded String
            decoded += String.format("%08d ", Integer.parseInt(Integer.toBinaryString(ascii)));
        }
        // Return Decoded String
        return decoded.strip();
    }

    // ASCII Decoder
    private static String decodeAscii(String encoded) {
        String decoded = "";
        // Convert Each Character Of Encoded String To It's Ascii Value
        for (int i = 0; i < encoded.length(); i++) {
            // Get Ascii Value Of Current Character
            int ascii = encoded.charAt(i);
            // Append Ascii Value To Decoded String
            decoded += ascii + " ";
        }
        // Return Decoded String
        return decoded.strip();
    }
}
