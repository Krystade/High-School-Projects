//Jack Schmid
public class StudentDriver{
    public static void main(String[] args){
        String major[] = {"Agriculture, Agriculture Operations, and Related Sciences","Architecture and Related Services","Area, Ethnic, Cultural, Gender, and Group Studies","Aviation","Biological and Biomedical Sciences","Business, Management, Marketing, and Related Support Services","Communication, Journalism, and Related Programs","Communications Technologies/technicians and Support Services","Computer and Information Sciences and Support Services","Construction Trades","Education","Engineering Technologies and Engineering-Related Fields","Engineering","English Language and Literature/letters","Family and Consumer Sciences/human Sciences","Foreign Languages, Literatures, and Linguistics","Health Professions and Related Programs","History","Homeland Security, Law Enforcement, Firefighting","Human Services","Legal Professions and Studies","Liberal Arts and Sciences Studies and Humanities","Library Science","Mathematics and Statistics","Mechanic and Repair Technologies/technicians","Military Technologies and Applied Sciences","Multi/interdisciplinary Studies","Natural Resources and Conservation","Parks, Recreation, Leisure, and Fitness Studies","Personal and Culinary Services","Philosophy and Religious Studies","Physical Sciences","Precision Production","Psychology","Science Technologies/technicians","Social Sciences","Theology and Religious Vocations","Transportation and Materials Moving","Visual and Performing Arts"};
        String name[] = {"Shay","Alyssa","Luca","Lee","Rae","Ray","Kyle","London","Emma","Raimy","Amari","Claire","Rachel","Hailey","Kay","Akiyama","Adrian","Ariana","Christian","Kim","Paris","Kaylee","Morgan","Carrie","Jasmine","Alexis","Aria","Ava","Emily","Olivia","Isabella","Ambrosia","Kel","Hannah","Aki","Natalie","Ryan","Sophia","Evelyn","Megan","Nevaeh","Ullah","Moon","Chloe","Mia","Rana","Samora","Amaya","Anna","Ella","Shay","Luca","John","Lee","Rae","Lucas","Ray","Kyle","London","LeBron","Raimy","Harry","Amari","Hailey","Kay","Alexander","Jackson","Matthew","Nino","Noah","Adrian","Hanson","Leo","Max","Reinhart","Kim","Christian","Anthony","Smith","Paris","Akbar","Kaylee","Austin","Morgan","Michael","Abe","Santi","Wyatt","Caleb","Kyzer","Charles","Jayden","Owen","Mason","Adam","Kel","Eliyah","Liam","Nicholas","Elias"};
        Student[][] studentBody = new Student[3][2];
        studentBody[0][0] = new UnderGrad(name[(int)(Math.random() * 100)],major[(int)(Math.random() * 39)], (int)(Math.random() * 60) + 180);
        studentBody[0][1] = new UnderGrad(name[(int)(Math.random() * 100)],major[(int)(Math.random() * 39)], (int)(Math.random() * 60) + 180);
        studentBody[1][0] = new Graduate(name[(int)(Math.random() * 100)],major[(int)(Math.random() * 39)], (int)(Math.random() * 100) + 180);
        studentBody[1][1] = new Graduate(name[(int)(Math.random() * 100)],major[(int)(Math.random() * 39)], (int)(Math.random() * 100) + 180);
        studentBody[2][0] = new PostGraduate(name[(int)(Math.random() * 100)],major[(int)(Math.random() * 39)], (int)(Math.random() * 100) + 180);
        studentBody[2][1] = new PostGraduate(name[(int)(Math.random() * 100)],major[(int)(Math.random() * 39)], (int)(Math.random() * 100) + 180);
        for (int i = 0; i < studentBody.length; i++){
            for(int j = 0; j < studentBody[i].length; j++){
                System.out.println(studentBody[i][j]);
            }
        }
    }
}
