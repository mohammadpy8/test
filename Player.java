public class Player {
    public static void main(String[] args) {
        Player newPlayer = new Player();
        newPlayer.setName("alireza");
        newPlayer.setAge(10);
        newPlayer.setCity("kerman");
        System.out.println(newPlayer.fullName("seyf"));
        System.out.println(newPlayer.AddressPlayer());
        System.out.println(newPlayer.calcAge(12));
    }
    private int age;
    private String name;
    private  String city;

    public void setAge(int newAge) {
        age = newAge;
    }
    public void setName(String newName) {
        name = newName;
    }
    public void setCity(String newCity) {
        city = newCity;
    }

    public String AddressPlayer() {
        return city + name;
    }
    public String fullName(String last_name) {
        return name + last_name;
    }
    public int calcAge(int num ) {
        return num * age;
    }
}

