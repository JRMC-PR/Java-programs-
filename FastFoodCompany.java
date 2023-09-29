//   ejercicio numero 2 

public class FastFoodCompany {

    // Parameter
    public int InitialMiles;
    public double PackageWeight, Price, Miles;
    public String Buyer, WhereTo, WhereFrom, OwnerCompany = "FastFoodCompany";

    // Methods
    public FastFoodCompany() {
        PackageWeight = 0.00;
        Miles = 000;
        Price = 0.00;
        Buyer = " ";
        OwnerCompany = "FastFoodCompany";
        WhereTo = " ";
        WhereFrom = " ";

    }

    public FastFoodCompany(double PackageWeight, double Price, double Miles, String Buyer, String WhereTo,
            String WhereFrom) {
        this.PackageWeight = PackageWeight;
        this.Price = Price;
        this.Miles = Miles;
        this.Buyer = Buyer;
        this.WhereTo = WhereTo;
        this.WhereFrom = WhereFrom;

    }// End FastFoodCompany with arguments

    public double PackageCost(double w, double price) {// Method that will calculate the cost of the package being sent
        this.PackageWeight = w;
        this.Price = price;
        if (w <= 2) {
            Price = 3.10;

        } else if (w > 2 && w < 6) {
            Price = 4.20;

        } else if (w > 6 && w < 10) {
            Price = 5.70;

        } else {
            Price = 6.80;
        }

        return Price;
    }// End Package cost
    /*
     * top tp bottom usa length,2,802miles 5
     * from wets to east 3,000miles
     * 
     */

    public double DistanceCharge(double miles) 
    {
        double price = 0.0;
        int DefaultDistance = 500;
        double DefaulCharge = 4.20;
        double RemainignDistance = DefaultDistance - miles;

        if (RemainignDistance >= 0 && RemainignDistance < 500) {

            return DefaulCharge;

        } else if (RemainignDistance >= 500 && RemainignDistance < 1000)/* end if */ {

            price += 4.20;

        } else if (RemainignDistance > 1000 && RemainignDistance < 1500) {
            price += 8.40;

        } else if (RemainignDistance > 1500 && RemainignDistance < 2000) {
            price += 12.60;

        } else if (RemainignDistance > 2000 && RemainignDistance < 2500) {
            price += 16.80;

        } else if (RemainignDistance > 2500 && RemainignDistance < 3000) {
            price += 21;

        } else if (RemainignDistance > 3000 && RemainignDistance < 3500) {
            price += 25.20;

        } else if (RemainignDistance > 3500 && RemainignDistance < 4000) {
            price += 29.40;

        } else if (RemainignDistance > 4000 && RemainignDistance < 4500) {
            price += 33.60;

        } else if (RemainignDistance > 4500 && RemainignDistance < 5000) {
            price += 37.80;

        } else if (RemainignDistance > 5000 && RemainignDistance < 5500) {
            price += 42.00;

        } else if (RemainignDistance > 6000 && RemainignDistance < 6500) {
            price += 46.20;

        } else if (RemainignDistance > 6500 && RemainignDistance < 7000) {
            price += 50.40;

        }

        return price;
    }
}
// end DistanceCharge