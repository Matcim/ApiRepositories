package co.develhope.EsercizioApiSpringRepositories.entities;


import javax.persistence.*;

@Entity
@Table
public class Car {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String modelName;
    @Column(nullable = false)
    private int serialNumber;
    @Column(nullable = false)
    private Double currentPrice;

    private Car(Long id,String modelName,int serialNumber,double currentPrice){
        this.id=id;
        this.modelName=modelName;
        this.serialNumber=serialNumber;
        this.currentPrice=currentPrice;
    }

    private Car(){

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

}
