package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {
        Car car1= new Car();
        Car car2= new Car();
        Car car3= new Car();

        car1.setInfo("Mercedes","S600","White",2020,35000);
        car2.setInfo("BMW","M3","Blue",2020,40000);
car3.setInfo("Audi","Q7","red",2015,25000);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        car1.drive();

        ArrayList<Car> carlist =new ArrayList<>();
        carlist.addAll(Arrays.asList(car1,car2,car3));
        System.out.println(carlist);

        for (Car eachcar : carlist) {
            System.out.println(eachcar.brand + ": "+eachcar.price);
        }
/*recall BMW:2005-2009
Mercedes: 1995-1998
 */

        carlist.removeIf(p->p.brand.equals("BMW")&& p.year>2005 &&p.year<=2009);
        carlist.removeIf(p-> p.brand.equals("Toyota") && p.year>1995 && p.year<=1998);




    }
}
