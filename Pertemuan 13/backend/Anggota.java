import java.sql.*;
import java.util.ArrayList;

public class Anggota {
    private int idAnggota;
    private String nama, alamat, telepon;

    public Anggota(){

    }

    public Anggota(String nama, String alamat, String telepon){
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public void setIdAnggota(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public int getIdAnggota() {
        return idAnggota;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getTelepon() {
        return telepon;
    }
    
    

    public Anggota getById(int id) {
        Anggota anggota = new Anggota();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota WHERE idanggota = '" + id +"'");
        
        try {
            while (rs.next()) {
                anggota = new Anggota();
                anggota.setIdAnggota(rs.getInt("idanggota"));
                anggota.setNama(rs.getString("nama"));
                anggota.setAlamat(rs.getString("alamat"));
                anggota.setTelepon("telepon");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return anggota;
    }

    public ArrayList<Anggota> getAll() {
         ArrayList<Anggota> ListAnggota = new ArrayList();
         
         ResultSet rs = DBHelper.selectQuery("SELECT * FROM anggota");
         
         try {
             while (rs.next()) {                 
                 Anggota anggota = new Anggota();
                 anggota.setIdAnggota(rs.getInt("idanggota"));
                 anggota.setNama(rs.getString("nama"));
                 anggota.setAlamat(rs.getString("alamat"));
                 anggota.setTelepon(rs.getString("telepon"));
                 
                 ListAnggota.add(anggota);
             }
        } catch (Exception e) {
            e.printStackTrace();
        }
         
         return ListAnggota;
    }

    public ArrayList<Anggota> search(String keyword) {
         ArrayList<Anggota> ListAnggota = new ArrayList();

        String sql = "SELECT * FROM anggota WHERE nama LIKE '%" +keyword+"%' OR alamat LIKE '%"+ keyword +"%' OR telepon LIKE '%" + keyword + "%'";

        ResultSet rs = DBHelper.selectQuery(sql);

        try {
            while (rs.next()) {
                Anggota anggota = new Anggota();
                anggota.setIdAnggota(rs.getInt("idanggota"));
                anggota.setNama(rs.getString("nama"));
                anggota.setAlamat(rs.getString("alamat"));
                anggota.setTelepon(rs.getString("telepon"));

                ListAnggota.add(anggota);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListAnggota;
    }

    public void save() {
        if (getById(idAnggota).getIdAnggota() == 0) {

            String SQL = "INSERT INTO anggota (nama, alamat, telepon) VALUES ( '" + this.nama + "','" + this.alamat + "','"+ this.telepon +"' )";

            DBHelper.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.idAnggota +"'";
        DBHelper.executeQuery(SQL);
    }
}