import java.util.ArrayList;
//Jack Schmid
public class SuperHeroDriver{
    public static void main(String[] args){
        ArrayList<SuperHero> heroes = new ArrayList<SuperHero>();
        SuperHero Jeff = new AsteroidMan("Red", true);
        Jeff.setName("AsteroidMan");
        SuperHero Carl = new FriedEggMan("Yellow", false);
        Carl.setName("FriedEggMan");
        SuperHero Bob = new RegularManMan("Black", false);
        Bob.setName("RegularManMan");
        heroes.add(Jeff);
        heroes.add(Carl);
        heroes.add(Bob);
        for (SuperHero hero : heroes){
            System.out.print("\n" + hero);
        }
        SuperHero[][] capedHeroes = new SuperHero[3][3];
        int x = 0;
        int y = 0;
        for(SuperHero hero : heroes){
            if (hero.isCaped() == true){
                if (x == 2){
                    x = 0;
                    y++;
                }
                capedHeroes[y][x] = hero;
                x++;
            }
        }
        System.out.println("\n");
        System.out.println("\n");
        for (int i = 0; i < capedHeroes.length; i++){
            for(int j = 0; j < capedHeroes[i].length; j++){
                if(capedHeroes[i][j] == null){
                    
                }else{
                    System.out.println(capedHeroes[i][j]);
                }
            }
        }
    }
}
