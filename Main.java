/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;


class Main {
  public static void main(String[] args) {
   
System.out.println(" 1 Dodaj studenta ");
System.out.println(" 2 wyświetl studentów ");
System.out.println(" 0 Wyjście ");
System.out.println(" podaj wybor ");
    
    
Scanner scaner = new Scanner(System.in);
int opcja = scaner.nextInt();
    
  System.out.println("Wybrana opcja " + opcja);
   

       switch (opcja) { // dodawanie studenta imie//nazwisko//wiek/dataurodzenia
           
        case 1:           
          System.out.println(" podaj imie ");
          String imie = scaner.next();
           
          System.out.println(" podaj nazwisko ");
          String nazwisko = scaner.next();
           
          System.out.println(" podaj wiek ");
          int wiek = scaner.nextInt();
           
          System.out.println(" podaj date urodzenia ");
          String dt_ur = scaner.next();
           
              try {
                    Service s = new Service();
                    s.addStudent(new Student(imie, nazwisko, wiek, dt_ur));
                
                     //var students = s.getStudents();
                     //  for(Student current : students) {
                     //      System.out.println(current.ToString());
                     //     }
                
                  } catch (IOException e) {
                  }
        break; 


          
         case 2: //wyświetlanie wszystkich studentów 
               try {
                  //  Service s = new Service();
                  //  s.addStudent(new Student(imie, wiek));
                  //  var students = s.getStudents();
    
                  Service s = new Service();
                  var students = s.getStudents();
                 
                    for(Student current : students) {
                       System.out.println(current.ToString());
                         }
                      } catch (IOException e) {
                    }
          break;



           
           
        case 0:   
           
          System.exit(0);      
        break;
    }
  }  
}