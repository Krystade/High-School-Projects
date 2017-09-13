//Jack Schmid

/*ToDo
 * 
 * Make GUI
 * Display Map
 * Make Timer
 * 
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class Capital extends JFrame{
    public static void main (String[] args){
        //ImageIcon firstImage;
        //JLabel image;
        JFrame container = new JFrame("memes?");
        //test.setVisible(true);
        //Container container = new Container();
        //container.setLayout(new FlowLayout());
        //container.setLayout(null);
        ImageIcon firstImg = new ImageIcon("pic0.jpg");
        JLabel image = new JLabel(firstImg);
        
        container.setSize(1280,780);
        container.setVisible(true);
        
        
        //Capital test = new Capital();
        //test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        String[][] states = {
        {"Alabama","Birmingham","Mobile","Huntsville","Tuscaloosa"},
        {"Alaska","Anchorage","Fairbanks","Sitka","Ketchikan"},
        {"Arizona","Tucson","Mesa","Chandler","Glendale"},
        {"Arkansas","Fort Smith","Fayetteville","Springdale","Jonesboro"},
        {"California","Los Angeles","San Diego","San Francisco","Fresno"},
        {"Colorado","Colorado Springs","Aurora","Fort Collins","Lakewood"},
        {"Connecticut","Bridgeport","New Haven","Stamford","Waterbury"},
        {"Delaware","Wilmington","Newark","Middletown","Smyrna"},
        {"Florida","Miami","Tampa","Saint Petersburg","Orlando"},
        {"Georgia","Savannah","Athens","Sandy Springs","Columbus"},
        {"Hawaii","Pearl City","Hilo","Kailua","Waipahu"},
        {"Idaho","Nampa","Meridian","Idaho Falls","Pocatello"},
        {"Illinois","Chicago","Aurora","Rockford","Joliet"},
        {"Indiana","Fort Wayne","Evansville","South Bend","Hammond"},
        {"Iowa","Cedar Rapids","Davenport","Sioux City","Waterloo"},
        {"Kansas","Wichita","Overland Park","Kansas City","Olathe"},
        {"Kentucky","Louisville","Bowling Green","Owensboro","Covington"},
        {"Louisiana","New Orleans","Shreveport","Lafayette","Lake Charles"},
        {"Maine","Portland","Bangor","South Portland","Auburn"},
        {"Maryland","Baltimore","Rockville","Gaithersburg","Bowie"},
        {"Massachusetts","Worcester","Lowell","Cambridge","New Bedford"},
        {"Michigan","Detroit","Grand Rapids","Warren","Sterling Heights"},
        {"Minnesota","Minneapolis","Rochester","Duluth","Bloomington"},
        {"Mississippi","Gulfport","Southaven","Hattiesburg","Biloxi"},
        {"Missouri","Kansas City","Saint Louis","Independence","Bozeman"},
        {"Montana","Missoula","Great Falls","Bozeman","Butte-Silver Bow"},
        {"Nebraska","Omaha","Bellevue","Grand Island","Kearney"},
        {"Nevada","Las Vegas","Reno","North Las Vegas","Sparks"},
        {"New Hampshire","Manchester","Nashua","Rochester","Keene"},
        {"New Jersey","Jersey City","Paterson","Elizabeth","Clifton"},
        {"New Mexico","Albuquerque","Las Cruces","Rio Rancho","Roswell"},
        {"New York","Buffalo","Rochester","Yonkers","Syracuse"},
        {"North Carolina","Charlotte","Greensboro","Winston-Salem","Durham"},
        {"North Dakota","Grand Forks","Minot","West Fargo","Mandan"},
        {"Ohio","Cleveland","Cincinnati","Toledo","Akron"},
        {"Oklahoma","Moore","Tulsa","Norman","Broken Arrow"},
        {"Oregon","Portland","Eugene","Gresham","Hillsboro"},
        {"Pennsylvania","Philadelphia","Pittsburgh","Allentown","Erie"},
        {"Rhode Island","Warwick","Cranston","Pawtucket","East Providence"},
        {"South Carolina","North Charleston","Mount Pleasant","Rock Hill","Greenville"},
        {"South Dakota","Sioux Falls","Rapid City","Aberdeen","Brookings"},
        {"Tennessee","Memphis","Knoxville","Chattanooga","Clarksville"},
        {"Texas","Houston","San Antonio","Dallas","Fort Worth"},
        {"Utah","West Valley City","Provo","West Jordan","Orem"},
        {"Vermont","Burlington","South Burlington","Rutland","Barre"},
        {"Virginia","Virginia Beach","Norfolk","Chesapeake","Newport"},
        {"Washington","Seattle","Tacoma","Vancouver","Bellevue"},
        {"West Virginia","Huntington","Parkersburg","Morgantown","Wheeling"},
        {"Wisconsin","Milwaukee","Green Bay","Kenosha","Racine"},
        {"Wyoming","Casper","Laramie","Gillette","Rock Springs"}
        };
        
        String[] caps = new String[50];
        caps[0] = "Montgomery";
        caps[1] = "Juneau";
        caps[2] = "Phoenix";
        caps[3] = "Little Rock";
        caps[4] = "Sacramento";
        caps[5] = "Denver";
        caps[6] = "Hartford";
        caps[7] = "Dover";
        caps[8] = "Tallahassee";
        caps[9] = "Atlanta";
        caps[10] = "Honolulu";
        caps[11] = "Boise";
        caps[12] = "Springfield";
        caps[13] = "Indianapolis";
        caps[14] = "Des Moines";
        caps[15] = "Topeka";
        caps[16] = "Frankfort";
        caps[17] = "Baton Rouge";
        caps[18] = "Augusta";
        caps[19] = "Annapolis";
        caps[20] = "Boston";
        caps[21] = "Lansing";
        caps[22] = "Saint Paul";
        caps[23] = "Jackson";
        caps[24] = "Jefferson City";
        caps[25] = "Helena";
        caps[26] = "Lincoln";
        caps[27] = "Carson City";
        caps[28] = "Concord";
        caps[29] = "Trenton";
        caps[30] = "SantaFe";
        caps[31] = "Albany";
        caps[32] = "Raleigh";
        caps[33] = "Bismarck";
        caps[34] = "Columbus";
        caps[35] = "Oklahoma City";
        caps[36] = "Salem";
        caps[37] = "Harrisburg";
        caps[38] = "Providence";
        caps[39] = "Columbia";
        caps[40] = "Pierre";
        caps[41] = "Nashville";
        caps[42] = "Austin";
        caps[43] = "Salt Lake City";
        caps[44] = "Montpelier";
        caps[45] = "Richmond";
        caps[46] = "Olympia";
        caps[47] = "Charleston";
        caps[48] = "Madison";
        caps[49] = "Cheyenne";
        int score = 0;
        boolean done = false;
        boolean contains = true;
        
        //Container container = getContentPane();
        //container.setLayout( new FlowLayout() );
        
        while (done != true){
            //printKey(states, caps);
            int answer = (int)(Math.random() * 50);
            
            firstImg = new ImageIcon(states[answer][0] + ".jpg");
            //image = new JLabel();
            image.setIcon(firstImg);
            container.add(image);
            //container.add(image);
                
            if (caps[answer].equals("z")){
                continue;
            }else{
                String[] mc = {states[answer][1], states[answer][2],states[answer][3],states[answer][4],caps[answer]};
                Shuffle(mc);
                Shuffle(mc);
                
                Object[] options = {mc[0],
                                    mc[1],
                                    mc[2],
                                    mc[3],
                                    mc[4]};
                int n = JOptionPane.showOptionDialog(null,
                    "Capital of " + states[answer][0],
                    "States and Capitals",
                    JOptionPane.INFORMATION_MESSAGE,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]);
                    
                String guess = mc[n];
                    
                if((guess).equals((caps[answer]))){                    
                    JOptionPane.showMessageDialog(null,"Correct! " + caps[answer] + " is the capital of " + states[answer][0]);
                    caps[answer] = "z";
                    score += 1;
                }else{
                    JOptionPane.showMessageDialog(null,guess + " is not the captal of " + states[answer][0] + "\nThe answer was " + caps[answer]);
                    score--;
                }
                int x = JOptionPane.showConfirmDialog(null, "Continue?\nScore: " + score);
                if(x != 0){
                    done = true;
                }
            }
        }
    }
    
    /*public Capital(){
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        //container.setLayout(null);
        ImageIcon firstImg = new ImageIcon("pic0.jpg");
        JLabel image = new JLabel(firstImg);
        
        setSize(1280,780);
        setVisible(true);
    }*/
    
    static void printKey(String[][] states, String[] caps){
        System.out.print("\f");
        for(int i = 0; i < 50; i++){
            if(states[i][0].length() <= 7){
                System.out.print(states[i][0] + "\t\t" + caps[i] + "\n");
            }else{
                System.out.print(states[i][0] + "\t" + caps[i] + "\n");
            }
        }
    }
    
    static void Shuffle(String[] arr){
        String temp = "";
        for(int i = 0; i < arr.length; i++){
            int rand = (int)(Math.random() * 4) + 1;
            temp = arr[rand];
            arr[rand] = arr[i];
            arr[i] = temp;
        }
    }
    
}