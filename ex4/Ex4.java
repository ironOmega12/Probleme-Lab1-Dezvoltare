public class Ex4 {
    
    private int id;

    private Ex4(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Ex4 exemplu = new Ex4(41);

        int tare = exemplu.getId();

        System.out.println(tare);
    }
}