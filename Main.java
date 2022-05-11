public class Main {
 
    public static void main(String[] args) {
      Tour a = new Tour();
      a.SetTour();
      a.getTour();
      System.out.print("daylathue: day la nguyen van trien" +   a.getTax()); 
      NoTaxTour b = new NoTaxTour();
      b.SetTour();
      b.getTour();
     System.out.print("cua nguyenvantrien: day la nguyenvantrien " +   b.getTax()); 
    }
 
}