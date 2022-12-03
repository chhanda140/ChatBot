import java.util.Scanner;

public class ChatBotDemo {
    public static void main(String[] args){
        System.out.println("\f");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Hello lets chat : what is your name?");
            System.out.println(">>>");
            String n = sc.nextLine();
            System.out.println("ok " + n + " How are you");

            while(true){
                System.out.println(">>>");
                String s = sc.nextLine();
                s = s.toUpperCase();

                if(s.indexOf("FINE") >= 0){
                    System.out.println("GOOD TO KNOW " +n);
                } else if(s.indexOf("HI") >= 0) {
                    System.out.println("HI" +n);
                } else if(s.indexOf("WEATHER") >= 0 ) {
                    System.out.println("I HAVEN'T CHECKED");
                } else if(s.indexOf("NAME") >= 0) {
                    System.out.println(n+"'s"+" Chatbot");
                }
                else {
                    final int num = 3;
                    double r = Math.random();
                    int whichResponse = (int) (r * num);
                    String response = "";

                    if(whichResponse == 0) {
                        response = "Hmmm.";
                    } else if(whichResponse == 1) {
                        response = "OK...";
                    } else if(whichResponse == 2) {
                        response = "I am not programmed to respond to that";
                    } else if(whichResponse == 3) {
                        response = "I do not know";
                    } 
                    System.out.println(response);
                }
            }
        }




    }
}
