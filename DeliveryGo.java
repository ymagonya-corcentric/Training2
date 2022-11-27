public class DeliveryGo {

//Реализовать код для расчета количества возможных маршрутов для доставки N клиентам
//Использовать конструкцию do while и понятие факториала
    //предположим N == 9

    public static void main(String[] args) {

        int varToGo = 9;
        int deliveryWays = 1;

        do {

            // deliveryWays = deliveryWays * varToGo; varToGo--;

            // deliveryWays = deliveryWays * varToGo; varToGo = varToGo - 1;

            deliveryWays *= varToGo--;

        } while(varToGo > 0);

        System.out.println("The amount of possible delivery routes: " + deliveryWays);















    }

}
