public class Main {

    public static void main(String[] args)

    {
        var dog = 8.0;
              System.out.println (dog);
        var cat = 3.6;
              System.out.println (cat);
        var paper = 763789;
              System.out.println (paper);

        // Задача 2
        dog = dog + 4;
              System.out.println(dog);
        cat = cat + 4;
              System.out.println(cat);
        paper = paper + 4;
              System.out.println(paper);

        // Задача 3
        dog = dog + 3.5;
              System.out.println(dog);
        cat = cat + 1.6;
              System.out.println(cat);
        paper =  paper + 7639;
              System.out.println(paper);

        // Задача 4
        var friend = 19;
              System.out.println(friend);
        friend = friend + 2;
              System.out.println(friend);
        friend = friend / 7;
              System.out.println(friend);

        // Задача 5
        var frog = 3.5;
               System.out.println(frog);
        frog = frog * 10;
               System.out.println(frog);
        frog = frog / 3.5;
               System.out.println(frog);
        frog = frog + 4;
               System.out.println(frog);

        // Задача 6,7
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;

        var totalWeight = firstBoxer + secondBoxer;
                System.out.println("Общий вес двух бойцов " + totalWeight + " кг");
        var differenceWeight = secondBoxer % firstBoxer;
        differenceWeight = secondBoxer - firstBoxer;
                System.out.println("Разница между весами бойцов " + differenceWeight + " кг");
        // Задача 8
        var totalTime = 640;
        var emploeyeers = 640 / 8;
        System.out.println("Всего работников в компании " + emploeyeers + " человек");
        emploeyeers = emploeyeers + 94;
        totalTime = emploeyeers * 8;
        System.out.println("Если в компании работает " + emploeyeers + " человек, то всего " + totalTime + " часов работы может быть поделено между сотрудниками");
    }
}