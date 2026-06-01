package oop18;

public class FileUploader {
    public void uploadFile(String fileType, double fileSizeMB)
        throws UnsupportedFileTypeException, FileTooLargeException{

        if(!fileType.equalsIgnoreCase("pdf") &&
                !fileType.equalsIgnoreCase("jpg") &&
                !fileType.equalsIgnoreCase("png")){

            throw new UnsupportedFileTypeException("File type is not supported");
        }

        if(fileSizeMB > 10){
            throw new  FileTooLargeException("File size must not exceed 10MB");
        }

        System.out.println("File uploaded successfully");
    }
}
