package Shop;

public class ElectronicProduct  implements Product {
    private String iPhone = "iPhone";
    private String iPad = "Ipad" ;
    private String macBook = "MacBook";
    private String iMac = "IMac" ;
    private String airPods = "AirPods";
    private Double priceOfiPhone = 1200D;
    private Double priceOfiPad = 690D;
    private Double priceOfMacBook = 2100D;
    private Double priceOfiMac = 3000D;
    private Double priceOfAirPods = 250D;
    private  Double DISCOUNT = 20D;
    private Double distance;
    private  Double DELIVERY = 150D;

    public String getiPhone() {
        return iPhone;
    }

    public String getiPad() {
        return iPad;
    }

    public String getMacBook() {
        return macBook;
    }

    public String getiMac() {
        return iMac;
    }

    public String getAirPods() {
        return airPods;
    }

    public Double getPriceOfiPhone() {
        return priceOfiPhone;
    }

    public Double getPriceOfiPad() {
        return priceOfiPad;
    }

    public Double getPriceOfMacBook() {
        return priceOfMacBook;
    }

    public Double getPriceOfiMac() {
        return priceOfiMac;
    }

    public Double getPriceOfAirPods() {
        return priceOfAirPods;
    }

    public Double getDISCOUNT() {
        return DISCOUNT;
    }

    public Double getDistance() {
        return distance;
    }

    public Double getDELIVERY() {
        return DELIVERY;
    }
    @Override
    public void displayInfo() {
        System.out.println("Добро пожаловать в Apple Store");
        System.out.println("У нас в наличии:" + "\n" +
                "1:"+getiPhone()+ " "+ getPriceOfiPhone() +" $" + "\n"+
                "2:"+getiPad()+ " "+ getPriceOfiPad() +" $"+ "\n"+
                "3:"+getiMac()+ " "+ getPriceOfiMac() +" $"+ "\n"+
                "4:"+getMacBook()+ " "+ getPriceOfMacBook()+" $"+ "\n"+
                "5:"+getAirPods()+ " "+ getPriceOfAirPods()+ " $");

    }

    @Override
    public double CalculateShippingCost(Double distance) {
        return distance * DELIVERY;
    }

    @Override
    public Boolean isFreeShipping() {
        return Product.super.isFreeShipping();
    }

    @Override
    public Double DiscountPrice(Double DiscountPercentage) {
        return getPriceOfMacBook() / DiscountPercentage;
    }
}
