
import java.util.Scanner;

public class PlayList 
{
    Song songs= new Song();
    String str[]=new String[50];
    int size=0;
    String doublicate[]=new String[size];
    public void PrintAll()
    {
        System.out.println("\n\nTragoudi\t"+"Kallitexnis\t"+"Diarkeia\t"+"Album");
        for(int i=0; i<songs.songlist.size();i++)
            System.out.println(songs.songlist.get(i));
    }
    
    public void PrintKal()
    {
        String res;
        for(int i=0; i<songs.songlist.size();i++)
        {
            String splited[]=songs.songlist.get(i).split("\t\t");
            str[i]=splited[1];
        }
        
        for(int i=0; i<songs.songlist.size();i++)
        {
            res=str[i];
                if(!isDuplicate(res, i, str))
                {
                    System.out.println(res);
                   
                }
        }
    }
    
    private static boolean isDuplicate(String item, int j, String[] items) 
    {
        boolean duplicate = Boolean.FALSE;
         for (int i = 0; j > i; i++) 
        {
             if (items[i].equals(item)) 
            {
                 duplicate = Boolean.TRUE;
                break;
            }
        }
        return duplicate;
    }
    
    public void PrintAlbum()
    {
        for(int i=0; i<songs.songlist.size();i++)
        {
            String splited[]=songs.songlist.get(i).split("\t\t");
            System.out.println(splited[3]);
        }
    }
    
    public void Fix(String title)
    {
        String str2[]=new String[50];
        for(int i=0; i<songs.songlist.size();i++)
        {
            String splited[]=songs.songlist.get(i).split("\t\t");
           // str2[i]=splited[0];
            if(title.equals(splited[0]))
            {
                System.out.println("Ti allagi epithimite na kanenete?");
                System.out.println("1) Allagi kallitexni");
                System.out.println("2) Allagi diarkeias tragoudiou");
                System.out.println("3) Allagi album");
                System.out.print("Dwste tin epilogi sas: ");
                Scanner in = new Scanner(System.in);
                int input = in.nextInt();
                if(input==1)
                {
                    System.out.print("Dwste tin allagi: ");
                    Scanner in2 = new Scanner(System.in);
                    String input2 = in2.nextLine();
                    songs.songlist.set(i, splited[0]+"\t\t"+input2+"\t\t"+splited[2]+"\t\t"+splited[3]);
                    System.out.println(songs.songlist.get(i));
                }
                else if(input==2)
                {
                    System.out.print("Dwste tin allagi: ");
                    Scanner in2 = new Scanner(System.in);
                    String input2 = in2.nextLine();
                    songs.songlist.set(i, splited[0]+"\t\t"+splited[1]+"\t\t"+input2+"\t\t"+splited[3]);
                }
                else if(input==3)
                {
                    System.out.print("Dwste tin allagi: ");
                    Scanner in2 = new Scanner(System.in);
                    String input2 = in2.nextLine();
                    songs.songlist.set(i, splited[0]+"\t\t"+splited[1]+"\t\t"+splited[2]+"\t\t"+input2);
                }
                else
                    System.out.println("Lathos epilogi!!");
            }
        }
        
    }
    
}
