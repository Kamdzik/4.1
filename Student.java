public class Student {

  private String Name; 
  private String Secondname;
  private int Age;
  private String Data_urodzenia;

  public Student(String name, String secondname ,int age, String data_urodzenia) {
    Name = name;
    Age = age;
    Secondname = secondname;
    Data_urodzenia = data_urodzenia;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public String GetSecondame(){return Secondname;}
  public String GetData_urodzenia(){return Data_urodzenia;}

  public String ToString() {
    return Name + " " + Secondname + " " + Integer.toString(Age) + " " + Data_urodzenia;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4){
      return new Student("Parse Error", "--", -1, "--");}
    return new Student(data[0],data[1], Integer.parseInt(data[2]), data[3]);
  }
}