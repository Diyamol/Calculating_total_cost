package com.diyamolvarghese_C0787971_A5A6;

public class CalculateChoice {
    private String username;
    private String password;
    private String service;
    private int packageA;
    private int packageB;
    private String options;
    private double storageSmall;
    private double storageLarge;
    private String items;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if(username.equals("Abcd")) {
            this.username = username;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.equals("xys123"))
        {
            this.password = password;
        }
    }

    public int getPackageA() {
        return packageA;
    }

    public void setPackageA(int packageA) {
        this.packageA = packageA;
    }

    public int getPackageB() {
        return packageB;
    }

    public void setPackageB(int packageB) {
        this.packageB = packageB;
    }

    public double getStorageSmall() {
        return storageSmall;
    }

    public void setStorageSmall(double storageSmall) {
        this.storageSmall = storageSmall;
    }

    public double getStorageLarge() {
        return storageLarge;
    }

    public void setStorageLarge(double storageLarge) {
        this.storageLarge = storageLarge;
    }

    public double getBoxesSmall() {
        return boxesSmall;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public CalculateChoice(String service, String options, String items, float totalCost, float serviceCost, float itemCost, float optionsCost) {
        this.service = service;
        this.options = options;
        this.items = items;
        this.totalCost = totalCost;
        this.serviceCost = serviceCost;
        this.itemCost = itemCost;
        this.optionsCost = optionsCost;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public void setBoxesSmall(double boxesSmall) {
        this.boxesSmall = boxesSmall;
    }

    public double getBoxesLarge() {
        return boxesLarge;
    }

    public void setBoxesLarge(double boxesLarge) {
        this.boxesLarge = boxesLarge;
    }

    private double boxesSmall;
    private double boxesLarge;

    public CalculateChoice() {
    }

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private double totalCost;

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(double serviceCost) {
        this.serviceCost = serviceCost;
    }

    public double getItemCost() {
        return itemCost;
    }

    public void setItemCost(double itemCost) {
        this.itemCost = itemCost;
    }

    public double getOptionsCost() {
        return optionsCost;
    }

    public void setOptionsCost(double optionsCost) {
        this.optionsCost = optionsCost;
    }

    private double serviceCost;
    private double itemCost;
    private double optionsCost;

    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void calculateServiceCost() {
        double serviceCost;
        if(service.equals("A"))
        {
            serviceCost=quantity*packageA;
        }
        else if(service.equals("B"))
        {
            serviceCost=quantity*packageB;
        }
        else
        {
            serviceCost=0.0;
        }
        setServiceCost(serviceCost);
    }

    public void calculateOptionsCost(){
        double optionsCost;
        if(options.equals("Small")||options.equals("small"))
        {
            optionsCost=quantity*storageSmall;
        }
        else if(options.equals("Large")||options.equals("large"))
        {
            optionsCost=quantity*storageLarge;
        }
        else
        {
            optionsCost=0.0;
        }
        setOptionsCost(optionsCost);
    }

    public void calculateItemCost(){
        double itemCost;
        if(items.equals("Small")||items.equals("small"))
        {
            itemCost=quantity*boxesSmall;
        }
        else if(items.equals("large")||items.equals("Large"))
        {
            itemCost=quantity*boxesLarge;
        }
        else
        {
            itemCost=0.0;
        }
        setItemCost(itemCost);
    }

    public void calculateTotalCost(){
        double total;
        total=serviceCost+optionsCost+itemCost;
        setTotalCost(total);
    }
}
