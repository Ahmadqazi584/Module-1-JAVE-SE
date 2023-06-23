package com.company;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

class product{
    private String Name;
    private String Brand;
    private float Price;
    private String Type;
    private boolean Ecofriendliness;

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    public String getBrand() {
        return Brand;
    }
    public void setBrand(String brand) {
        Brand = brand;
    }

    public float getPrice() {
        return Price;
    }
    public void setPrice(float price) {
        Price = price;
    }

    public String getType() {
        return Type;
    }
    public void setType(String type) {
        Type = type;
    }

    public boolean getEcofriendliness() {
        return Ecofriendliness;
    }
    public void setEcofriendliness(boolean ecofriendliness) {
        Ecofriendliness = ecofriendliness;
    }

    public void print_info(){
        System.out.println("Name : " + getName());
        System.out.println("Brand : " + getBrand());
        System.out.println("Price : " + getPrice());
        System.out.println("Type : " + getType());
        System.out.println("Eco Friendliness : " + getEcofriendliness());
    }
}

class ClothingProduct extends product{
    private String Size;
    private String Material;
    private String Color;
    private String Style;

    public String getSize() {
        return Size;
    }
    public void setSize(String size) {
        Size = size;
    }

    public String getMaterial() {
        return Material;
    }
    public void setMaterial(String material) {
        Material = material;
    }

    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }

    public String getStyle() {
        return Style;
    }
    public void setStyle(String style) {
        Style = style;
    }

    public ClothingProduct() {}

    public ClothingProduct(String Size, String Material, String Color, String Style){
        this.Size = Size;
        this.Material = Material;
        this.Color = Color;
        this.Style = Style;
    }

    @Override
    public void print_info() {
        System.out.println("Size : " + getSize());
        System.out.println("Material : " +getMaterial());
        System.out.println("Color : " + getColor());
        System.out.println("Style : " + getStyle());
    }
}

class SkincareProduct extends product {
    private String SkinType;
    private String [] TargetConcerns = new String[5];
    private Boolean FragranceFree;

    public String getSkinType() {
        return SkinType;
    }
    public void setSkinType(String skinType) {
        SkinType = skinType;
    }

    public String[] getTargetConcerns() {
        return TargetConcerns;
    }
    public void setTargetConcerns(String[] targetConcerns) {
        TargetConcerns = targetConcerns;
    }

    public Boolean getFragranceFree() {
        return FragranceFree;
    }
    public void setFragranceFree(Boolean fragranceFree) {
        FragranceFree = fragranceFree;
    }

    @Override
    public void print_info() {
        System.out.println("Skin Type : " + getSkinType());
        System.out.println("Target Concerns : " + getTargetConcerns());
        System.out.println("Fragrance Free : " + getFragranceFree());
    }
}

class CleaningProduct extends product{
    private String SurfaceType;
    private String Scent;
    private boolean Biodegradable;

    public String getSurfaceType() {
        return SurfaceType;
    }
    public void setSurfaceType(String surfaceType) {
        SurfaceType = surfaceType;
    }

    public String getScent() {
        return Scent;
    }
    public void setScent(String scent) {
        Scent = scent;
    }

    public boolean getBiodegradable() {
        return Biodegradable;
    }
    public void setBiodegradable(boolean biodegradable) {
        Biodegradable = biodegradable;
    }

    @Override
    public void print_info() {
        System.out.println("Surface Type : " + getSurfaceType());
        System.out.println("Scent : " + getScent());
        System.out.println("Biodegradable : " + getBiodegradable());
    }
}

class ElectronicProduct extends product{
    private String PowerSource;
    private Boolean EnergyEfficient;
    private Boolean SmartHomeCompatible;

    public String getPowerSource() {
        return PowerSource;
    }
    public void setPowerSource(String powerSource) {
        PowerSource = powerSource;
    }

    public Boolean getEnergyEfficient() {
        return EnergyEfficient;
    }
    public void setEnergyEfficient(Boolean energyEfficient) {
        EnergyEfficient = energyEfficient;
    }

    public Boolean getSmartHomeCompatible() {
        return SmartHomeCompatible;
    }
    public void setSmartHomeCompatible(Boolean smartHomeCompatible) {
        SmartHomeCompatible = smartHomeCompatible;
    }

