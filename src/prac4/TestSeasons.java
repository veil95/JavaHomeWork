package prac4;

public class TestSeasons {
    public static void printSeasonMessage(Seasons season){
        switch(season){
            case winter:
                System.out.println("Я люблю зиму");
                break;
            case summer:
                System.out.println("Я люблю лето");
                break;
            case autumn:
                System.out.println("Я люблю осень");
                break;
            case spring:
                System.out.println("Я люблю весну");
                break;
        }
    }

    
    public static void main(String [] args){
        Seasons FavoriteSeason = Seasons.summer;
        System.out.println("Мое любимое время года - " + FavoriteSeason);
        System.out.println("Средняя температура - " + FavoriteSeason.getAverageTemp());
        System.out.println("Описание: " + FavoriteSeason.getDescription());

        printSeasonMessage(FavoriteSeason);

        for (Seasons season : Seasons.values()){
            System.out.println(season + ", Средняя температура - " + season.getAverageTemp()
            + ", Описание: " + season.getDescription());
        }
    }
}
