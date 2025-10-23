public class UcgenAlanHesap {
   public UcgenAlanHesap() {
   }

   public static void main(String[] var0) {
      byte var1 = 3;
      byte var2 = 4;
      byte var3 = 5;
      double var4 = (double)(var1 + var2 + var3) / 2.0;
      double var6 = Math.sqrt(var4 * (var4 - (double)var1) * (var4 - (double)var2) * (var4 - (double)var3));
      System.out.println("Üçgenin alanı: " + var6);
   }
}
