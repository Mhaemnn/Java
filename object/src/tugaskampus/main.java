package tugaskampus;

class Buku{
    String judul;
    String  penulis;
}
    Buku(String judul, String penulis){
    this.judul = judul;
    this.penulis = penulis;
    }
    void display(){
    System.out.println("\nJudul\t:" + this.judul);
    System.out.princlass Buku{
            String judul;
            String penulis;

            Buku(String judul, String penulis){
                this.judul = judul;
                this.penulis = penulis;
            }
            void disply(){
                System.out.println("\nJudul\t:" + this.judul);
                System.out.println("Penulis\t: " + this.penulis);

                Buku buku1 = new Buku("pengantar teknik informatika", "rama");
                buku1.disply();


                String addressBuku1 = Integer.toHexString(System.identityHashCode(buku1));
                System.out.println(addressBuku1);

            }
            tln("penulis\: " +this.penulis);
    }
public class main {
    public static void main(String[] args){
        System.out.println("test");
    }
}

