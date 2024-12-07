package com.klef.jfsf.exam;

import jakarta.persistence.*;

@Entity
@Table(name = "Smartphone")
public class Smartphones extends Device {
    private String operatingSystem;
    private String cameraResolution;

    // Getters and Setters
    public String getOperatingSystem() { return operatingSystem; }
    public void setOperatingSystem(String operatingSystem) { this.operatingSystem = operatingSystem; }
    public String getCameraResolution() { return cameraResolution; }
    public void setCameraResolution(String cameraResolution) { this.cameraResolution = cameraResolution; }
}
