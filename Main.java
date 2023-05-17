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
    
  while(true){ 
System.out.println("  "); 
 System.out.println(" MENU: ");    
System.out.println(" 1 Dodaj studenta ");
System.out.println(" 2 wyświetl studentów ");
System.out.println(" 3 wyszukiwanie studentów ");   
System.out.println(" 0 Wyjście ");
System.out.println(" podaj wybor: ");
    
    
Scanner scaner = new Scanner(System.in);
int opcja = scaner.nextInt();
    
  System.out.println("Wybrana opcja " + opcja);

       switch (opcja) { // dodawanie studenta imie//nazwisko//wiek/dataurodzenia
           
        case 1:           
          System.out.print(" podaj imie  ");
          String imie = scaner.next();
           
          System.out.print(" podaj nazwisko  ");
          String nazwisko = scaner.next();
           
          System.out.print(" podaj wiek  ");
          int wiek = scaner.nextInt();
           
          System.out.print(" podaj date urodzenia  ");
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
           System.out.println(" student dodany ;D ");
        break; 


          
         case 2: //wyświetlanie wszystkich studentów          
          
           try {    
                  Service s = new Service();
                  var students = s.getStudents();
                 
                    for(Student current : students) {
                       System.out.println(current.ToString());
                         }
                } catch (IOException e) {
                       }
         
           break;

           
        case 3:  //szukanie studenta po imieniu


   try {
        scaner.nextLine();
        System.out.println("podaj imie/nazwisko: ");
        var imie_znajdzi = scaner.nextLine();
        System.out.println("Szukam po imieniu...: ");  
     
        var do_znalezienia = (new Service()).findStudentByName(imie_znajdzi);
        if(do_znalezienia == null){
            System.out.println("nie znaleziono ");
            System.out.println("Szukam po nazwisku...: ");  

          
              var do_znalezieniaa = (new Service()).findStudentBySecondName(imie_znajdzi);
              if(do_znalezieniaa == null){
                 System.out.println("nie znaleziono "); 
              }
              else {
            System.out.print("znaleziono:   ");
            System.out.println(do_znalezieniaa.ToString());
              }       

          
        }else {
            System.out.print("znaleziono:    ");
            System.out.println(do_znalezienia.ToString());
        }
       } catch (IOException e) {
         }
  
        break;      

           
           
        case 0:  
           System.out.println(" program off ");
          System.exit(0);      
        break;
    }

    
  }  
}}