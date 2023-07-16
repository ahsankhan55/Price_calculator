class Package {
    private String senderName;
    private String senderAddress;
    private String recipientName;
    private String recipientAddress;
    private double weight;
    private double costPerOunce;

    public Package(String senderName, String senderAddress, String recipientName, String recipientAddress, double weight, double costPerOunce) {
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.weight = weight;
        this.costPerOunce = costPerOunce;
    }

    public double calculateCost() {
        return weight * costPerOunce;
    }
}

class TwoDayPackage extends Package {
    private double flatFee;

    public TwoDayPackage(String senderName, String senderAddress, String recipientName, String recipientAddress, double weight, double costPerOunce, double flatFee) {
        super(senderName, senderAddress, recipientName, recipientAddress, weight, costPerOunce);
        this.flatFee = flatFee;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + flatFee;
    }
}

class OvernightPackage extends Package {
    private double additionalFee;

    public OvernightPackage(String senderName, String senderAddress, String recipientName, String recipientAddress, double weight, double costPerOunce, double additionalFee) {
        super(senderName, senderAddress, recipientName, recipientAddress, weight, costPerOunce);
        this.additionalFee = additionalFee;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + additionalFee;
    }
}

public class main2 {
    public static void main(String[] args) {
        Package package1 = new Package("ahsan", "attock", "ali", "islamabad", 4, 5);
        TwoDayPackage package2 = new TwoDayPackage("ahsan", "attock", "ali", "islamabad", 9.0, 5, 9);
        OvernightPackage package3 = new OvernightPackage("ahsan", "attock", "ali", "islamabad", 15, 5, 20);

        System.out.println("Package 1 Cost" + package1.calculateCost());
        System.out.println("Package 2 Cost" + package2.calculateCost());
        System.out.println("Package 3 Cost" + package3.calculateCost());
    }
}