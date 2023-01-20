public class MalzemeTipineGoreToplamTutariniHesapla implements ITutarHesaplayici{
    @Override
    public double hesapla(double fiyat, double adet) {
        return fiyat * adet;
    }
}
