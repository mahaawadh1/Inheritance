public class App {
    public static void main(String[] args) throws Exception {
System.out.println("Fursah");
String[] skill = {"Computer Skills","communcation skills"};

Employee maha = new Employee("maha","It",2000);
Director amar = new Director("amar","It",3000, 300);
Engineer haya = new Engineer("haya", "it", 4000, skill);
SalesPerson bader = new SalesPerson("Bader", "hr", 1000, 2000);


 System.err.println(maha);
 System.out.println(amar);
System.out.println(haya);
System.out.println(bader);
         
}
}
