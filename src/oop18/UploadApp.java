package oop18;

import java.util.Scanner;

public class UploadApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        FileUploader fl = new FileUploader();

        System.out.print("Enter the file type: ");
        String fileType = input.nextLine();

        System.out.print("Enter file size: ");
        double fileSizeMB = input.nextDouble();

        try {

            fl.uploadFile(fileType, fileSizeMB);

        } catch(FileTooLargeException e) {

            System.out.println("File exceeded error: " + e.getMessage());

        } catch(UnsupportedFileTypeException e) {

            System.out.println("Storage Error: " + e.getMessage());

        } finally {

            System.out.println("Upload session ended.");
        }

        input.close();
    }
}
