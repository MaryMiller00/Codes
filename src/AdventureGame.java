import java.util.*;
import java.util.Scanner;
public class AdventureGame {
  public static final int ENDPAGE = -1;
  public static HashMap<Integer,Page> populateBook (){
    HashMap<Integer,Page> adventureBook = new HashMap<>();
    Page page1 = new Page(2,3,"Turn to page 2 or 3");
    Page page2 = new Page(4,5,"Turn to page 4 or 5");
    Page page3 = new Page(6,7,"Turn to page 6 or 7");
    Page page4 = new Page(8,9,"Turn to page 8 or 9");
    Page page5 = new Page(10,11,"Turn to page 10 or 11");
    Page page6 = new Page(12,13,"Turn to page 12 or 13");
    Page page7 = new Page(14,15,"Turn to page 14 or 15");
    Page page8 = new Page(-1,-1,"FINAL PAGE");
    Page page9 = new Page(-1,-1,"FINAL PAGE");
    Page page10 = new Page(-1,-1,"FINAL PAGE");
    Page page11 = new Page(-1,-1,"FINAL PAGE");
    Page page12 = new Page(-1,-1,"FINAL PAGE");
    Page page13 = new Page(-1,-1,"FINAL PAGE");
    Page page14 = new Page(-1,-1,"FINAL PAGE");
   

    

    adventureBook.put(1, page1);
    adventureBook.put(2, page2);
    adventureBook.put(3, page3);
    adventureBook.put(4, page4);
    adventureBook.put(5, page5);
    adventureBook.put(6, page6);
    adventureBook.put(7, page7);
    adventureBook.put(8, page8);
    adventureBook.put(9, page9);
    adventureBook.put(10, page10);
    adventureBook.put(11, page11);
    adventureBook.put(12, page12);
    adventureBook.put(13, page13);
    adventureBook.put(14, page14);
      return adventureBook;
    } 
    public static void main(String[] args) throws Exception {
      HashMap<Integer,Page> adventureBook = populateBook();

 System.out.println("Welcome to this choose your own adventure. Turn to page 1 or 2"); //each page
boolean firstPage = true;
int option1 = 1;
int option2 = 2;

      

Scanner scan = new Scanner(System.in);

      while(scan.hasNextInt()){
    
        try{ 
        Integer pageTurn = scan.nextInt();
        
          if(firstPage){
          firstPage = false;
          
          Page currentPage = adventureBook.get(pageTurn);
          option1 = currentPage.getOption1();
          option2 = currentPage.getOption2();
          System.out.println(currentPage.getPageDesc());
          }
         else if(adventureBook.get(pageTurn) != null && (pageTurn == option1 || pageTurn == option2)){
          Page currentPage = adventureBook.get(pageTurn);
          option1 = currentPage.getOption1();
          option2 = currentPage.getOption2();
          System.out.println(currentPage.getPageDesc());
          if(option1 == ENDPAGE || option2 == ENDPAGE){
            running = false;
            System.out.println("The End");

          }
        } 
        
        
        else{
          System.out.println("page does not exist");
        }
      }
       catch(Exception runException){
        System.out.println("Error, Invalid Input");
       }
      }     
  scan.close();
    }
    
}
