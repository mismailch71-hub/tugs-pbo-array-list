public class Main {
    public static void main(String[] args) {
        Bank bankKita = new Bank();

        bankKita.addCustomer("Naruto", "Uzumaki");
        bankKita.addCustomer("Sasuke", "Uchiha");

        Customer customer1 = bankKita.getCustomer(0);
        Customer customer2 = bankKita.getCustomer(1);

        Account akunNaruto = new Account(500000);
        customer1.setAccount(akunNaruto);

        Account akunSasuke = new Account(1000000);
        customer2.setAccount(akunSasuke);

        System.out.println("=== INFO BANK ===");
        System.out.println("Total nasabah saat ini: " + bankKita.getNumOfCustomers());
        System.out.println();

        System.out.println("=== TRANSAKSI NASABAH 1 ===");
        System.out.println("Nama: " + customer1.getFirstName() + " " + customer1.getLastName());
        System.out.println("Saldo awal: Rp " + customer1.getAccount(0).getBalance());

        System.out.println("Melakukan setor tunai Rp 150000...");
        customer1.getAccount(0).deposit(150000);
        System.out.println("Saldo sekarang: Rp " + customer1.getAccount(0).getBalance());
        System.out.println();

        System.out.println("=== TRANSAKSI NASABAH 2 ===");
        System.out.println("Nama: " + customer2.getFirstName() + " " + customer2.getLastName());
        System.out.println("Saldo awal: Rp " + customer2.getAccount(0).getBalance());

        System.out.println("Melakukan tarik tunai Rp 200000...");
        customer2.getAccount(0).withdraw(200000);
        System.out.println("Saldo sekarang: Rp " + customer2.getAccount(0).getBalance());
    }
}
