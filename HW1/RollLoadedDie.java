public class RollLoadedDie {
    public static void main(String[] args){
        int r;
        double random = Math.random();
        if(random<1.0/8.0) r = 1;
        else if(random<2.0/8.0) r = 2;
        else if(random<3.0/8.0) r = 3;
        else if(random<4.0/8.0) r = 4;
        else if(random<5.0/8.0) r = 5;
        else r = 6;
        System.out.println(r);
    }
}
