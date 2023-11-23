package Shop;

public class ClothingProduct implements Product {
    private String tShirt = "Футболки";
    private String trousers = "Штаны";
    private String shoes = "Обувь";
    private String hoodie = "Худи";
    private Double priceOftShirt = 350D;
    private Double priceOfTrousers = 500D;
    private Double priceOfHoodie = 1300D;
    private Double priceOfShoes = 2200D;
    private  Double DISCOUNT = 5D;
    private Double distance;
    private  Double DELIVERY = 150D;

    public String getShirt() {
        return tShirt;
    }

    public String getTrousers() {
        return trousers;
    }

    public String getShoes() {
        return shoes;
    }

    public String getHoodie() {
        return hoodie;
    }

    public Double getPriceOftShirt() {
        return priceOftShirt;
    }

    public Double getPriceOfTrousers() {
        return priceOfTrousers;
    }

    public Double getPriceOfHoodie() {
        return priceOfHoodie;
    }

    public Double getDISCOUNT() {
        return DISCOUNT;
    }

    public Double getDistance() {
        return distance;
    }

    public Double getPriceOfShoes() {
        return priceOfShoes;
    }

    public Double getDELIVERY() {
        return DELIVERY;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @Override
    public void displayInfo() {
        System.out.println("У нас в наличии:" + "\n" +
                            "1:"+getShirt()+ " "+ getPriceOftShirt() +" сом" + "\n"+
                            "2:"+getHoodie()+ " "+ getPriceOfHoodie() +" сом"+ "\n"+
                            "3:"+getTrousers()+ " "+ getPriceOfTrousers() +" сом"+ "\n"+
                            "4:"+getShoes()+ " "+ getPriceOfShoes()+" сом");

    }

    @Override
    public double CalculateShippingCost(Double distance) {
        return getDELIVERY() * getDistance();
    }

    @Override
    public Boolean isFreeShipping() {
        return Product.super.isFreeShipping();
    }

    @Override
    public Double DiscountPrice(Double DiscountPercentage) {
        return getPriceOfShoes() / DISCOUNT;
    }
}
