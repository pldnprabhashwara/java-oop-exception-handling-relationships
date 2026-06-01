package oop4;

public class Camera {
    private double megapixels;
    private String cameraType;

    Camera(double megapixels, String cameraType) {
        this.megapixels = megapixels;
        this.cameraType = cameraType;
    }

    public double getMegapixels() {
        return megapixels;
    }

    public String getCameraType() {
        return cameraType;
    }

    public void setMegapixels(double megapixels) {
        this.megapixels = megapixels;
    }

    public void setCameraType(String cameraType){
        this.cameraType = cameraType;
    }

    public boolean isProCamera(){
        return (megapixels > 50);
    }

    public void display(){
        System.out.println("Camera Megapixels: " + megapixels);
        System.out.println("Camera Type: " + cameraType);

        System.out.println("--------------------------------------");

        if(isProCamera()){
            System.out.println("Camera is Pro Camera");
        }else{
            System.out.println("Camera is not Pro Camera");
        }
    }
}
