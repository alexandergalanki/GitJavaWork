



import java.util.Scanner;
public class MainInstrument {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Music Instrument to be played\r\nElectric Guitar\r\nElectronic Keyboard");
        switch(sc.nextLine())
        {
            case "Electric Guitar": Electricguitar elegut=new Electricguitar();
                                        elegut.play();
                                        break;
            case "Electronic Keyboard": Electronickey elekey=new Electronickey();
                                        elekey.play();
                                        break;
            default: System.out.println("Instrument Type in not in the given list"); 
            
        }
    }
}