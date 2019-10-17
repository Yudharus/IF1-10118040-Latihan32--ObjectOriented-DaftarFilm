/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118040.latihan32.objectoriented.daftarfilm;

/**
 *
 * @author asus
 * NAMA     : Moch Yudha Rusdian
 * KELAS    : IF-1
 * NIM      : 10118040
 * Deskripsi Program : Program ini untuk menampilkan tampilan dan variabel 
 *                     mahasiswa dari subclass film.
*/
public class Film {
    
   public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;

    public void nowPlaying(String parJudul, String parGenre, double parRating, int parDuration){
        System.out.println("Judul Film  : "+parJudul);
        System.out.println("Genre Film  : "+parGenre);
        System.out.println("Rating Film : "+parRating);
        System.out.println("Duration Film : "+parDuration+" menit\n");
    } 
}
