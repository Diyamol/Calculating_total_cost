package com.diyamolvarghese_C0787971_A5A6;

import javax.swing.JOptionPane;

public class Assignment56 {
    public static void main(String[] args){
        double serviceCost,itemCost,totalCost;
        double optionsCost;
        String firstname,lastname;
        String[] name=new String[2];
        CalculateChoice objCalc=new CalculateChoice();
        name=checkUsernamePassword();
        firstname=name[0];
        lastname=name[1];
        if(firstname!=null && lastname!=null)
        {
            serviceCost=selectServices();
            optionsCost=selectOptions();
            itemCost=selectItems();
            totalCost=calculateTotalCost(serviceCost,optionsCost,itemCost);
            printResults(firstname,lastname,totalCost);
        }
    }

    public static String[] checkUsernamePassword() {
        CalculateChoice objCalc=new CalculateChoice();
        String[] name=new String[2];
        int i=0,j=0;
        boolean flag=false;
        while (i<3)
        {
            String username=JOptionPane.showInputDialog("Enter the username:");
            objCalc.setUsername(username);
            if(username.equals(objCalc.getUsername()))
            {
                i=4;
                flag=true;
            }
            else {
                JOptionPane.showMessageDialog(null,"Username is incorrect");
                i++;
            }
        }
        if(i==3)
        {
            JOptionPane.showMessageDialog(null,"You have exceeded your attempts!! Good Bye");
        }
        else
        {
            while (j<3&&flag)
            {
                String password=JOptionPane.showInputDialog("Enter your password: ");
                objCalc.setPassword(password);
                if(password.equals(objCalc.getPassword()))
                {
                    j=4;
                    flag=false;
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"password is incorrect");
                    j++;
                }
            }
            if(j==3)
            {
                JOptionPane.showMessageDialog(null,"You have exceeded your limits!! Good Bye");
            }
            else
            {
                name=insertDetails();
            }
        }
        return name;
    }

    public static String[] insertDetails(){
        String[] name=new String[2];
        CalculateChoice objCalc=new CalculateChoice();
        String firstname=JOptionPane.showInputDialog("Enter firstname: ");
        objCalc.setFirstName(firstname);
        String lastname=JOptionPane.showInputDialog("Enter lastname: ");
        objCalc.setLastName(lastname);
        name[0]=firstname;
        name[1]=lastname;
        return name;
    }

    public static double selectServices(){
        CalculateChoice objCalc=new CalculateChoice();
        String service;
        int quantity;
        double serviceCost;
        service=JOptionPane.showInputDialog("Select package A or B: ");
        objCalc.setService(service);
        objCalc.setPackageA(100);
        objCalc.setPackageB(150);
        quantity=Integer.parseInt(JOptionPane.showInputDialog("Enter the hours you need: "));
        objCalc.setQuantity(quantity);
        objCalc.calculateServiceCost();
        serviceCost=objCalc.getServiceCost();
        return serviceCost;
    }

    public static double selectOptions(){
        CalculateChoice objCalc=new CalculateChoice();
        String options;
        int quantity;
        double optionsCost;
        options=JOptionPane.showInputDialog("Select a storage option small or large: ");
        objCalc.setOptions(options);
        objCalc.setStorageSmall(8);
        objCalc.setStorageLarge(20.11);
        quantity=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of days you need: "));
        objCalc.setQuantity(quantity);
        objCalc.calculateOptionsCost();
        optionsCost=objCalc.getOptionsCost();
        return optionsCost;
    }

    public static double selectItems(){
        CalculateChoice objCalc=new CalculateChoice();
        String items;
        int quantity;
        double itemCost;
        items=JOptionPane.showInputDialog("Select an item small or large: ");
        objCalc.setItems(items);
        objCalc.setBoxesSmall(2.50);
        objCalc.setBoxesLarge(4.50);
        quantity=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of days you need: "));
        objCalc.setQuantity(quantity);
        objCalc.calculateItemCost();
        itemCost=objCalc.getItemCost();
        return itemCost;
    }

    public static double calculateTotalCost(double serviceCost,double optionsCost,double itemCost){
        double totalCost;
        CalculateChoice objCalc=new CalculateChoice();
        objCalc.setServiceCost(serviceCost);
        objCalc.setOptionsCost(optionsCost);
        objCalc.setItemCost(itemCost);
        objCalc.calculateTotalCost();
        totalCost=objCalc.getTotalCost();
        return totalCost;
    }

    public static void printResults(String firstname,String lastname, double totalcost){
        JOptionPane.showMessageDialog(null,"Dear "+firstname+" "+lastname+" your total cost is, "+totalcost);
    }
}
