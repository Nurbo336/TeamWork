package Shop;

import java.util.Scanner;

public class Switch {
    ClothingProduct clothingProduct = new ClothingProduct();
    ElectronicProduct electronicProduct = new ElectronicProduct();
    void code(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите раздел");
        System.out.println("1. Одежда      ");
        System.out.println("2. Электроника       ");
        int codeShop = scanner.nextInt();
        switch (codeShop) {
            case 1:
                clothingProduct.displayInfo();
                System.out.println("Выберите товар");
                int codeProduct = scanner.nextInt();
                switch (codeProduct){
                    case 1:
                        System.out.println("Введите дистанцию");
                        clothingProduct.setDistance(scanner.nextDouble());
                        System.out.println("За доставку вам надо оплатить "+
                        clothingProduct.CalculateShippingCost(clothingProduct.getDistance())+ " сомов") ;

                        System.out.println("Общая сумма с учётом скидки " +clothingProduct.getDISCOUNT() +clothingProduct.DiscountPrice(clothingProduct.getDISCOUNT() +
                                clothingProduct.CalculateShippingCost(electronicProduct.getDistance()) ) );
                }
                break;
            case 2:
                electronicProduct.displayInfo();
                break;
                }
        }
    }

