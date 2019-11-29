import java.util.Random;

public class Computer {
    private int[] numbers;

    public Computer(){
        numbers = new int[3];
    }

    public void number_generator(){
        Random rand = new Random();

        for(int i=0;i<numbers.length;++i){
            numbers[i] = rand.nextInt(10);
            if (numbers[i] == 0)
                --i;
        }

    }

    public void compare_number(int[] user_numbers){
        int strike = 0;
        int boll = 0;
        for(int i=0;i<user_numbers.length;++i){
            strike += check_strike(user_numbers[i],i);
            boll += check_boll(user_numbers[i],i);
        }
        if(strike == 0 && boll == 0)
            print_four_boll();
    }

    private int check_strike(int user_number,int index){
        int check = 0;
        if(user_number == numbers[index])
            ++check;
        return check;
    }

    private int check_boll(int user_number,int index){
        int check = 0;
        for(int i=0;i<numbers.length;++i){
            if(i != index && user_number == numbers[i]){
                ++check;
            }
        }

        return check;
    }

    private void print_four_boll(){
        System.out.println("포 ");
    }
}