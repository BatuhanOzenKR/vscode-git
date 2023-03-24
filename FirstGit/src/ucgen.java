public class ucgen {

    public int Taban;
    public int Yukseklik;

    public void Ucgen(int taban, int yukseklik) {
        this.Taban = taban;
        this.Yukseklik = yukseklik;
    }

    public int Alan() {
        return this.Yukseklik * this.Taban / 2;
    }
}