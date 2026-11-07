public class activity3 {
    public static void main(String[] args) {
        String first="Rob";
        String second="lox";
        String roblox=first+second;
        String robloxTrick="Welcome"+"to"+"Roblox";
        String robloxCaptial=roblox.toUpperCase();
        String robloxSmall = robloxCaptial.toLowerCase();

        int lengthOfRoblox=roblox.length();
        int lengthOfRobloxTrick=robloxTrick.length();
        int sum=lengthOfRoblox+lengthOfRobloxTrick;

        System.out.println(roblox);
        System.out.println(robloxTrick);
        System.out.println(robloxCaptial);
        System.out.println(robloxSmall);
        System.out.println(sum);
    }
}