    @Override
    public void print_info() {
        System.out.println("Power Source : " + getPowerSource());
        System.out.println("Energy Efficient : " + getEnergyEfficient());
        System.out.println("Smart Home Compatible : " + getSmartHomeCompatible());
    }
}

class PlantProduct extends product{
    private String PotType;
    private String SunlightNeeds;
    private String TypeOfPlant;

    public String getPotType() {
        return PotType;
    }
    public void setPotType(String potType) {
        PotType = potType;
    }

    public String getSunlightNeeds() {
        return SunlightNeeds;
    }
    public void setSunlightNeeds(String sunlightNeeds) {
        SunlightNeeds = sunlightNeeds;
    }

    public String getTypeOfPlant() {
        return TypeOfPlant;
    }
    public void setTypeOfPlant(String typeOfPlant) {
        TypeOfPlant = typeOfPlant;
    }

    @Override
    public void print_info() {
        System.out.println("Pot Type : " + getPotType());
        System.out.println("Sunlight Needs : " + getSunlightNeeds());
        System.out.println("Type Of Plant : " + getTypeOfPlant());
    }
}

class ProductInventory {
    private ArrayList<product> products = new ArrayList<>();

    Scanner sc = new Scanner(System.in);
    public char ch = 'y';
    private String GetName;
    private String checkname;
    private String typeofproduct;
    product obj;
    ClothingProduct cloth_obj;
    SkincareProduct skincare_obj;
    CleaningProduct clean_obj;
    ElectronicProduct elect_obj;
    PlantProduct plant_obj;

