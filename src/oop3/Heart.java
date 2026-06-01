package oop3;

public class Heart {
    private String heartType;
    private int heartRate;

    Heart(String heartType, int heartRate) {
        this.heartType = heartType;
        this.heartRate = heartRate;
    }

    public String getHeartType() {
        return heartType;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartType(String heartType) {
        this.heartType = heartType;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public boolean checkHeartCondition(){
        return (100 < heartRate && heartRate < 60);
    }

    public void display(){
        System.out.println("Heart Type: " + heartType);
        System.out.println("Heart Rate: " + heartRate);

        System.out.println("======================================");



        if(checkHeartCondition()){
            System.out.println("Abnormal Heart");
        }else{
            System.out.println("Not Abnormal Heart");
        }
    }


}
