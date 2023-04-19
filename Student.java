public class Student {

  private String Name; 
  private String Secondname;
  private int Age;

  public Student(String name, String secondname ,int age) {
    Name = name;
    Age = age;
    Secondname = secondname;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public String GetSecondame(){return Secondname;}

  public String ToString() {
    return Name + " " + Secondname + " " + Integer.toString(Age);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 3) 
      return new Student("Parse Error", "--", -1);
    return new Student(data[0],data[1], Integer.parseInt(data[2]));
  }
}