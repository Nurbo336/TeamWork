package Shop;

public interface Product {
    void displayInfo();
    double CalculateShippingCost(Double distance);
    default Boolean isFreeShipping(){
        return true;
    }
    default Double DiscountPrice(Double DiscountPercentage){
        return null;
    }

}
