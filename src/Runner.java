public class Runner {
    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");
        Bear pooh = new Bear("Pooh");
        Unicorn rarity = new Unicorn("Rarity");
        Giraffe gemma = new Giraffe("Gemma");
        Bee stinger = new Bee("Stinger");
        Zookeeper zoebot = new Zookeeper("Zoebot");
        Animal[] animals = {gemma, tigger, rarity, stinger};
        zoebot.feedAnimals(animals , "mac and cheese");
    }
}
