//JackSchmid
public class JukeboxGen{
    public static void main(String[] args){        
        String song = "time, issue, year, side, people, kind, way, head, day, house, man, service, thing, friend, woman, father, life, power, child, hour, world, game, school, line, state, end, family, member, student, law, group, car, country, city, problem, community, hand, name, part, president, place, team, case, minute, week, idea, company, kid, system, body, program, information, question, back, work, parent, government, face, number, others, night, level, Mr, office, point, door, home, health, water, person, room, art, mother, war, area, history, money, party, story, result, fact, change, month, morning, lot, reason, right, research, study, girl, book, guy, eye, food, job, moment, word, air, business, teacher";
        String[] betterSong = song.split(", ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                String nameGen = "\"" + betterSong[(int)(Math.random() * 100)] +  " " + betterSong[(int)(Math.random() * 100)] + "\"";
                System.out.println("songList[" + i + "]"  + "[" + j + "] = new MySong(" + nameGen + " , " + ((int)(Math.random() * 9) + ");"));
            }
        }
    }
}
