package com.async_task.asynctask.object;

public class Car {

    private String pictureUrl;
    private String model;
    private String year;
    private String carInfo;

    public Car(String pictureUrl, String model, String year, String carInfo) {
        this.pictureUrl = pictureUrl;
        this.model = model;
        this.year = year;
        this.carInfo = carInfo;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}


