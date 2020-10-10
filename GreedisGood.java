public class GreedisGood {
    public static int greedy(int[] dice){
        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
        for (int i : dice ) {
            if(i == 1)
                one++;
            if(i == 2)
                two++;
            if(i == 3)
                three++;
            if(i == 4)
                four++;
            if(i == 5)
                five++;
            if(i == 6)
                six++;
        }
        System.out.println(one);

        int sum = 0;

        if(six >= 3)
            sum += 600;
        if(five >= 3){
            sum += 500;
            five -= 3;
        }

        if(four >= 3)
            sum += 400;
        if(three >= 3)
            sum += 300;
        if(two >= 3)
            sum += 200;
        if(one >= 3){
            sum += 1000;
            one -=3;
        }
        if(one == 2)
            sum += 200;
        if(one == 1)
            sum += 100;
        if(five == 2)
            sum += 100;
        if(five == 1)
            sum += 50;

        return sum;
    }
}
