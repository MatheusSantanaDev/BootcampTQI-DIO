package SmartTV;

public class User {
    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();
        
        System.out.println("Tv On? \n" + smartTv.on);
        System.out.println("Current Channel? \n" + smartTv.channel);
        System.out.println("Current Volume? \n" + smartTv.volume);
        
        smartTv.turnOn ();
        System.out.println("New status: Tv On? \n" + smartTv.on);

        smartTv.turnUpVolume();
        smartTv.turnUpVolume();
        smartTv.turnUpVolume();
        smartTv.turnDownVolume();
        smartTv.turnDownVolume();
        smartTv.turnUpVolume();
        System.out.println("New status: Current Volume? \n" + smartTv.volume);

        smartTv.changeChanell(-18);
        System.out.println("New status: Current Channel? \n" + smartTv.channel);
    }
}
