
package spesifikasi;

public abstract class Isijam implements jam {

    @Override
    public void Prosesor() {
        System.out.println("\tProsessor\t\t : Exynos 7270");
    }

    @Override
    public void Ram() {
        System.out.println("\tRam\t\t\t : 768 MB");
    }

    @Override
    public void OS() {
        System.out.println("\tOS\t\t\t : Tizen-based wearable platform 2.3.2");
    }
    
}

