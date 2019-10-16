
import java.util.Scanner;

public class Main 
{
    
    public static void main(String[] args) 
    {
        int input;
        do{
        System.out.println("Lista epilogwn: ");
        System.out.println("1) Emfanisi olwn twn tragoudiwn tis listas");
        System.out.println("2) Emfanisi olwn twn kallitexnwn tis listas");
        System.out.println("3) Emfanisi olwn twn album tis listas");
        System.out.println("4) Diorthosi stoixeiwn tis listas");
        System.out.println("5) Anazitisi me basi ton kallitexni");
        System.out.println("6) Anazitisi me basi to album");
        System.out.println("7) Diagrafi me basi ton titlo");
        System.out.println("0) Eksodos");
        System.out.print("Dwste tin epilogi sas: ");
        Scanner in = new Scanner(System.in);
        input = in.nextInt();
        PlayList pl = new PlayList();
        if(input==1)
        {
            pl.PrintAll();
        }
        else if(input==2)
        {
            pl.PrintKal();
        }
        else if(input==3)
        {
            pl.PrintAlbum();
        }
        else if(input==4)
        {
            System.out.print("Dwste ton titlo tou tragoudiou pou epithimite na pragmatopoiisete allagh: ");
            Scanner in2 = new Scanner(System.in);
            String input2 = in2.nextLine();
            pl.Fix(input2);
        }
        else if(input==5)
        {
            
        }
        else if(input==6)
        {
            
        }
        else if(input==7)
        {
            
        }
        else if(input==0)
        {
            System.out.println("Bye");
        }
        else 
        {
            System.out.println("Lathos epilogi!!");
        }
        }while(input!=0);
    }
    
}
