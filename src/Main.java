public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossAttacType(" Kinetic");
        boss.setBossHealth(400);
        boss.setBossDamage(50);
        System.out.println(boss.getBossAttacType() + " "
                + boss.getBossHealth() + "  " + boss.getBossDamage());

        for (Hero hero : createHeroes()) {


            System.out.println(hero.getAttackType() + " " + hero.getHealth() + " " + hero.getDamage());
            

        }
    }

    public static Hero[] createHeroes() {


        Hero hero = new Hero(300, 25, " Magical");
        Hero hero1 = new Hero(500, 15);
        Hero hero2 = new Hero(1000, 50, "Physical");
        Hero[] heroes = new Hero[3];
        heroes[0] = hero;
        heroes[1] = hero1;
        heroes[2] = hero2;
        return heroes;
    }
}