    public void add_product(){
        while (ch == 'y'){
            System.out.print("Enter the Type of Product : ");
            typeofproduct = sc.next();
            if (typeofproduct.equals("Clothing")){
                cloth_obj = new ClothingProduct();
                System.out.print("Enter Product Name : ");
                cloth_obj.setName(sc.next());
                System.out.print("Enter Brand : ");
                cloth_obj.setBrand(sc.next());
                System.out.print("Enter Price : ");
                cloth_obj.setPrice(sc.nextFloat());
                cloth_obj.setType(typeofproduct);
                System.out.print("Enter Eco Friendliness : ");
                cloth_obj.setEcofriendliness(sc.nextBoolean());
                System.out.println("Enter Size, Material, Style, and Color : ");
                cloth_obj.setSize(sc.next());
                cloth_obj.setMaterial(sc.next());
                cloth_obj.setStyle(sc.next());
                cloth_obj.setColor(sc.next());

                products.add(cloth_obj);
                System.out.println("product added successfully!");

                System.out.print("Press y/n? " );
                ch = sc.next().charAt(0);
            }

            else if (typeofproduct.equals("Skincare")){
                skincare_obj = new SkincareProduct();
                System.out.print("Enter Product Name : ");
                skincare_obj.setName(sc.next());
                System.out.print("Enter Brand : ");
                skincare_obj.setBrand(sc.next());
                System.out.print("Enter Price : ");
                skincare_obj.setPrice(sc.nextFloat());
                skincare_obj.setType(typeofproduct);
                System.out.print("Enter Eco Friendliness : ");
                skincare_obj.setEcofriendliness(sc.nextBoolean());
                System.out.println("Enter Type & Fragrance Free : ");
                skincare_obj.setSkinType(sc.next());
                skincare_obj.setFragranceFree(sc.nextBoolean());

                products.add(skincare_obj);
                System.out.println("product added successfully!");

                System.out.print("Press y/n? " );
                ch = sc.next().charAt(0);
            }

            else if (typeofproduct.equals("Cleaning")){
                clean_obj = new CleaningProduct();
                System.out.print("Enter Product Name : ");
                clean_obj.setName(sc.next());
                System.out.print("Enter Brand : ");
                clean_obj.setBrand(sc.next());
                System.out.print("Enter Price : ");
                clean_obj.setPrice(sc.nextFloat());
                clean_obj.setType(typeofproduct);
                System.out.print("Enter Eco Friendliness : ");
                clean_obj.setEcofriendliness(sc.nextBoolean());
                System.out.println("Enter Scent, SurfaceType & Biodegradable : ");
                clean_obj.setScent(sc.next());
                clean_obj.setSurfaceType(sc.next());
                clean_obj.setBiodegradable(sc.nextBoolean());

                products.add(clean_obj);
                System.out.println("product added successfully!");

                System.out.print("Press y/n? " );
                ch = sc.next().charAt(0);
            }

            else if(typeofproduct.equals("Electronic")){
                elect_obj = new ElectronicProduct();
                System.out.print("Enter Product Name : ");
                elect_obj.setName(sc.next());
                System.out.print("Enter Brand : ");
                elect_obj.setBrand(sc.next());
                System.out.print("Enter Price : ");
                elect_obj.setPrice(sc.nextFloat());
                elect_obj.setType(typeofproduct);
                System.out.print("Enter Eco Friendliness : ");
                elect_obj.setEcofriendliness(sc.nextBoolean());
                System.out.println("Enter Power Source, Energy Efficient & Home Compactibility : ");
                elect_obj.setPowerSource(sc.next());
                elect_obj.setEnergyEfficient(sc.nextBoolean());
                elect_obj.setSmartHomeCompatible(sc.nextBoolean());

                products.add(elect_obj);
                System.out.println("product added successfully!");

                System.out.print("Press y/n? " );
                ch = sc.next().charAt(0);
            }

            else if (typeofproduct.equals("Plant")){
                plant_obj = new PlantProduct();
                System.out.print("Enter Product Name : ");
                plant_obj.setName(sc.next());
                System.out.print("Enter Brand : ");
                plant_obj.setBrand(sc.next());
                System.out.print("Enter Price : ");
                plant_obj.setPrice(sc.nextFloat());
                plant_obj.setType(typeofproduct);
                System.out.print("Enter Eco Friendliness : ");
                plant_obj.setEcofriendliness(sc.nextBoolean());
                System.out.println("Enter Pot Type, Sunlight & Plant Type : ");
                plant_obj.setPotType(sc.next());
                plant_obj.setSunlightNeeds(sc.next());
                plant_obj.setTypeOfPlant(sc.next());

                products.add(plant_obj);
                System.out.println("product added successfully!");

                System.out.print("Press y/n? " );
                ch = sc.next().charAt(0);
            }

            else
            {
                System.out.print("Press y/n? " );
                ch = sc.next().charAt(0);
            }
        }
    }
    public void remove_product(){
        System.out.print("Enter the product name : " );
        GetName = sc.next();
        for (int i = 0; i < products.size(); i++) {
            checkname = products.get(i).getName();
            if (obj.getName().equals(checkname)){
                products.remove(i);
                System.out.println("Product removed successfully!");
            }else{
                System.out.println("Sorry! entered item no found");
            }
        }
    }
    public void search_product() {
        System.out.print("Enter the product name: ");
        GetName = sc.next();

        boolean found = false; // Variable to track if the product is found

        for (int i = 0; i < products.size(); i++) {
            checkname = products.get(i).getName();
            if (GetName.equals(checkname)) {
                found = true; // Product found
                System.out.println("Product Name : " + products.get(i).getName());
                System.out.println("Product Brand : " + products.get(i).getBrand());
                System.out.println("Product Price : " + products.get(i).getPrice());
                System.out.println("Product Type : " + products.get(i).getType());
                System.out.println("Product Eco-Friendliness : " + products.get(i).getEcofriendliness());
                if (products.get(i) instanceof ClothingProduct) {
                    ClothingProduct clothingProduct = (ClothingProduct) products.get(i);
                    clothingProduct.print_info(); // Print clothing product specific information
                }else if (products.get(i) instanceof SkincareProduct){
                    SkincareProduct skincareProduct = (SkincareProduct) products.get(i);
                    skincareProduct.print_info();
                }else if (products.get(i) instanceof CleaningProduct){
                    CleaningProduct cleaningProduct = (CleaningProduct) products.get(i);
                    cleaningProduct.print_info();
                }else if (products.get(i) instanceof ElectronicProduct){
                    ElectronicProduct electronicProduct = (ElectronicProduct) products.get(i);
                    electronicProduct.print_info();
                }else if (products.get(i) instanceof PlantProduct){
                    PlantProduct plantProduct = (PlantProduct) products.get(i);
                    plantProduct.print_info();
                }else {
                    continue;
                }
            }
        }
        if (!found) {
            System.out.println("Product not found!");
        }
    }
}

public class EcoFriendlyEnvironment {
    public static void main(String[] args) {
        ProductInventory list = new ProductInventory();
        list.add_product();
        list.search_product();
    }
}

