
public class Main {
    public static void main(String[] args) {
        perfectNumbers(6);
        perfectNumbers(28);
        perfectNumbers(12);
        perfectNumbers(496);
        perfectNumbers(8128);
        perfectNumbers(18);
    }

        public static void perfectNumbers(int n){
            int summa = 0;
            for(int i = 1; i < n; i++){
                if(n % i == 0){
                    summa+=i;
                }
            }
            if(summa == n){
                System.out.println("Perfect number");
            }else{
                System.out.println("Not a perfect number");
            }
        }
    }
