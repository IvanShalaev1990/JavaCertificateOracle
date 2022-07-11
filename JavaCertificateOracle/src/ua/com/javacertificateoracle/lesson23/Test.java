package ua.com.javacertificateoracle.lesson23;

public class Test {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat("myaso");

        try {
            tiger.drink("whater");
            try {
                tiger.drink("pivo");
            }
            catch (NeVodaExeption nve){
                System.out.println(nve.getMessage());
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
            finally {
                System.out.println("This is INNER finally block");
            }
        }
        catch (RuntimeException rx){
            System.out.println(rx.getMessage());
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
