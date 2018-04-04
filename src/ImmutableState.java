public class ImmutableState {

    public static void main(String[] args) {
        int x= 1;
        new Runnable(){
            @Override
            public void run() {
                System.out.print(x+"");
                x = 2;
            }
        }.run();
    }
}
