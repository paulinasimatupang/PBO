public class Barang {
    String kode_barang;
    String nama_barang;
    private int stok;
    
    public Barang(String kode, String nama, int stok) {//constructor class 'Barang' untuk membuat objek 'Barang'
        kode_barang = kode;
        nama_barang = nama;
        this.stok = stok;
    }
    
    public int getStok() { //mengembalikan nilai 'stok'
        return stok;
    }

    public String getNamaBarang() { //mengembalikan nilai dari 'nama_barang'
        return nama_barang;
    }

    public void tambahStok(int jumlah) { //menambah nilai dari 'stok' dengan jumlah tertentu
        if (jumlah > 0) { //jika jumlah > 0, 'stok' akan ditambah dengan 'jumlah'
            stok += jumlah;
        } else { //kalau kurang, pesan di bawah akan
            System.out.println("Jumlah harus lebih besar dari 0.");
        }
    }
}
