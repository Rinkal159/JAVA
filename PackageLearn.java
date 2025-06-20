import school.*;

class Information extends School {
    public void printInfo() {
        System.out.println("name : " + name);
        System.out.println("address : " + address);
    }

    Information(String n, String a) {
        this.name = n;
        this.address = a;
    }
}

public class PackageLearn {
    public static void main(String[] args) {
        Information i1 = new Information("progressive", "bharuch");
        i1.printInfo();
    }
}
